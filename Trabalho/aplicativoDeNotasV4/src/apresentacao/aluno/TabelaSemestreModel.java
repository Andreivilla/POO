package apresentacao.aluno;

import dados.Semestre;
import exception.SelectException;
import persistencia.RelacoesDAO;
import persistencia.SemestreDAO;

import javax.print.DocFlavor;
import javax.swing.table.AbstractTableModel;
import java.sql.SQLException;
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

    public List<Semestre> getSemestres() {
        return semestres;
    }
}
