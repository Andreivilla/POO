package apresentacao.aluno;

import negocio.Sistema;

import javax.swing.*;

public class AbasAluno extends JTabbedPane {
    public AbasAluno(Sistema sistema){
        add("semestre", new SemestreAluno(sistema));

    }
}
