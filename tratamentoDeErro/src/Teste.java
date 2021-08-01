public class Teste {
    public int soma(int a, int b){
        int soma = 0;
        if (b < a) {
            soma = a + b;
            return soma;
        } else {
            throw new DeuErro();
        }

        return soma;
    }
}