package dados;

import java.util.ArrayList;

public class Primos extends Gerador{

    public void gerar(int n) {
        for(int i=2; i<n; i++){
            int countDiv = 0;
            for(int primo : this.lista){
                if(i%primo == 0){
                    countDiv++;
                }
            }
            if(!(countDiv>0)){
                lista.add(i);
            }
        }
    }

}
