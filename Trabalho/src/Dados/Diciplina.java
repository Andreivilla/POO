package Dados;
import java.util.HashMap;
import java.util.Map;

public class Diciplina {
    private int idDiciplina;
    private String nome;
    private Map<Integer, Avaliacao> avaliacoes = new HashMap<>();


    public double mediaFinal(){
        double somaNotas = 0;
        for(Avaliacao avaliacao : this.avaliacoes.values()){
            somaNotas += avaliacao.getNota();
        }
        return somaNotas / this.avaliacoes.size();
    }

    public double mediaExame(){
        double mediaFinal = mediaFinal();
        if(mediaFinal > 1.7 && mediaFinal < 7){
            return -1.5*mediaFinal + 12.5;
        }
        return 0;
    }


    public void cadastrarAvaliacao(Avaliacao add){
        this.avaliacoes.put(add.getIdAvaliacao(), add);

    }

    //getters
    public String getNome() {
        return nome;
    }
    public Map<Integer, Avaliacao> getAvaliacoes() {
        return avaliacoes;
    }
    public int getIdDiciplina() {
        return idDiciplina;
    }
    //setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setAvaliacoes(Map<Integer, Avaliacao> avaliacoes) {
        this.avaliacoes = avaliacoes;
    }
    public void setIdDiciplina(int idDiciplina) {
        this.idDiciplina = idDiciplina;
    }
}
