package negocio;

import dados.Pessoa;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Sorteador {
    Scanner scanner = new Scanner(System.in);//deletar
    Random gerador = new Random();
    ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();

    public Pessoa sortearProximo(){
        return this.pessoas.remove(gerador.nextInt(pessoas.size()));
    }

    public void addPessoa(Pessoa add){
        this.pessoas.add(add);
    }

    public ArrayList<Pessoa> getPessoas() {
        return pessoas;
    }






}
