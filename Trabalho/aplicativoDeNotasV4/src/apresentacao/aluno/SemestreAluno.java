package apresentacao.aluno;


import dados.Semestre;
import exception.SelectException;
import negocio.Sistema;
import persistencia.RelacoesDAO;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.SQLException;
import java.util.List;

public class SemestreAluno extends JPanel {
    private int idSemestre=-1;
    public SemestreAluno(Sistema sistema){
        setBackground(Color.gray);

        List<Semestre> semestres = lista();


        //TabelaSemestreModel tabelaSemestreModel = new TabelaSemestreModel();
        //tabelaSemestreModel.setSemestres(sistema.listaSemestre());


        /*for (Semestre semestre : sistema.listaSemestre()){//tabelaSemestreModel.getSemestres()){
            System.out.println(semestre);
        }*/





    }

    public List<Semestre> lista(){
        try {
            RelacoesDAO relacoesDAO = RelacoesDAO.getInstance();
            return relacoesDAO.selectSemestres("36484913005");
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (SelectException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Semestre[] comboSemestre(Sistema sistema){
        List<Semestre> lista = sistema.listaSemestre();
        Semestre[] lista1 = new Semestre[lista.size()];
        for(int i=0; i<lista.size(); i++){
            lista1[i] = lista.get(i);
        }
        return lista1;
    }
}
