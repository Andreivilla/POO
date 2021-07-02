package Dados;

import java.util.HashMap;
import java.util.Map;

public class Semestre {
    private int idSemestre;
    private String nome;
    private Map<Integer, Diciplina> diciplinas = new HashMap<>();

    public void cadastrarDiciplina(Diciplina add){
        diciplinas.put(add.getIdDiciplina(), add);
    }

    public int getDiciplinasSize(){
        return  this.diciplinas.size();
    }

    @Override
    public String toString(){
        return "ID semestre: " + this.idSemestre + "\t" + "Nome: " + this.nome;
    }


    //getters
    public String getNome() {
        return nome;
    }
    public Map<Integer, Diciplina> getDiciplinas() {
        return diciplinas;
    }
    public int getIdSemestre() {
        return idSemestre;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdSemestre(int idSemestre) {
        this.idSemestre = idSemestre;
    }
}