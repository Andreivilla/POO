package dados;

public class Pessoa {
    private int  idPessoa;
    private String cpf;
    private int idade;
    private String nome;
    private String cidade;


    public  Pessoa(int  idPessoa, String cpf, int idade, String nome, String cidade){
        this.idPessoa = idPessoa;
        this.cpf = cpf;
        this.idade = idade;
        this.nome = nome;
        this.cidade = cidade;
    }
    public Pessoa(){}
    //getters
    public String getCpf() {
        return cpf;
    }
    public String getNome() {
        return nome;
    }
    public int getIdade() {
        return idade;
    }
    public String getCidade() {
        return cidade;
    }
    public int getIdPessoa() {
        return idPessoa;
    }

    //setters
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }


    @Override
    public String toString(){
        return "- " + getNome() + ", " + getIdade() + ", " +  getCpf() + ", " + getCidade() + ";";
    }
}
