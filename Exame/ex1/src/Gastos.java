import java.util.List;

public class Gastos {
    public void exibirGastos(List<ITaxavel> itens){
        for(ITaxavel item : itens){
            System.out.println(item);
            System.out.println("\n");
        }
    }

    public static void main(String[] args) {
    }
}

