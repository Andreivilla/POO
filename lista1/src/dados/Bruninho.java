package dados;

public class Bruninho {
    private String nome;
    private String especie;

    public Bruninho(String nome, String especie){
        this.nome = nome;
        this.especie = especie;
    }
    public Bruninho(){

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getEspecie() {
        return especie;
    }
}
