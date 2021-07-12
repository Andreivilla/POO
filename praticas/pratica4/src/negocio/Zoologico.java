package negocio;

import dados.*;

public class Zoologico {
    private static Aquario aquarios[] = new Aquario[10];
    private static Viveiro viveiros[] = new Viveiro[10];
    static int qtdAquarios = 0;
    static int qtdViveiros = 0;


    public static void cadastrarViveiro(Viveiro viveiro){
        viveiros[qtdViveiros] = viveiro;
        qtdViveiros++;
    }
    public static void cadastrarAnimais(Animal animal){
        if(animal instanceof Animal){
            viveiros[qtdViveiros].adicionarAnimal(animal, viveiros[qtdViveiros]);
        }else{
            aquarios[qtdAquarios].adicionarAnimal(animal, aquarios[qtdAquarios]);
        }
    }
    public static boolean alocarAnimal(Animal animal, Viveiro viveiro){
        return viveiro.adicionarAnimal(animal, viveiro);
    }

}
