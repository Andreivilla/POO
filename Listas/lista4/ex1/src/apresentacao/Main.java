package apresentacao;

import dados.Cachorro;
import dados.Gato;
import dados.Vaca;

public class Main {
    public static void main(String[] args) {
        //cachorros
        Cachorro cachorro1 = new Cachorro();
        Cachorro cachorro2 = new Cachorro();
        cachorro1.setNome("Coragem");
        cachorro2.setNome("Marley");

        //gatos
        Gato gato1 = new Gato();
        Gato gato2 = new Gato();
        gato1.setNome("Garfield");
        gato1.setNome("Tom");

        //vacas
        //espero que  pegue as referencia se não os nomes ficam meio estranhos
        Vaca vaca1 = new Vaca();
        Vaca vaca2 = new Vaca();
        vaca1.setNome("Otis");
        vaca2.setNome("Ben");

        //exibindo sons
        System.out.println(cachorro1.getNome() + ": " + cachorro1.emitirSom());
        System.out.println(cachorro2.getNome() + ": " + cachorro2.emitirSom());

        System.out.println(gato1.getNome() + ": " + gato1.emitirSom());
        System.out.println(gato2.getNome() + ": " + gato2.emitirSom());

        System.out.println(vaca1.getNome() + ": " + vaca1.emitirSom());
        System.out.println(vaca2.getNome() + ": " + vaca2.emitirSom());
    }
}
