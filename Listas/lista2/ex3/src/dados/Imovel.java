package dados;

public class Imovel {
    private float largura;
    private float comprimento;
    private float valor;

    //getters
    public float getComprimento() {
        return comprimento;
    }
    public float getLargura() {
        return largura;
    }
    public float getValor() {
        return valor;
    }

    //setters
    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }
    public void setLargura(float largura) {
        this.largura = largura;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }

    @Override
    public String toString(){
        return "Largura: " + this.getLargura() + "\nComprimento: "+ this.getComprimento() + "\nValor: " + this.getValor();
    }

    public float areaTotal(){
        return this.getComprimento() * this.getLargura();
    }
}
