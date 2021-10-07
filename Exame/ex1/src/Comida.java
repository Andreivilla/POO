public class Comida implements ITaxavel{
    private String nome;
    private double valor;

    public Comida(){

    }
    public Comida(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }

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
        double precocomImposto = valor + calcularImposto();
        return "Tipo: comida\n" +
                "Nome: " + nome +
                "\nPreco sem imposto: " + valor +
                "\nImposto: " + calcularImposto() +
                "\nPreco com imposto: " + precocomImposto;
    }
}
