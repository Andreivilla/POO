package dados;

public class Pessoa {
    private String nome;
    private String cpf;

    //construtores
    //construtor vazio
    public Pessoa(){}
    public Pessoa(String nome, String cpf){
        this.setNome(nome);
        this.setCpf(cpf);
    }



    //getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString(){
        return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf();
    }

    public Boolean equals(Pessoa verif){
        if(verif != null) {
            return false;
        }
        if(!this.getNome().equals(verif)) {
            return false;
        }
        if(this.getCpf() != verif.getCpf()){
            return false;
        }
        return true;
    }
}
