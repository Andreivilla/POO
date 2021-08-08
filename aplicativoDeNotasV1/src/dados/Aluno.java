package dados;

public class Aluno {
    private String cpf;
    private String nome;
    private String senha;

    //getters
    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public String getNome() {
        return nome;
    }
    //setters

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    @Override
    public String toString() {
        return "Aluno{" +
                "cpf='" + cpf + '\'' +
                ", name='" + nome + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
