package dados;

public class Relacao {
    private String cpf;
    private int idSemestre;
    private String codDiciplina;

     public Relacao(String cpf, int idSemestre, String codDiciplina){
         this.cpf = cpf;
         this.idSemestre = idSemestre;
         this.codDiciplina = codDiciplina;
     }
     public Relacao(){

     }

    //getters
    public String getCodDiciplina() {
        return codDiciplina;
    }

    public String getCpf() {
        return cpf;
    }

    public int getIdSemestre() {
        return idSemestre;
    }

    //setters
    public void setCodDiciplina(String codDiciplina) {
        this.codDiciplina = codDiciplina;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setIdSemestre(int idSemestre) {
        this.idSemestre = idSemestre;
    }
}
