package dados;

public class Avaliacao {
    private int idAvaliacao;
    private String nome;
    private float nota;
    private float peso;
    private String data;
    private String cpf;
    private String codDciplina;


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
    public int getIdAvaliacao() {
        return idAvaliacao;
    }

    public String getData() {
        return data;
    }

    //setters

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
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
