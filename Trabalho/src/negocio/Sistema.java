package negocio;

import dados.*;


import java.util.HashMap;
import java.util.Map;

public class Sistema {
    private Map<Long, Aluno> alunos = new HashMap<>();
    private Aluno alunoLogado=null;
    private long alunoKey=-1;
    private Semestre semestreaux;
    private int semestrekey=-1;
    private Diciplina diciplinaAux=null;
    private int dicipliankey=-1;


    //Remover
    public void removeSemestre(int chave){
        this.alunoLogado.removerSemestre(chave);
    }
    public void removeDiciplina(int chave){
        semestreaux.removeDiciplina(chave);
    }
    public void removeAvaliacao(int chave){
        diciplinaAux.removeAvaliacao(chave);
    }

    //cadastrar
    public void cadastrarAluno(Aluno cadastra){
        this.alunos.put(cadastra.getCpf(), cadastra);
    }
    public void cadastrarSemestre(Semestre add){
        add.setIdSemestre(this.alunoLogado.getSemestresSize()+1);
        this.alunoLogado.cadastrarSemestre(add);
        atualizarAluno();
    }
    public void cadastrarDiciplina(Diciplina add){
        add.setIdDiciplina(semestreaux.getDiciplinasSize()+1);
        semestreaux.getDiciplinas().put(add.getIdDiciplina(), add);
    }
    public void cadastraAvaliacao(Avaliacao add){
        add.setIdAvaliacao(diciplinaAux.getAvaliacoesSize());
        diciplinaAux.cadastrarAvaliacao(add);
    }


    //login
    public boolean login(long cpf, String senha){
        if(this.alunos.containsKey(cpf)){
            if(this.alunos.get(cpf).getSenha().equals(senha)){
                this.alunoLogado = this.alunos.get(cpf);
                this.alunoKey = cpf;
                return true;
            }
            return false;
        }
        return false;
    }



    //Acessar
    public void acessarSemestre(int chave){
        this.semestreaux = alunoLogado.getSemestres().get(chave);
        this.semestrekey = chave;
    }
    public void acessarDiciplina(int chave){
        this.diciplinaAux = this.semestreaux.getDiciplinas().get(chave);
        this.dicipliankey = chave;
    }

    //ATUALIZAR DADOS
    public void atualizarAluno(){
        this.alunos.replace(alunoKey,alunoLogado);
    }
    public void atualizarSemestre(){
        this.alunoLogado.getSemestres().replace(semestrekey, semestreaux);
        atualizarAluno();
    }
    public void atualizaDiciplina(){
        this.semestreaux.getDiciplinas().replace(dicipliankey, diciplinaAux);
        atualizarSemestre();
        atualizarAluno();
    }

    public void extratoAluno(){
        GeradorPdf gerador = new GeradorPdf();
        gerador.gerarTabela(alunoLogado);
    }

    //getters
    public Diciplina getDiciplinaAux() {
        return diciplinaAux;
    }
    public int getDicipliankey() {
        return dicipliankey;
    }
    public int getSemestrekey() {
        return semestrekey;
    }
    public int getSemestre() {
        return semestrekey;
    }
    public long getAlunoKey() {
        return alunoKey;
    }
    public Map<Long, Aluno> getAlunos() {
        return alunos;
    }
    public Semestre getSemestreaux() {
        return semestreaux;
    }
    public Aluno getAlunoLogado() {
        return alunoLogado;
    }

    //setters
    public void setAlunoKey(long alunoKey) {
        this.alunoKey = alunoKey;
    }
    public void setAlunos(Map<Long, Aluno> alunos) {
        this.alunos = alunos;
    }
    public void setSemestre(int semestrekey) {
        this.semestrekey = semestrekey;
    }
    public void setSemestreaux(Semestre semestreaux) {
        this.semestreaux = semestreaux;
    }
    public void setAlunoLogado(Aluno alunoLogado) {
        this.alunoLogado = alunoLogado;
    }
    public void setDicipliankey(int dicipliankey) {
        this.dicipliankey = dicipliankey;
    }
    public void setDiciplinaAux(Diciplina diciplinaAux) {
        this.diciplinaAux = diciplinaAux;
    }
    public void setSemestrekey(int semestrekey) {
        this.semestrekey = semestrekey;
    }
}