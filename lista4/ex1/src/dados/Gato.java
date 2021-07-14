package dados;

public class Gato extends Animal{
    String nome;

    public String emitirSom(){
        return "MIAU MIAU";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
