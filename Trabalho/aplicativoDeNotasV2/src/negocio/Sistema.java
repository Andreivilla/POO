//todas as bibliotecas foram apagadas do envio pois o arquivo zip ficou grande dms para ser enviado
package negocio;

import dados.*;
import exception.DeleteException;
import exception.InsertException;
import exception.SelectException;
import persistencia.*;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Sistema {
    private Aluno alunoLogado = null;

    //login
    public Boolean login(String cpf, String senha){
        try {
            AlunoDAO alunoDAO = AlunoDAO.getInstance();
            Aluno aux = alunoDAO.select(cpf);
            if(aux.getSenha().equals(senha)){
                alunoLogado = aux;
                return true;
            }else{
                return false;
            }
        }catch (ClassNotFoundException | SelectException | SQLException e){
            e.printStackTrace();
        }
        return false;
    }

    public boolean deletarConta(String senha){
        if(alunoLogado.getSenha().equals(senha)) {
            try {
                AlunoDAO alunoDAO = AlunoDAO.getInstance();
                alunoDAO.delete(alunoLogado.getCpf());
                return true;
            } catch (ClassNotFoundException | SelectException | SQLException | DeleteException e) {
                e.printStackTrace();
            }
        }else{
            return false;
        }
        return false;
    }

    public void cadastrarDiciplina(Semestre semestre, Diciplina diciplina){
        try {
            RelacoesDAO relacoesDAO = RelacoesDAO.getInstance();
            Relacao insert = new Relacao(alunoLogado.getCpf(), semestre.getIdSemestre(), diciplina.getCodDiciplina());
            relacoesDAO.insert(insert);
        }catch (ClassNotFoundException | SelectException | SQLException | InsertException e){
            e.printStackTrace();
        }
    }

    public void removerDiciplina(Semestre semestre, Diciplina diciplina){
        try {
            RelacoesDAO relacoesDAO = RelacoesDAO.getInstance();
            Relacao delete = new Relacao(alunoLogado.getCpf(), semestre.getIdSemestre(), diciplina.getCodDiciplina());
            relacoesDAO.delete(delete);
        }catch (ClassNotFoundException | SelectException | SQLException e){
            e.printStackTrace();
        }
    }

    public void cadastrarAvaliacao(Avaliacao avalaiacao){
        try {
            AvaliacaoDAO relacoesDAO = AvaliacaoDAO.getInstance();
            relacoesDAO.insert(avalaiacao);
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }

    public void cadastrarNota(int id, float nota){
        try {
            AvaliacaoDAO avaliacaoDAO = AvaliacaoDAO.getInstance();
            Avaliacao av = avaliacaoDAO.select(id);
            av.setNota(nota);
            avaliacaoDAO.update(av);
        }catch (ClassNotFoundException | SQLException e){
            e.printStackTrace();
        }
    }

    //funcoes para gerar pdf
    public List<ObjetoPdf> gerarObjetosPdf(){
        List<ObjetoPdf> listaPdf = new ArrayList<>();
        List<Relacao> listarelacoes = listarRelacoesDoaluno(alunoLogado.getCpf());
        for(Relacao relacao : listarelacoes){
            ObjetoPdf obj = new ObjetoPdf();
            obj.setMedia(mediaFinal(relacao.getCodDiciplina()));
            obj.setMediaExame(mediaExame(relacao.getCodDiciplina()));
            try {
                DiciplinaDAO diciplinaDAO = DiciplinaDAO.getInstance();
                obj.setDiciplinaNome(diciplinaDAO.select(relacao.getCodDiciplina()).getNome());
            } catch (SQLException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            try {
                SemestreDAO semestreDAO = SemestreDAO.getInstance();
                obj.setSemestreNome(semestreDAO.select(relacao.getIdSemestre()).getNome());
            } catch (SQLException | SelectException | ClassNotFoundException e) {
                e.printStackTrace();
            }
            listaPdf.add(obj);
        }
        return listaPdf;
    }

    public float mediaFinal(String codDiciplina){
        try {
            AvaliacaoDAO avaliacaoDAO = AvaliacaoDAO.getInstance();
            List<Avaliacao> listaAvaliacao = avaliacaoDAO.listaAvaliacao(alunoLogado.getCpf(), codDiciplina);
            float somaNota = 0;
            float somaPeso = 0;
            for(Avaliacao ava : listaAvaliacao){
                somaPeso += ava.getPeso();
                somaNota += ava.getNota();
            }
            return somaNota/somaPeso;
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public float mediaExame(String codDiciplina){
        float mediaFinal = mediaFinal(codDiciplina);
        if(mediaFinal > 1.7 && mediaFinal < 7){
            return (float) (-1.5*mediaFinal + 12.5);
        }
        return 0;
    }

    public List<Relacao> listarRelacoesDoaluno(String cpf){
        try{
            RelacoesDAO relacoesDAO = RelacoesDAO.getInstance();
            List<Relacao> lista = relacoesDAO.selectPorCPF(cpf);
            return lista;
        }catch (ClassNotFoundException | SQLException | SelectException e){
            e.printStackTrace();
        }
        return null;
    }

    public void gerarPdf(){
        GeradorPdf geradorPdf = new GeradorPdf();
        geradorPdf.gerarTabela(alunoLogado, gerarObjetosPdf());
    }

    //getters
    public Aluno getAlunoLogado() {
        return alunoLogado;
    }

    //setters

    public void setAlunoLogado(Aluno alunoLogado) {
        this.alunoLogado = alunoLogado;
    }


}