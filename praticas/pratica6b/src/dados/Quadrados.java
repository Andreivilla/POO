package dados;

public class Quadrados extends Gerador{
    public void gerar(int n) {
        for(int i=0; i<n; i++){
            if(!(Math.sqrt(i) > Math.floor(Math.sqrt(i)))){
                lista.add(i);
            }
        }
    }
}
