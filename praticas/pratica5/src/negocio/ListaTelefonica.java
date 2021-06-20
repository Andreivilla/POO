package negocio;

import dados.Contato;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;


public class ListaTelefonica {
    private static ArrayList<Contato> contatos = new ArrayList();

    public static void adicionarContato(Contato contato){
        contatos.add(contato);
    }

    public static void removerContato(Contato contato){
        contatos.remove(contato);
    }

    public static ArrayList<Contato> buscarContato(char inicial){
        Map<Character, ArrayList<Contato>> mapContatos = new HashMap<Character, ArrayList<Contato>>();
        mapContatos = buscarContatos();

        if(mapContatos.containsKey(inicial)){
            return mapContatos.get(inicial);
        }else{
            return null;
        }
    }
    public static Map<Character, ArrayList<Contato>> buscarContatos(){
        Map<Character, ArrayList<Contato>> mapContatos = new HashMap<Character, ArrayList<Contato>>();
        Set<Character> iniciais = new HashSet<Character>();
        ArrayList<Contato> aux = new ArrayList<Contato>();

        for(Contato addInicial : contatos){
            iniciais.add(addInicial.getNome().charAt(0));
        }

        for(char inicial : iniciais) {
            for(Contato contato : contatos) {
                if(contato.getNome().charAt(0) == inicial) {
                    aux.add(contato);
                }
            }
            mapContatos.put(inicial, aux);
            aux.clear();
        }

        return mapContatos;
    }
}
