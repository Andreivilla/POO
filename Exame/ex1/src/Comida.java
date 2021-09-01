public class Comida implements ITaxavel{
    private String nome;
    private double valor;

    @Override
    public double calcularImposto() {
        return 0.15*this.valor;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public double getValor() {
        return valor;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Tipo: comida\n" +
                "Nome: " + nome +
                "\nPreco: " + valor + calcularImposto();
    }
}
