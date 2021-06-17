package dados;

public class Animal {
    private String nome;
    private String cor;
    private String especie;
    int idade;
    protected static float largura;
    protected static float comprimento;
    protected static float altura;

    public float calculaEspacoOcupado(){
        return largura*comprimento;
    }

    //gets
    public float getAltura() {
        return altura;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public float getComprimento() {
        return comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public String getCor() {
        return cor;
    }

    //sets

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }
}
