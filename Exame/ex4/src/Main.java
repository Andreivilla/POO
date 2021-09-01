import java.util.List;

public class Main {
    public static void main(String[] args) {
        PaletaCores paletaCores = new PaletaCores();


        Cor azul = new Cor("Azul", 0, 0, 255);
        Cor vermelho = new Cor("Vermelho", 255, 0, 0);
        Cor amarelo = new Cor("Amarelo", 255, 255, 0);
        Cor magenta = new Cor("Magenta", 255, 0, 255);
        Cor branco = new Cor("Branco", 255, 255, 255);
        Cor magenta2 = new Cor("Magenta2", 255, 0, 255);//criada apenas para mostrara tratamento de erros

        paletaCores.adicionaCor(azul);
        paletaCores.adicionaCor(vermelho);
        paletaCores.adicionaCor(amarelo);
        paletaCores.adicionaCor(magenta);
        paletaCores.adicionaCor(branco);
        paletaCores.adicionaCor(magenta2);

        List<Cor> coresFiltradas = paletaCores.filtrar();
        for(Cor cor : coresFiltradas){
            System.out.println(cor.getNome());

        }
    }
}
