package apresentacao.aluno;

import dados.Diciplina;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class DiciplinasTableModel extends AbstractTableModel {
    private List<Diciplina> diciplinas = new ArrayList<>();
    private String[] colunas = {"Codigo", "Nome", "Media", "MediaExame"};

    @Override
    public int getRowCount() {
        return diciplinas.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna){
            case 0:
                return diciplinas.get(linha).getCodDiciplina();
            case 1:
                return diciplinas.get(linha).getNome();
            //continuar outras colunas
        }
        return null;
    }
}
