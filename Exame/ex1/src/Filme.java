public class Filme implements ITaxavel{
    private String nome;
    private int duracao;
    private double preco;

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
        return "Tipo: filme \n" +
                "Nome: '" + nome +
                "\nDracao :" + duracao +
                "\nPreco: " + preco + calcularImposto();
    }
}
