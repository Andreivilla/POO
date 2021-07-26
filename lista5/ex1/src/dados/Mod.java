package dados;

public class Mod implements IOperacaoInteira{
    @Override
    public int executar(int valor1, int valor2) {
        return valor1 - ((int) valor1/valor2)*valor2;
    }
}