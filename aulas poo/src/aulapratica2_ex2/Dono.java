package aulapratica2_ex2;

public class Dono {
    String nome;
    Endereco endereco;
    int cpf;

    public String getNome() {
        return nome;
    }
    public Endereco getEndereco() {
        return endereco;
    }
    public int getCpf() {
        return cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
