public class Veiculo implements ITaxavel{
    private String placa;
    private int ano;
    private double preco;

    @Override
    public double calcularImposto() {
        if(ano < 2000)
            return 250;
        else
            return 450;
    }

    //getters
    public int getAno() {
        return ano;
    }
    public String getPlaca() {
        return placa;
    }

    public double getPreco() {
        return preco;
    }

    //setters
    public void setAno(int ano) {
        this.ano = ano;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Tipo veiculo:\n" +
                "Placa='" + placa +
                "\nAno=" + ano +
                "\nPreco=" + preco + calcularImposto();
    }
}
