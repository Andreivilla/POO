package dados;

public class Pessoa {
    private String nome;
    private long cpf;

    public String toString(){
        return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf();
    }

    //getters
    public String getNome() {
        return nome;
    }
    public long getCpf() {
        return cpf;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(long cpf) {
        this.cpf = cpf;
    }
}