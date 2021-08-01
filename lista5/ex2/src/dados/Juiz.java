package dados;

public class Juiz {
    private String nome;
    private int limite;
    private Pilha<Processo> pilhaProcessos;

    public Juiz(int limite){
        this.limite = limite;
        this.pilhaProcessos = new Pilha<>(limite);
    }

    public void cadastrarProcesso(Processo processo){
        this.pilhaProcessos.insere(processo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pilha<Processo> getPilhaProcessos() {
        return pilhaProcessos;
    }

    public int getLimite() {
        return limite;
    }
}
