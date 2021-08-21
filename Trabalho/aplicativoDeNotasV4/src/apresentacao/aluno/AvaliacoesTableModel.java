package apresentacao.aluno;

import dados.Avaliacao;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class AvaliacoesTableModel extends AbstractTableModel {
    private List<Avaliacao> avaliacoes = new ArrayList<>();
    private String[] colunas = {"Nome", "Data", "Peso", "Nota"};

    @Override
    public int getRowCount() {
        return avaliacoes.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return null;
    }
    
}
