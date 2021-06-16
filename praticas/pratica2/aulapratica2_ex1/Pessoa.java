package aulapratica2_ex1;

public class Pessoa{
    int idade;
    double altura;
    double peso;

    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getIdade() {
        return idade;
    }
    public double getAltura() {
        return altura;
    }
    public double getPeso() {
        return peso;
    }

    public double getImc(){
        return (double)this.altura/Math.pow(this.peso, 2);
    }
}
