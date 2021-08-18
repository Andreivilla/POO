package principal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JPanel panel = new JPanel();
    private JFrame frame = new JFrame();
    //cpf
    private static JLabel cpfLabel;
    private static JTextField cpfText;
    //senha
    private static JLabel senhaLabel;
    private static JPasswordField senhaText;
    //buttons
    private static JLabel tiposLogin;
    private static JButton buttonAluno;
    private static JButton buttonProfessor;
    //login
    private static JLabel loginefetuado;
    private static String cpfLogado = null;

    public Login(){
        frame.setTitle("Login");
        frame.setBounds(50, 50, 300, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        //Cpf
        panel.setLayout(null);
        cpfLabel = new JLabel("CPF: ");
        cpfLabel.setBounds(10,20, 80,25);
        panel.add(cpfLabel);

        cpfText = new JTextField(20);
        cpfText.setBounds(65, 20, 165, 25);
        panel.add(cpfText);

        //Senha
        senhaLabel = new JLabel("Senha: ");
        senhaLabel.setBounds(10,50, 80,25);
        panel.add(senhaLabel);

        senhaText = new JPasswordField();
        senhaText.setBounds(65, 50, 165, 25);
        panel.add(senhaText);

        //Buttons
        tiposLogin = new JLabel("Logar como:");
        tiposLogin.setBounds(10,80, 100,25);
        panel.add(tiposLogin);

        //Professor
        buttonProfessor = new JButton("Professor");
        buttonProfessor.setBounds(10, 110, 100, 25);
        buttonProfessor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = cpfText.getText();
                String senha = senhaText.getText();
                if(cpf.equals("10799806951") && senha.equals("12345")) {
                    loginefetuado.setText("Login efetuado");
                    cpfLogado = cpf;
                    frame.dispose();
                }else{
                    loginefetuado.setText("CPF ou senha invalido");
                }
            }
        });
        //Aluno
        buttonAluno = new JButton("Aluno");
        buttonAluno.setBounds(130, 110, 100, 25);
        buttonAluno.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cpf = cpfText.getText();
                String senha = senhaText.getText();
                if(cpf.equals("10799806951") && senha.equals("12345")) {
                    loginefetuado.setText("Login efetuado");
                    cpfLogado = cpf;
                    frame.dispose();
                }else{
                    loginefetuado.setText("CPF ou senha invalido");
                }
            }
        });

        panel.add(buttonProfessor);
        panel.add(buttonAluno);
        loginefetuado = new JLabel("");
        loginefetuado.setBounds(10, 110, 300, 25);
        panel.add(loginefetuado);
        frame.add(panel);
    }

    //getters
    public String getCpfLogado() {
        return cpfLogado;
    }
}