import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;
import java.util.List;

public class ProdutoTAbleModel extends AbstractTableModel {
    private List<Produto> produtos = new ArrayList<>();
    private String[] colunas = {"Nome", "Valor"};

    @Override
    public int getRowCount() {
        return produtos.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch (coluna){
            case 0:
                return produtos.get(linha).getNome();
            case 1:
                return produtos.get(linha).getPreco();
        }
        return null;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}