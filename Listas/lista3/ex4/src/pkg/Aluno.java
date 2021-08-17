package pkg;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private  int idade;
    private double[] notas = new double[5];



    //getters
    public int getIdade() {
        return idade;
    }
    public String getNome() {
        return nome;
    }
    public double[] getNotas() {
        return notas;
    }

    //setters
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public double calcularMedia(){
        double somatorio=0;
        for(double nota : this.notas){
            somatorio += nota;
        }
        return somatorio/5;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Nome: ");
        str.append(this.nome);
        str.append("Idade: ");
        str.append(this.idade);
        for(int i=0; i<5; i++){
            str.append("Nota ");
            str.append(i+1);
            str.append(": ");
            str.append(this.notas[i]);
        }
        str.append("Media: ");
        str.append(calcularMedia());
        return str.toString();
    }

    @Override
    public int compareTo(Aluno o) {
        if(calcularMedia()<o.calcularMedia()){
            return -1;
        }else if(calcularMedia()>o.calcularMedia()){
            return 1;
        }else {
            return 0;
        }
    }
}
