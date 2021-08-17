import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ExemploButton extends JPanel {
    public ExemploButton(){
        JButton button = new JButton("Pressione");
        add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                trocaCor();
            }
        });
    }

    public void trocaCor(){
        if(getBackground().equals(Color.BLUE)){
            setBackground(Color.red);
        }else {
            setBackground(Color.BLUE);
        }
    }
}
