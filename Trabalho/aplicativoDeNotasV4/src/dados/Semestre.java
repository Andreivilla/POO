package dados;

public class Semestre {
    private int idSemestre;
    private String nome;

    public Semestre(int id, String nome){
        this.idSemestre = id;
        this.nome = nome;
    }
    public Semestre(){}
    //getters

    public String getNome() {
        return nome;
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

    @Override
    public String toString() {
        return "" + nome;
    }
}
