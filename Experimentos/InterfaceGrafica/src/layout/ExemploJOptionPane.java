package layout;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploJOptionPane extends JPanel {
    public ExemploJOptionPane(){
        JButton button = new JButton("Pressione");
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "O botao foi precionado", "Botao Pressionado", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
