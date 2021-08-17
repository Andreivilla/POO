import java.awt.Color;
import javax.swing.*;
import javax.swing.border.Border;

public class ExemploBorder extends JPanel{

    public ExemploBorder(){
        Border lineBoreder = BorderFactory.createLineBorder(Color.black);
        setBorder(BorderFactory.createTitledBorder(lineBoreder, "Exemplo de borda"));
    }
}
