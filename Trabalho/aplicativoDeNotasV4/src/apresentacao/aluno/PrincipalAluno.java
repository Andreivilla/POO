package apresentacao.aluno;


import dados.Semestre;
import negocio.Sistema;

import javax.swing.*;
import java.awt.*;

public class PrincipalAluno extends JFrame{
    public PrincipalAluno(Sistema sistema){
        setTitle("Aplicativo Aluno");
        setBounds(1500, 50, 800, 800);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        add(new AbasAluno(sistema));


    }

}
