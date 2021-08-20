import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Principal extends JFrame {

    public Principal(){
        //Janelas
        setTitle("Exemplo");//titulo da pagina
        setBounds(50, 50, 300, 300);//(x, y, onde ira surgir a janela, width, height, tamanho da janela)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Clickar em fecha o programa e encerra operações
        setResizable(false);//impedeo ususario de redminencionar atela
        setVisible(true);
    }

    public static void main(String[] args) {
        ProdutoTAbleModel tabela = new ProdutoTAbleModel();
        Principal principal = new Principal();
        JPanel panel = new JPanel();
        JTable tabela1 = new JTable();

        List<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(new Produto("arroz", 10));
        listaProdutos.add(new Produto("feijao", 5));
        listaProdutos.add(new Produto("pao", 3));
        tabela.setProdutos(listaProdutos);

        panel.setBackground(Color.DARK_GRAY);
        tabela1.setModel(tabela);
        panel.add(tabela1);
        principal.add(panel);
    }
}
