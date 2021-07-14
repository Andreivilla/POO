package dados;

public class Vaca extends  Animal{
    String nome;

    public String emitirSom(){
        return "MUUUUUU";
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
