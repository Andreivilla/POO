package apresentacao.aluno;

import dados.Semestre;

import javax.swing.table.AbstractTableModel;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class TabelaSemestreModel extends AbstractTableModel {
    private List<Semestre> semestres = new ArrayList<>();
    private String[] colunas = {"Semestre"};

    @Override
    public int getRowCount() {
        return semestres.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        return semestres.get(linha).getNome();
    }

    public void setSemestres(List<Semestre> semestres) {
        this.semestres = semestres;
    }
}
