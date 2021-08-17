import layout.ExemploJOptionPane;

import javax.swing.*;

public class Principal extends JFrame {
    public Principal(){
        //Janelas
        setTitle("Exemplo");//titulo da pagina
        setBounds(50, 50, 300, 300);//(x, y, onde ira surgir a janela, width, height, tamanho da janela)
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Clickar em fecha o programa e encerra operações
        setResizable(false);//impedeo ususario de redminencionar atela
    }

    public static void main(String[] args) {
        //Principal exemplo = new Principal();
        //exemplo.add(new ExemploPanel());
        //exemplo.add(new ExemploJTabbedPane());
        //exemplo.add(new ExemploBorder());
        //exemplo.add(new ExemploLabel());
        //exemplo.add(new ExemploImagem());
        //exemplo.add(new ExemploButton());
        //exemplo.setVisible(true);

        /*ExemploNullLayout exemplo = new ExemploNullLayout();
        exemplo.setVisible(true);
        JButton botao1 = new JButton("Botao 1");
        botao1.setBounds(50 , 50, 100, 20 );
        exemplo.add(botao1);*/

        /*ExemploGridLayout exemplo = new ExemploGridLayout();
        exemplo.setVisible(true);

        JButton botao1 = new JButton("Botao 1");
        exemplo.add(botao1);

        JButton botao2 = new JButton("Botao 2");
        exemplo.add(botao2);

        JButton botao3 = new JButton("Botao 3");
        exemplo.add(botao3);*/

        /*ExemploFlowLayout exemplo = new ExemploFlowLayout();
        exemplo.setVisible(true);

        JButton botao1 = new JButton("Botao 1");
        exemplo.add(botao1);

        JButton botao2 = new JButton("Botao 2");
        exemplo.add(botao2);

        JButton botao3 = new JButton("Botao 3");
        exemplo.add(botao3);*/

        /*ExemploBorderLayout exemplo = new ExemploBorderLayout();
        exemplo.setVisible(true);

        JButton botao1 = new JButton("Botao 1");
        exemplo.add(botao1, BorderLayout.NORTH);

        JButton botao2 = new JButton("Botao 2");
        exemplo.add(botao2, BorderLayout.SOUTH);

        JButton botao3 = new JButton("Botao 3");
        exemplo.add(botao3, BorderLayout.EAST);

        JButton botao4 = new JButton("Botao 4");
        exemplo.add(botao4, BorderLayout.WEST);

        JButton botao5 = new JButton("Botao 5");
        exemplo.add(botao5, BorderLayout.CENTER);*/

        //ExemploCardLayout exemplo = new ExemploCardLayout();

        Principal exemplo = new Principal();
        //exemplo.add(new ExemploJTextField());
        //exemplo.add(new ExemploCheckBox());
        //exemplo.add(new ExemploJComboBox());
        //exemplo.add(new ExemploJList());
        //exemplo.add(new ExemploJTable());
        exemplo.add(new ExemploJOptionPane());
        exemplo.setVisible(true);




    }
}