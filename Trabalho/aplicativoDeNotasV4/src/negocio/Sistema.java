package negocio;

import dados.Aluno;
import dados.Professor;
import dados.Semestre;
import exception.SelectException;
import persistencia.AlunoDAO;
import persistencia.ProfessorDAO;
import persistencia.RelacoesDAO;

import java.sql.SQLException;
import java.util.List;

public class Sistema {
    private String cpfLogado;
    private int tipoLogin;

    //funcoes de login
    public boolean loginAluno(String cpf, String senha){
        try {
            AlunoDAO alunoDAO = AlunoDAO.getInstance();
            Aluno aux = alunoDAO.select(cpf);
            if(aux.getSenha().equals(senha)) {
                return true;
            }else{
                return false;
            }
        } catch (SQLException | SelectException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean loginProfessor(String cpf, String senha){
        try {
            ProfessorDAO professorDAO = ProfessorDAO.getInstance();
            Professor aux = professorDAO.select(cpf);
            if(aux.getSenha().equals(senha)) {
                return true;
            }else{
                return false;
            }
        } catch (SQLException | SelectException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    //AlunoPrincipal


    //tabela de semestres

    public List<Semestre> listaSemestre(){
        try {
            RelacoesDAO relacoesDAO = RelacoesDAO.getInstance();
            return relacoesDAO.selectSemestres(cpfLogado);
        } catch (SQLException | SelectException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return null;
    }

    public void cadastrarSemestre(int id){
        try{
            RelacoesDAO relacoesDAO = RelacoesDAO.getInstance();
            relacoesDAO.cadastrarSemestre(cpfLogado, id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (SelectException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public void deletarSemestre(int id){
        try {
            RelacoesDAO relacoesDAO = RelacoesDAO.getInstance();
            relacoesDAO.deletarSemestre(cpfLogado, id);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (SelectException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }






    //getters
    public String getCpfLogado() {
        return cpfLogado;
    }

    public int getTipoLogin() {
        return tipoLogin;
    }

    //setters
    public void setCpfLogado(String cpfLogado) {
        this.cpfLogado = cpfLogado;
    }

    public void setTipoLogin(int tipoLogin) {
        this.tipoLogin = tipoLogin;
    }
}
