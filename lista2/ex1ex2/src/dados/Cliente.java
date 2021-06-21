package dados;

public class Cliente extends Pessoa{
    private int idCliente;
    private float credito;
    private String endereco;

    //construtores
    //construtor vazio
    public Cliente(){}
    public Cliente(String nome, String cpf, int idCliente, Float credito, String endereco){
        super(nome, cpf);
        this.setIdCliente(idCliente);
        this.setEndereco(endereco);
        this.setCredito(credito);
    }

    //getters
    @Override
    public String getNome() {
        return super.getNome();
    }
    @Override
    public String getCpf() {
        return super.getCpf();
    }
    public String getEndereco() {
        return endereco;
    }
    public float getCredito() {
        return credito;
    }
    public int getIdCliente() {
        return idCliente;
    }

    //setters
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public void setCredito(float credito) {
        this.credito = credito;
    }
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "\nidCliente:" + this.getIdCliente() + "\nCredito: " + getCredito() + "\nendereco: " + getEndereco();
    }

    public boolean equals(Cliente verif){
        if(verif != null) {
            return false;
        }
        if(!this.getNome().equals(verif)) {
            return false;
        }
        if(this.getCpf() != verif.getCpf()){
            return false;
        }
        if(!this.getEndereco().equals(verif)){
            return false;
        }
        if(this.getCredito() != verif.getCredito()){
            return false;
        }
        if(this.getIdCliente() != verif.getIdCliente()){
            return false;
        }
        return true;
    }


}