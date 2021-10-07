import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<ITaxavel> itens = new ArrayList<>();
        ///comida
        itens.add(new Comida("Maçã", 10));
        itens.add(new Comida("Pão", 1.50));

        //veiculo
        itens.add(new Veiculo("BRA2E19", 2010, 50000));
        itens.add(new Veiculo("RIO2A18", 1998, 3600));

        //filme
        itens.add(new Filme("Homem de ferro 1", 126, 30.99));
        itens.add(new Filme("Homem de ferro 2", 125, 20.5));


        Gastos gastos = new Gastos();
        gastos.exibirGastos(itens);
    }
}
