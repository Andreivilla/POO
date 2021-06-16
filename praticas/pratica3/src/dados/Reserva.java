package dados;

public class Reserva {
    private int numReserva;
    private String dataVoo;
    private String horaVoo;
    private float preco;
    private String classeVoo;
    private boolean idaEvolta;
    private int poltrona;

    //get
    public float getPreco() {
        return preco;
    }

    public int getNumReserva() {
        return numReserva;
    }

    public int getPoltrona() {
        return poltrona;
    }

    public String getClasseVoo() {
        return classeVoo;
    }

    public String getDataVoo() {
        return dataVoo;
    }

    public String getHoraVoo() {
        return horaVoo;
    }

    //set
    public void setClasseVoo(String classeVoo) {
        this.classeVoo = classeVoo;
    }

    public void setDataVoo(String dataVoo) {
        this.dataVoo = dataVoo;
    }

    public void setHoraVoo(String horaVoo) {
        this.horaVoo = horaVoo;
    }

    public void setIdaEvolta(boolean idaEvolta) {
        this.idaEvolta = idaEvolta;
    }

    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }

    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String toString(){
        return "Numero Reserva: "+this.numReserva+"\nData voo: "+this.dataVoo+"\nHora voo: "+this.horaVoo+"\nPreco: "+this.preco+"\nClasse voo: "+this.classeVoo+"\nIda e volta: "+this.idaEvolta+"\nPoltrona: "+this.poltrona;
    }
}
