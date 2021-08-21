package dados;

public class Diciplina {
    private String codDiciplina;
    private String nome;
    private String cpfProfessor;


    //getters
    public String getNome() {
        return nome;
    }

    public String getCodDiciplina() {
        return codDiciplina;
    }

    public String getCpfProfessor() {
        return cpfProfessor;
    }

    //setter
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodDiciplina(String codDiciplina) {
        this.codDiciplina = codDiciplina;
    }

    public void setCpfProfessor(String cpfProfessor) {
        this.cpfProfessor = cpfProfessor;
    }
}
