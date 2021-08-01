package dados;

public class ProcessoSemJuizException extends Exception{
    ProcessoSemJuizException(){
        super("Processo sem juiz");
    }
}
