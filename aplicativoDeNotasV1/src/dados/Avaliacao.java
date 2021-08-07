package dados;

public class Avaliacao {
    private int idAvaliacao;
    private String nome;
    private double nota;
    private double peso;
    private String data;

    public String toString(){
        return nome + " " + nota + " " + peso + " " +  data;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public double getPeso() {
        return peso;
    }
    public double getNota() {
        return nota;
    }
    public int getIdAvaliacao() {
        return idAvaliacao;
    }
    public String getData() {
        return data;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public void setData(String data) {
        this.data = data;
    }
    public void setIdAvaliacao(int idAvaliacao) {
        this.idAvaliacao = idAvaliacao;
    }
    public void setNota(double nota) {
        this.nota = nota;
    }
}
