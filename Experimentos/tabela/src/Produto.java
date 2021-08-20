public class Produto {
    private String nome;
    private float preco;

    Produto(String nome, float preco){
        this.nome = nome;
        this.preco = preco;
    }

    //getters
    public String getNome() {
        return nome;
    }
    public float getPreco() {
        return preco;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
}
