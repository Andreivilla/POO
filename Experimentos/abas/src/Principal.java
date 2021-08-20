import javax.swing.*;

public class Principal extends JFrame {
    public Principal(){
        setTitle("Exemplo");//titulo da pagina
        setBounds(50, 50, 300, 300);//(x, y, onde ira surgir a janela, width, height, tamanho da janela)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Clickar em fecha o programa e encerra operações
        setResizable(false);//impedeo ususario de redminencionar atela
        setVisible(true);

    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.add(new Abas());
    }
}
