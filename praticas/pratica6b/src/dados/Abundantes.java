package dados;

import dados.Gerador;

public class Abundantes extends Gerador {

    public void gerar(int n){
        for(int i =1; i<n; i++){
            int divs = 0;
            for(int j=1; j<i; j++) {
                if(i%j == 0) {
                    divs += j;
                }
            }
            if(divs > i){
                lista.add(i);
            }
        }
    }
}
