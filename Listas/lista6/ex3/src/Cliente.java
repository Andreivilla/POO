import java.util.ArrayList;
import java.util.List;

public class Cliente implements Observador{
    private List<String> mensagens = new ArrayList<>();

    @Override
    public void atualizar(Object object) {
        this.mensagens.add(object.toString());
    }

    @Override
    public String toString() {
        String str = "";
        for (String mensagem : mensagens){
            str += mensagem + "\n";
        }
        return str;
    }
}
