package dados;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Digrafo {
    private Map<Integer, List<Integer>> matriz = new HashMap<>();
    private int nVertices = 0;

    public void adicionarVertice(){
        nVertices += 1;
        List<Integer> add = new ArrayList<>();
        int i;
        for(i=0; i<nVertices; i++){
            add.add(0);
        }

        matriz.put(nVertices-1, add);
        for(i=0; i<nVertices; i++){
            this.matriz.get(i).add(0);
        }
    }
    public void adicionarAresta(int origem, int destino){
        if(this.matriz.get(origem).get(destino) == 0) {
            this.matriz.get(origem).add(destino, 1);
        }
    }
    @Override
    public String toString(){
        String str = "  ";
        for(int i=0; i<nVertices; i++){
            str += i + " ";
        }
        str+="\n";
        for(int i=0; i<nVertices; i++){
            str += i + " ";
            for(int j=0; j<nVertices; j++){
                str += this.matriz.get(i).get(j) + " ";
            }
            str += "\n";
        }
        return str;
    }

}
