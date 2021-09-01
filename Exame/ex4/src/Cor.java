import java.util.Objects;

public class Cor {
    private int R;
    private int G;
    private int B;
    private String nome;

    public Cor(String nome, int r, int g, int b){
        this.R = r;
        this.G = g;
        this.B = b;
        this.nome = nome;
    }
    public Cor(){

    }

    //@Override
    public boolean equals(Cor o) {
        if(this.B != o.getB() || this.G != o.getG() || this.R != o.getR()){
            return false;
        }else {
            return true;
        }
    }


    //getters
    public String getNome() {
        return nome;
    }
    public int getB() {
        return B;
    }
    public int getG() {
        return G;
    }
    public int getR() {
        return R;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setB(int b) {
        B = b;
    }
    public void setG(int g) {
        G = g;
    }
    public void setR(int r) {
        R = r;
    }
}