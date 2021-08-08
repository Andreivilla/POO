package negocio;

import dados.*;
import exception.DeleteException;
import exception.InsertException;
import exception.SelectException;
import persistencia.*;


import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

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

    //getters
    public Aluno getAlunoLogado() {
        return alunoLogado;
    }

    //setters

    public void setAlunoLogado(Aluno alunoLogado) {
        this.alunoLogado = alunoLogado;
    }


}