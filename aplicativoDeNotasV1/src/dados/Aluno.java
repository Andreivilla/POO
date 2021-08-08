package dados;

public class Aluno {
    private String cpf;
    private String name;
    private String senha;

    //getters
    public String getCpf() {
        return cpf;
    }

    public String getSenha() {
        return senha;
    }

    public String getName() {
        return name;
    }
    //setters

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "cpf='" + cpf + '\'' +
                ", name='" + name + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
