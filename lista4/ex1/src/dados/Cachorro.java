package dados;

public class Cachorro extends Animal{
    String nome;

    public String emitirSom(){
        return "AU AU";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
