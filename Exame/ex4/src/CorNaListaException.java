public class CorNaListaException extends Exception{
    CorNaListaException(String nomeCor) {
        super("Cor está na lista: " + nomeCor);
    }
}
