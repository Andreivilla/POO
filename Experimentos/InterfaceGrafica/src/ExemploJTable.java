import dados.Cidade;
import dados.Tabela;

import javax.swing.*;

public class ExemploJTable extends JScrollPane{
    public ExemploJTable(){
        Tabela cidades = new Tabela();
        JTable table = new JTable(cidades);
        setViewportView(table);
        cidades.adicionarCidade(new Cidade("Joinville", "Santa Catarina"));
        cidades.adicionarCidade(new Cidade("Curitiba", "Parana"));
        cidades.adicionarCidade(new Cidade("Florianopolis", "Santa Catarina"));

    }
}
