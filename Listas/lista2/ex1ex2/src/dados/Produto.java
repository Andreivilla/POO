package dados;

public class Produto {
    String nome;
    float preco;
    int idProduto;

    //construtores
    //construtor vazio
    public Produto(){}
    public Produto(String nome, float preco, int idProduto){
        this.setIdProduto(idProduto);
        this.setNome(nome);
        this.setPreco(preco);
    }

    //getter
    public String getNome() {
        return nome;
    }
    public float getPreco() {
        return preco;
    }
    public int getIdProduto() {
        return idProduto;
    }
    //setter
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }
    @Override
    public String toString(){
        return "ID produto: " + this.getIdProduto() + "\nNome: " + this.getNome() + "Preco: " + this.getPreco();
    }

    public boolean equals(Produto verif){
        if(verif == null){
            return false;
        }
        if(this.getIdProduto() != verif.getIdProduto()){
            return false;
        }
        if(this.getNome() != verif.getNome()){
            return false;
        }
        if(this.getPreco() != verif.getPreco()){
            return false;
        }
        return true;

    }
}
