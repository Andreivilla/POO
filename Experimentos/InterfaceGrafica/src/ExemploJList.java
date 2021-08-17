import javax.swing.*;

public class ExemploJList extends JPanel {
    public ExemploJList(){
        String[] array = new String[]{"item 1", "item 2", "item 3"};
        JList<String> jList = new JList<>(array);
        add(jList);
    }
}
