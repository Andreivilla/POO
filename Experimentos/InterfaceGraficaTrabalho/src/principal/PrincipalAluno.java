package principal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class PrincipalAluno {
    private JPanel panel = new JPanel();
    private JFrame frame = new JFrame();
    private String[] itens = new String[]{"escolha 1", "escolha 2"};
    private JComboBox<String> comboBox = new JComboBox<>(itens);


    public PrincipalAluno(){
        frame.setTitle("Login");
        frame.setBounds(50, 50, 800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        panel.setBackground(Color.DARK_GRAY);
        panel.add(comboBox);

        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED)
                    System.out.println(comboBox.getSelectedItem());
            }
        });

        //cadastrar diciplina
        //cadastrar semestre


        frame.add(panel);
    }
}