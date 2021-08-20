package apresentacao;

import dados.Semestre;
import negocio.Sistema;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class PrincipalAluno extends JFrame {
    Sistema sistema = Sistema.getInstance();

    private JPanel panel = new JPanel();

    //semetsre
    private Semestre[] lista = arrayCombobox();
    private JComboBox<Semestre> comboBox = new JComboBox<>(lista);

    private JLabel semestreLabel;
    private JTextField semestreText;

    public PrincipalAluno(String cpfLogado){
        sistema.setCpfLogado(cpfLogado);
        setTitle("Login");
        setBounds(1500, 50, 800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);

        panel.setLayout(null);
        comboBox.setBounds(50, 50, 100, 20);
        comboBox.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    System.out.println(comboBox.getSelectedItem());
                }
            }
        });

        semestreLabel = new JLabel("");
        semestreLabel.setBounds(10,20, 80,25);
        panel.add(semestreLabel);





        panel.setBackground(Color.DARK_GRAY);
        add(comboBox);
        add(panel);
    }

    private Semestre[] arrayCombobox(){
        List<Semestre> lista = sistema.semestresAlunoLogado();
        Semestre[] array = new Semestre[lista.size()];
        for(int i=0; i<lista.size(); i++){
            array[i] = lista.get(i);
        }
        return array;
    }
}
