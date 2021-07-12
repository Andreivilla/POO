package persistencia;

import dados.Pessoa;

import java.util.LinkedList;
import java.util.List;

public class ArquivoPessoaDAO {
    private String caminho = "arquivos/pessoas.csv";
    private EditorTexto arquivo = new EditorTexto();

    private String toCSV(Pessoa pessoa){
        StringBuilder str = new StringBuilder();
        str.append(pessoa.getNome()).append("/");
        str.append(pessoa.getIdade()).append("/");
        str.append(pessoa.getAltura()).append("/");
        str.append(pessoa.getMassa());
        return str.toString();
    }
    private Pessoa fromCSV(String linha){
        String[] dadosPessoa = linha.split("/");
        Pessoa add = new Pessoa();
        add.setNome(dadosPessoa[0]);
        add.setIdade(Integer.parseInt(dadosPessoa[1]));
        add.setAltura(Float.parseFloat(dadosPessoa[2]));
        add.setMassa(Float.parseFloat(dadosPessoa[3]));
        return add;
    }
    private List<String> listaPessoaToString(List<Pessoa> pessoas){
        List<String> arquivo = new LinkedList<String>();
        for(Pessoa pessoa: pessoas){
            arquivo.add(toCSV(pessoa));
        }
        return arquivo;
    }
    private List<Pessoa> stringTolistaPessoa(List<String> arquivo){
        List<Pessoa> pessoas = new LinkedList<Pessoa>();
        for(String linha : arquivo){
            pessoas.add(fromCSV(linha));
        }
        return pessoas;
    }
    public List<Pessoa> lePessoasArquivo(){
        return stringTolistaPessoa(arquivo.leTexto(caminho));
    }
    public void salvaPessoasArquivo(List<Pessoa> pessoas){
        arquivo.gravaTexto(caminho, listaPessoaToString(pessoas));
    }
    public void salvaPessoasArquivo(Pessoa pessoa){
        arquivo.gravaTexto(caminho, toCSV(pessoa));
    }
}
