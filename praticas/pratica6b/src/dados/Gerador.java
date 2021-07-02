package dados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public abstract class Gerador implements ISequencia{
    Random geradorAleatorio = new Random();
    protected List<Integer> lista = new ArrayList<Integer>();

    public List<Integer> getLista() {
        return lista;
    }

    public abstract void gerar(int n);

    public int sortear(){
        return lista.get(geradorAleatorio.nextInt(lista.size()));
    }
    public long somatorio(){
        long somatorio=0;
        for(Integer i: lista){
            somatorio += i;
        }
        return somatorio;
    }
    public double mediaAritmetica(){
        return somatorio()/lista.size();
    }
    public double mediaGeometrica(){
        long somaRaiz=0;
        for( int i=0; i<lista.size(); i++){
            somaRaiz +=  Math.pow(lista.get(i), i);
        }
        return Math.pow(somaRaiz, (1/lista.size()));
    }
    public double variancia(){
        long soma = 0;
        double media = mediaAritmetica();
        for( int i=0; i<lista.size(); i++){
            soma += Math.pow(Math.pow(lista.get(i), i) - media, 2);
        }
        soma = soma/(lista.size() -1);
        return Math.pow(soma, (1/2));
    }
    public double desvioPadrao(){
        return Math.pow(variancia(), (1/2));
    }
    public long amplitude(){
        List<Integer> listaaux = getLista();
        return max() - mim();
    }
    public int max(){
        int maior = lista.get(0);
        for(Integer n: lista){
            if(n > maior){
                maior = n;
            }
        }
        return maior;
    }
    public int mim(){
        int menor = lista.get(0);
        for(Integer n: lista){
            if(n < menor){
                menor = n;
            }
        }
        return menor;
    }
}
