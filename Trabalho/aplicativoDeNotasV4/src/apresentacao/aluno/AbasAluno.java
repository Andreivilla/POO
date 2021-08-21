package apresentacao.aluno;

import negocio.Sistema;

import javax.swing.*;

public class AbasAluno extends JTabbedPane {
    public AbasAluno(Sistema sistema){
        addTab("Semestre", new SemestreAluno(sistema));
        addTab("Diciplinas", new DicplinasAluno(sistema));
        addTab("Avaliacoes", new AvaliacoesAluno(sistema));
    }
}
