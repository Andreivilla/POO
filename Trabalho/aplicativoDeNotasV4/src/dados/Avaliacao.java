package dados;

public class Avaliacao {
    private String nome;
    private float nota;
    private float peso;
    private String data;
    private String cpf;
    private String codDciplina;
    private int idSemestre;


    //getters
    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public float getNota() {
        return nota;
    }

    public float getPeso() {
        return peso;
    }

    public String getCodDciplina() {
        return codDciplina;
    }


    public String getData() {
        return data;
    }

    public int getIdSemestre() {
        return idSemestre;
    }
    //setters

    public void setIdSemestre(int idSemestre) {
        this.idSemestre = idSemestre;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }



    public void setData(String data) {
        this.data = data;
    }

    public void setCodDciplina(String codDciplina) {
        this.codDciplina = codDciplina;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
}
