import javax.swing.*;

public class ExemploImagem extends JPanel {
    ExemploImagem(){
        JLabel imagem = new JLabel(new ImageIcon("src/udesc.png"));
        add(imagem);
    }
}
