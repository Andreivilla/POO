package dados;

public class Funcionario extends Pessoa{
    private int idFuncionario;
    private float salario;
    private int horasTrabalho;

    //construtores
    //construtor vazio
    public Funcionario(){}
    public Funcionario(String nome, String cpf, int idFuncionario, Float salario, int horasTrabalho){
        super(nome, cpf);
        this.setIdFuncionario(idFuncionario);
        this.setSalario(salario);
        this.setHorasTrabalho(horasTrabalho);
    }


    //getters
    @Override
    public String getCpf() {
        return super.getCpf();
    }
    @Override
    public String getNome() {
        return super.getNome();
    }
    public float getSalario() {
        return salario;
    }
    public int getHorasTrabalho() {
        return horasTrabalho;
    }
    public int getIdFuncionario() {
        return idFuncionario;
    }

    //setters
    public void setSalario(float salario) {
        this.salario = salario;
    }
    @Override
    public void setCpf(String cpf) {
        super.setCpf(cpf);
    }
    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }
    public void setHorasTrabalho(int horasTrabalho) {
        this.horasTrabalho = horasTrabalho;
    }
    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }
    @Override
    public String toString(){
        return "Nome: " + this.getNome() + "\nCPF: " + this.getCpf() + "ID do funcionario: " + this.getIdFuncionario() + "Salario: " + this.getSalario() + "Horas de trabalho: " + this.getHorasTrabalho();
    }

    //@Override
    public Boolean equals(Funcionario verif){
        if(verif != null) {
            return false;
        }
        if(!this.getNome().equals(verif)) {
            return false;
        }
        if(this.getCpf() != verif.getCpf()){
            return false;
        }
        if(this.getSalario() != verif.getSalario()){
            return false;
        }
        if(this.getHorasTrabalho() != verif.getHorasTrabalho()){
            return false;
        }
        if(this.getIdFuncionario() != verif.getIdFuncionario()){
            return false;
        }
        return true;
    }

}
