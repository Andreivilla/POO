package persistencia;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class EditorTexto {

    public void gravaTexto(String caminho, List<String> dados){
        FileWriter arquivo;
        try{
            arquivo = new FileWriter(caminho);
            for(int i=0; i < dados.size(); i++){
                arquivo.write(dados.get(i) + "\n");
            }
            arquivo.close();
        } catch(Exception e) {
            System.out.println("ERRO: funcao gravaTexto");
            System.exit(0);
        }
    }
    public void gravaTexo(String caminho, String linha){
        FileWriter arquivo;
        try{
            arquivo = new FileWriter(caminho, true);
            arquivo.write(linha);
            arquivo.close();
        } catch (IOException e) {
            System.out.println("ERRO: funcao gravarTexto");
            System.exit(0);
        }
    }
    public List<String> leTexto(String caminho){
        List<String> dados = new LinkedList<>();
        FileReader arquivo;
        BufferedReader lerArquivo;

        try {
            arquivo = new FileReader(caminho);
            lerArquivo = new BufferedReader(arquivo);
            String str = lerArquivo.readLine();
            while(str != null){
                dados.add(str);
                str = lerArquivo.readLine();
            }
            arquivo.close();
        }catch(Exception e){
            System.out.println("ERRO: ler texto");
        }
        return dados;
    }
}