package aulapratica2_ex2;

public class Veterinario {
    String nome;
    Double salario;
    Endereco endereco;
    int qualtidadeanimais = 0;
    Animal[] animais = new Animal[qualtidadeanimais];

    public Endereco getEndereco() {
        return endereco;
    }
    public String getNome() {
        return nome;
    }
    public Animal[] getAnimais() {
        return animais;
    }
    public Double getSalario() {
        return salario;
    }
    public int getQualtidadeanimais() {
        return qualtidadeanimais;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAnimais(Animal[] animais) {
        this.animais = animais;
    }
    public void setQualtidadeanimais(int qualtidadeanimais) {
        this.qualtidadeanimais = qualtidadeanimais;
    }
    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
