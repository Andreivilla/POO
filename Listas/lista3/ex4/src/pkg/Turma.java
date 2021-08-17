package pkg;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Turma {
    private List<Aluno> listaAlunos = new ArrayList<>();

    public void adicionarAluno(Aluno add){
        listaAlunos.add(add);
    }
    public void ordenarAlunoPorMedia(){
        Collections.sort(listaAlunos);
    }
}
