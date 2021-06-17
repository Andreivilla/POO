package dados;

public class Aquario extends Viveiro{
    private static Peixe[] peixes = new Peixe[20];
    private float altura;
    private float temperatura;

    public float calculaEspaco(){
        return this.comprimento*this.altura*this.largura;
    }

    public boolean adicionarAnimal(Peixe animal, Viveiro viveiro){
        if(this.calculaDisponivel() > animal.calculaEspacoOcupado()*0.7) {
            peixes[qtdAnimal] = animal;
            qtdAnimal++;
            return true;
        }else {
            return false;
        }
    }

    //gets
    public float getAltura() {
        return altura;
    }

    public float getTemperatura() {
        return temperatura;
    }

    //sets
    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setTemperatura(float temperatura) {
        this.temperatura = temperatura;
    }
}