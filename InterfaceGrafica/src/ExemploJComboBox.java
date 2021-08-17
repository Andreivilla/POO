import javax.swing.*;

public class ExemploJComboBox extends JPanel {
    public ExemploJComboBox(){
        String[] itens = new String[]{"escolha 1", "escolha 2"};
        JComboBox<String> comboBox = new JComboBox<>(itens);
        add(comboBox);
    }
}
