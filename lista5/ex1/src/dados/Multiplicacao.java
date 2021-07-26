package dados;

public class Multiplicacao extends Soma{
    @Override
    public int executar(int valor1, int valor2) {
        int mult = 0;
        for(int i=0; i<valor2; i++){
            mult = super.executar(mult, valor1);
        }
        return mult;
    }
}
