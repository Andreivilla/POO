package dados;

public class Diciplina {
    private String codDiciplina;
    private String nome;

    //getters
    public String getNome() {
        return nome;
    }

    public String getCodDiciplina() {
        return codDiciplina;
    }

    //setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodDiciplina(String codDiciplina) {
        this.codDiciplina = codDiciplina;
    }
}
