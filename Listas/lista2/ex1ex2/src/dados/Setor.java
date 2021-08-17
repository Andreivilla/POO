package dados;

public class Setor{
    int idSetor;
    String nome;
    Funcionario[] funcionarios = new Funcionario[20];
    Produto[] produtos = new  Produto[20];

    //construtores
    //construtor vazio
    public Setor(){}
    //contrutor com 2 parametros
    public Setor(int idSetor, String nome){
        this.setIdSetor(idSetor);
        this.setNome(nome);
    }
    //construtor com 4 parametros
    public Setor(int idSetor, String nome, Funcionario[] funcionarios, Produto[] produtos){
        this.setIdSetor(idSetor);
        this.setNome(nome);
        this.setFuncionarios(funcionarios);
        this.setProdutos(produtos);
    }

    //getter
    public int getIdSetor() {
        return idSetor;
    }
    public String getNome() {
        return nome;
    }
    public Funcionario[] getFuncionarios() {
        return funcionarios;
    }
    public Produto[] getProdutos() {
        return produtos;
    }

    //setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setFuncionarios(Funcionario[] funcionarios) {
        this.funcionarios = funcionarios;
    }
    public void setIdSetor(int idSetor) {
        this.idSetor = idSetor;
    }
    public void setProdutos(Produto[] produtos) {
        this.produtos = produtos;
    }

}
