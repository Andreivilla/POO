package dados;

public class Pessoa {
    int idPessoa;
    String nome;
    int idade;

    public int getIdPessoa() {
        return idPessoa;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "idPessoa=" + idPessoa +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }
}
