package apresentacao;

import dados.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    //não utilizei numerosperfeitos pois o 10 numero perfeito é
    //191561942608236107294793378084303638130997321548169216
    static Naturais naturais = new Naturais();
    naturais.gerar(10);
    static Abundantes abundantes = new Abundantes();
    abundantes.gerar(54);
    static Fibonacci fibonacci = new Fibonacci();
    fibonacci.gerar(10);
    static Primos primos = new Primos();
    primos.gerar(30);
    static Fatoriais fatoriais = new Fatoriais();
    fatoriais.gerar(10);
    static Quadrados quadrados = new Quadrados();
    quadrados.gerar(82);

    public static void main(String[] args) {
        Map<Integer,String> sortear = mapSortear();
        Map<Long,String>  somatorio = mapSomatorio();
        Map<Double,String> mediaAritimetica = mapMediaAritimetica();
        Map<Double,String> mediaGeometrica = mapMediaGeometrica();
        Map<Double,String> variancia = mapVariancia();
        Map<Double,String> desvioPadrao = mapDesvioPadrao();
        Map<Long,String> amplitude = mapAmplitude();

        System.out.println("----------------------------------------");
        System.out.println("Sortear: ");
        System.out.println("Maior valor: " + Collections.max(sortear.keySet()));
        System.out.println("Gerador: " + sortear.get(Collections.max(sortear.keySet())));
        System.out.println("----------------------------------------");
        System.out.println("Media Aritimetica: ");
        System.out.println("Maior valor: " + Collections.max(mediaAritimetica.keySet()));
        System.out.println("Gerador: " + mediaAritimetica.get(Collections.max(mediaAritimetica.keySet())));
        System.out.println("----------------------------------------");
        System.out.println("Media Geometrica: ");
        System.out.println("Maior valor: " + Collections.max(mediaGeometrica.keySet()));
        System.out.println("Gerador: " +mediaGeometrica.get(Collections.max(mediaGeometrica.keySet())));
        System.out.println("----------------------------------------");
        System.out.println("Variancia: ");
        System.out.println("Maior valor: " + Collections.max(variancia.keySet()));
        System.out.println("Sequencia: " + variancia.get(Collections.max(variancia.keySet())));
        System.out.println("----------------------------------------");
        System.out.println("Somatorio: ");
        System.out.println("Maior valor: " + Collections.max(somatorio.keySet()));
        System.out.println("Gerador: " + somatorio.get(Collections.max(somatorio.keySet())));
        System.out.println("----------------------------------------");
        System.out.println("Desvio Padrao: ");
        System.out.println("Maior valor: " + Collections.max(desvioPadrao.keySet()));
        System.out.println("Gerador: " + desvioPadrao.get(Collections.max(desvioPadrao.keySet())));
        System.out.println("----------------------------------------");
        System.out.println("Amplitude: ");
        System.out.println("Maior valor: " + Collections.max(amplitude.keySet()));
        System.out.println("Gerador: " + amplitude.get(Collections.max(amplitude.keySet())));
        System.out.println("----------------------------------------");
    }
    public static Map<Integer,String> mapSortear(){
        Map<Integer,String> map = new HashMap<>();
        map.put(naturais.sortear(), "Naturais");
        map.put(fibonacci.sortear(), "Fibonacci");
        map.put(abundantes.sortear(), "Abundantes");
        map.put(primos.sortear(), "Primos");
        map.put(fatoriais.sortear(), "Fatoriais");
        map.put(quadrados.sortear(), "Quadrados");
        return map;
    }
    public static Map<Long,String> mapSomatorio(){
        Map<Long,String> map = new HashMap<>();
        map.put(naturais.somatorio(), "Naturais");
        map.put(fibonacci.somatorio(), "Fibonacci");
        map.put(abundantes.somatorio(), "Abundantes");
        map.put(primos.somatorio(), "Primos");
        map.put(fatoriais.somatorio(), "Fatoriais");
        map.put(quadrados.somatorio(), "Quadrados");
        return map;
    }

    public static Map<Double,String> mapMediaAritimetica(){
        Map<Double,String> map = new HashMap<>();
        map.put(naturais.mediaAritmetica(), "Naturais");
        map.put(fibonacci.mediaAritmetica(), "Fibonacci");
        map.put(abundantes.mediaAritmetica(), "Abundantes");
        map.put(primos.mediaAritmetica(), "Primos");
        map.put(fatoriais.mediaAritmetica(), "Fatoriais");
        map.put(quadrados.mediaAritmetica(), "Quadrados");
        return map;
    }
    public static Map<Double,String> mapMediaGeometrica(){
        Map<Double,String> map = new HashMap<>();
        map.put(naturais.mediaGeometrica(), "Naturais");
        map.put(fibonacci.mediaGeometrica(), "Fibonacci");
        map.put(abundantes.mediaGeometrica(), "Abundantes");
        map.put(primos.mediaGeometrica(), "Primos");
        map.put(fatoriais.mediaGeometrica(), "Fatoriais");
        map.put(quadrados.mediaGeometrica(), "Quadrados");
        return map;
    }
    public static Map<Double,String> mapVariancia(){
        Map<Double,String> map = new HashMap<>();
        map.put(naturais.variancia(), "Naturais");
        map.put(fibonacci.variancia(), "Fibonacci");
        map.put(abundantes.variancia(), "Abundantes");
        map.put(primos.variancia(), "Primos");
        map.put(fatoriais.variancia(), "Fatoriais");
        map.put(quadrados.variancia(), "Quadrados");
        return map;
    }
    public static Map<Double,String> mapDesvioPadrao(){
        Map<Double,String> map = new HashMap<>();
        map.put(naturais.desvioPadrao(), "Naturais");
        map.put(fibonacci.desvioPadrao(), "Fibonacci");
        map.put(abundantes.desvioPadrao(), "Abundantes");
        map.put(primos.desvioPadrao(), "Primos");
        map.put(fatoriais.desvioPadrao(), "Fatoriais");
        map.put(quadrados.desvioPadrao(), "Quadrados");
        return map;
    }
    public static Map<Long,String> mapAmplitude(){
        Map<Long,String> map = new HashMap<>();
        map.put(naturais.amplitude(), "Naturais");
        map.put(fibonacci.amplitude(), "Fibonacci");
        map.put(abundantes.amplitude(), "Abundantes");
        map.put(primos.amplitude(), "Primos");
        map.put(fatoriais.amplitude(), "Fatoriais");
        map.put(quadrados.amplitude(), "Quadrados");
        return map;
    }
}
