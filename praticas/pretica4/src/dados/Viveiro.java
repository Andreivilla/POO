package dados;

public class Viveiro {
    protected String nome;
    protected float comprimento;
    protected float largura;
    private static Animal[] animais = new Animal[20];
    int qtdAnimal=0;

    public float calculaEspaco(){
        return this.comprimento*this.largura;
    }
    private static float espacoOcupado(){
        float espacoOcupado = 0;
        for(Animal animal: animais){
            espacoOcupado += animal.calculaEspacoOcupado();
        }
        return espacoOcupado;
    }
    public float calculaDisponivel(){
        return this.calculaEspaco() - espacoOcupado();
    }
    public boolean adicionarAnimal(Animal animal, Viveiro viveiro){
        if(this.calculaDisponivel() > animal.calculaEspacoOcupado()*0.7) {
            animais[qtdAnimal] = animal;
            qtdAnimal++;
            return true;
        }else {
            return false;
        }
    }

    //gets
    public float getLargura() {
        return largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public String getNome() {
        return nome;
    }

    //set

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}
