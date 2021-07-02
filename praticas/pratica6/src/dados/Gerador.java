package dados;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public abstract class Gerador {
    protected List<Integer> lista = new ArrayList<Integer>();

    public List<Integer> getLista() {
        return lista;
    }

    public abstract void gerar(int n);


}
