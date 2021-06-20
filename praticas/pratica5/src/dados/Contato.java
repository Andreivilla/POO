package dados;

public class Contato {
    private String nome;
    private int telefone;

    //setts
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    //getts
    public String getNome() {
        return nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public String toString(){
         return "nome: " + getNome() + "\nTelefone: " + getTelefone();
    }
}
