public class Main{
    public static void main(String[] args) {
        SistemaArquivo sistema = new SistemaArquivo();
        sistema.criarDiretorio("Area de Trabalho");
        sistema.criarDiretorio("Download");

        sistema.criarDocumento();
        sistema.criarDocumento();
        sistema.criarMusica();
        sistema.criarVideo();



    }
}