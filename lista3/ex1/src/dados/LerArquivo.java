package dados;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LerArquivo {
    public List<Pessoa> getPesssoasArquivo(int nPessoas){
        List<Pessoa> lista = new ArrayList<Pessoa>();
        Scanner sc;
        try {
            sc = new Scanner(new File(System.getProperty("user.dir") + "\\src\\arquivos\\pessoas.txt"));
        } catch (FileNotFoundException e) {
            sc = new Scanner(System.in);
        }
        for(int i=0; i<nPessoas; i++){
            Pessoa add = new Pessoa();
            add.setIdPessoa(Integer.parseInt(sc.nextLine()));

            add.setCpf(sc.nextLine());
            add.setIdade(Integer.parseInt(sc.nextLine()));
            add.setNome(sc.nextLine());
            add.setCidade(sc.nextLine());
            lista.add(add);

        }
        sc.close();
        return lista;
    }
}
