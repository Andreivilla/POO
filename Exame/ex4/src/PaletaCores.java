import java.util.ArrayList;
import java.util.List;

public class PaletaCores {
    private List<Cor> cores = new ArrayList<>();

    public List<Cor> filtrar(){
        List<Cor> filtradas = new ArrayList<>();
        for(Cor cor : cores){
            if(cor.getB() == 0)
                filtradas.add(cor);
        }
        return filtradas;
    }

    public void adicionaCor(Cor add){
        try {
            for (Cor cor : cores) {
                if (cor.equals(add)) {
                    throw new CorNaListaException(add.getNome());
                }
            }
            cores.add(add);
        }catch (CorNaListaException e){
            e.printStackTrace();
        }
    }
}