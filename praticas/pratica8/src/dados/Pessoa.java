package dados;

import java.util.Objects;

public class Pessoa {
    private String nome;
    private int idade;
    private float massa;
    private float altura;

    @Override
    public boolean equals(Object o) {
        Pessoa p = (Pessoa) o;

        if(this.getNome() == p.nome){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", massa=" + massa +
                ", altura=" + altura +
                '}';
    }

    //getters
    public float getAltura() {
        return altura;
    }
    public float getMassa() {
        return massa;
    }
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    //setters
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setMassa(float massa) {
        this.massa = massa;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}