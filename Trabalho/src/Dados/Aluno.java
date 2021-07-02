package Dados;

import java.util.HashMap;
import java.util.Map;

public class Aluno {
    private String senha;
    private String nome;
    private long cpf;
    private Map<Integer, Semestre> semestres = new HashMap<>();

    //SEMESTRE
    public void cadastrarSemestre(Semestre add){
        this.semestres.put(add.getIdSemestre(), add);
    }
    public void removerSemestre(int chave){
        this.semestres.remove(chave);
    }
    public int getSemestresSize(){
        return semestres.size();
    }

    //getters
    public String getNome() {
        return nome;
    }
    public long getCpf() {
        return cpf;
    }
    public String getSenha() {
        return senha;
    }
    public Map<Integer, Semestre> getSemestres() {
        return semestres;
    }


    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString(){
        return "Nome: " + getNome() + "\nCpf: " + getCpf();
    }

}
