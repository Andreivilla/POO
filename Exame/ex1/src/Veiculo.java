public class Veiculo implements ITaxavel{
    private String placa;
    private int ano;
    private double preco;

    public Veiculo(){

    }
    public Veiculo(String placa, int ano, double preco){
        this.placa = placa;
        this.ano = ano;
        this.preco = preco;
    }


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
        double precocomImposto = preco + calcularImposto();
        return "Tipo veiculo:\n" +
                "Placa: " + placa +
                "\nAno: " + ano +
                "\nPreco sem imposto: " + preco +
                "\nImposto: " + calcularImposto() +
                "\nPreco com imposto: " + precocomImposto;
    }
}
