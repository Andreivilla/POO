package layout;

import javax.swing.*;
import java.awt.*;

public class ExemploFlowLayout  extends JFrame {
    public ExemploFlowLayout(){
        setTitle("Exemplo");
        setSize(300, 300);
        setLocation(50, 50);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
    }
}
