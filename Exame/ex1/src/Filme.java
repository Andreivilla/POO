public class Filme implements ITaxavel{
    private String nome;
    private int duracao;
    private double preco;

    public Filme(){

    }
    public Filme(String nome, int duracao, double preco){
        this.nome = nome;
        this.duracao = duracao;
        this.preco = preco;

    }

    @Override
    public double calcularImposto() {
        return 0.015*duracao;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public int getDuracao() {
        return duracao;
    }

    public double getPreco() {
        return preco;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        double precocomImposto = preco + calcularImposto();
        return "Tipo: filme \n" +
                "Nome: " + nome +
                "\nDracao: " + duracao +
                "\nPreco sem imposto: " + preco +
                "\nImposto: " + calcularImposto() +
                "\nPreco com imposto: " + precocomImposto;
    }
}
