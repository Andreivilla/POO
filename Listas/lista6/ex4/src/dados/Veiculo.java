package dados;

public class Veiculo {
    private double valorInicial = 0;
    private double cor=0, motor=0, ventilacao=0;
    public Veiculo(double valorInicial){
        this.valorInicial = valorInicial;
    }

    public double calculaValorCor(CorLataria tipo){
        this.cor =  tipo.getCor().calculaVAlor();
        return this.cor;
    }

    public double calculaFatorMotor(PotenciaMotor tipo){
        this.motor = tipo.getMotor().calculaFatorMotor() * this.valorInicial;
        return this.motor;
    }
    public double calculaValorVentilacao(TipoVentilacao tipo){
        this.ventilacao = tipo.getVentilacao().calculaValorVEntilacao();
        return this.ventilacao;
    }
    public double calculaTotal(){
        return this.valorInicial + this.cor + this.motor + this.ventilacao;
    }

    //getters
    public double getValorInicial() {
        return valorInicial;
    }
    //setters
    public void setValorInicial(double valorIniucial) {
        this.valorInicial = valorIniucial;
    }
}
