public class Main{
    public static void main(String[] args) {

        SistemaArquivo sistema = new SistemaArquivo();
        sistema.criarDiretorio("Area de Trabalho");
        sistema.criarDiretorio("Download");

        sistema.criarDocumento("data exame POO", "Area de Trabalho", "Exame de POO dia 01/09/2021 às 15h20");
        sistema.criarMusica("Light of the Seven", "Download", 589);
        sistema.criarMusica("Thorough the Valley", "Download", 220);
        sistema.criarVideo("GOTS01E01", "Download", 1080);
        sistema.criarVideo("GODLESS_S01E01", "Area de Trabalho", 1080);

        System.out.println(sistema.toString());


    }
}