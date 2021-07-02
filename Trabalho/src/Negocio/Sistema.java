package Negocio;

import Dados.Aluno;
import Dados.Diciplina;
import Dados.Semestre;


import java.util.HashMap;
import java.util.Map;

public class Sistema {
    private Map<Long, Aluno> alunos = new HashMap<>();
    private Aluno alunoLogado;
    private long alunoKey;
    private Semestre semestreaux;
    private int semestrekey;
    private Diciplina diciplinaAux;
    private int dicipliankey;


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

    //cadastro
    public void cadastrarAluno(Aluno cadastra){
        this.alunos.put(cadastra.getCpf(), cadastra);
    }
    public static void cadastrarDiciplina(){

    }
    public static void cadastrarNotas(){

    }

    //SEMESTRE
    //cadastrar
    public void cadastrarSemestre(Semestre add){
        add.setIdSemestre(this.alunoLogado.getSemestresSize()+1);
        this.alunoLogado.cadastrarSemestre(add);
        atualizarAluno(this.alunoKey, this.alunoLogado);
    }

    public void removeSemestre(int chave){
        this.alunoLogado.removerSemestre(chave);
    }
    public void acessarSemestre(int chave){
        this.semestreaux = alunoLogado.getSemestres().get(chave);
        this.semestrekey = chave;
    }

    //DICIPLINA
    //cadastrar
    public void cadastrarDiciplina(Diciplina add){
        add.setIdDiciplina(semestreaux.getDiciplinasSize()+1);
        semestreaux.getDiciplinas().put(add.getIdDiciplina(), add);
    }
    public static void removeDiciplina(){

    }


    //printar
    public static void exibeDiciplinas(){

    }
    public static void exibeNotas(){

    }
    public static void exibeSemestres(){

    }
    public static void exibeAvalicao(){

    }
    public String exibeAluno(){
        return this.alunoLogado.toString();
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

    //ATUALIZAR DADOS
    public void atualizarAluno(Long chave, Aluno aluno){
        this.alunos.replace(chave, aluno);
    }
    //public void atualizarSemestre()
}