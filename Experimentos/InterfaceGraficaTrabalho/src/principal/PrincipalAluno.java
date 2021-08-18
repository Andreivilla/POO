package principal;

import javax.swing.*;
import java.awt.*;

public class PrincipalAluno {
    private JPanel panel = new JPanel();
    private JFrame frame = new JFrame();

    public PrincipalAluno(){
        frame.setTitle("Login");
        frame.setBounds(50, 50, 300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
        //panel.setBackground(Color.RED);
        //cadastrar diciplina
        //cadastrar semestre


        frame.add(panel);
    }

}