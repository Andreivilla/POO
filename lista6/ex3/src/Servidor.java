import java.util.ArrayList;
import java.util.List;

public class Servidor implements Sujeito{
    private String ip;
    public String ultimaMensagem;
    public List<Cliente> clientes = new ArrayList<>();

    public void enviarMensagem(String menssagem){
        this.ultimaMensagem = menssagem;
        this.notificar();
    }

    @Override
    public void adicionoar(Observador observador) {
        this.clientes.add((Cliente) observador);
    }

    @Override
    public void remover(Observador observador) {
        this.clientes.remove((Cliente) observador);
    }

    @Override
    public void notificar() {
        for (Cliente cliente : clientes){
            cliente.atualizar(this.ultimaMensagem);
        }
    }

    @Override
    public String toString() {
        return "Servidor ID='" + ip;
    }

    //setters
    public void setIp(String id) {
        this.ip = id;
    }

    public void setUltimaMensagem(String ultimaMensagem) {
        this.ultimaMensagem = ultimaMensagem;
    }

    //getteres
    public String getIp() {
        return ip;
    }

    public String getUltimaMensagem() {
        return ultimaMensagem;
    }
}
