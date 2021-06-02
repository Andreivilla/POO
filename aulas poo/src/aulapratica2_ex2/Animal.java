package aulapratica2_ex2;

public class Animal {
    String nome;
    Dono dono;
    String especie;
    String Descricao;

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public String getNome() {
        return nome;
    }
    public String getEspecie() {
        return especie;
    }
    public Dono getDono() {
        return dono;
    }
    public String getDescricao() {
        return Descricao;
    }
}
