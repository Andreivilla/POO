package dados;

public class Cidade {
    private String nome;
    private String estado;

    //get
    public String getNome() {
        return nome;
    }

    public String getEstado() {
        return estado;
    }

    //set
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString(){
        return this.nome + "(" + this.estado + ")";
    }
}
