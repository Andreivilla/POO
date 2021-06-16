package dados;

public class Cliente {
    private int cpf;
    private String nome;
    private String endereco;
    private int telefone;
    private Reserva reservas[] = new Reserva[20];
    private int qtdReservas = 0;

    //get
    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public int getTelefone() {
        return telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    //set

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String toString(){
        return "CPF: "+this.cpf+"\nNome: "+this.nome+"\nEndereço: "+this.endereco+"\nTelefone: "+this.telefone;
    }



    public void reservaIda(Reserva reserva){
        this.reservas[this.qtdReservas] = reserva;
        this.qtdReservas++;
    }

    public void reservaVolta(Reserva ida, Reserva volta){
        ida.setIdaEvolta(true);
        this.reservas[this.qtdReservas] = volta;
        this.qtdReservas++;
    }


}
