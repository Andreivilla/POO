package dados;

public class MDC implements  IOperacaoInteira{
    @Override
    public int executar(int valor1, int valor2) {
        int mdc=1;
        int div = 2;
        while (valor1!=1 && valor2!=1){
            if(valor1%div == 0 && valor2%div == 0){
                mdc *= div;
                valor1 /= div;
                valor2 /= div;
            }else if(valor1%div == 0){
                valor1 /= div;
            }else if(valor2%div == 0){
                valor2 /= div;
            }else{
                div++;
            }
        }
        return mdc;
    }
}