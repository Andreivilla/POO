package dados;

public class Semestre {
    private int idSemestre;
    private String nome;

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
}
