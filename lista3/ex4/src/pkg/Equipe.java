package pkg;

import java.util.ArrayList;
import java.util.List;

public class Equipe<T>{
    private String nome;
    List<T> lista = new ArrayList<>();

    public Equipe(int qtdAlunos){
        for(int i=0; i<qtdAlunos; i++){
            lista.add(null);
        }
    }

    //set
    public void set(T add){
        this.lista.add(add);
    }
    public void setSome(String some) {
        this.nome = some;
    }
    //get
    public T get(int i){
        return lista.get(i);
    }
    public String getSome() {
        return nome;
    }

    public String toString(){
        StringBuilder str = new StringBuilder();
        str.append("Nome: ");
        str.append(nome);
        str.append("\n");
        for(T t : lista){
            if(t != null){
                str.append(t);
            }
        }
        return str.toString();
    }
}