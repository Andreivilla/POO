package dados;

public abstract class Animal {
    String nome;
    public String emitirSom(){
        return "";
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}
