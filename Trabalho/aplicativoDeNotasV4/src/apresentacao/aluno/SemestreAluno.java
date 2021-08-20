package apresentacao.aluno;


import dados.Semestre;
import negocio.Sistema;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.List;

public class SemestreAluno extends JPanel {
    int idSemestre=-1;
    public SemestreAluno(Sistema sistema){
        setBackground(Color.gray);
        TabelaSemestreModel tabelaModel = new TabelaSemestreModel();
        JTable tabela = new JTable();




        JComboBox<Semestre> comboSemestre = new JComboBox(comboSemestre(sistema));
        comboSemestre.setBounds(50,250,100,30);
        comboSemestre.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if(e.getStateChange() == ItemEvent.SELECTED){
                    //System.out.println("a: "+ comboSemestre.getSelectedItem());
                    Semestre aux = (Semestre) comboSemestre.getSelectedItem();
                    idSemestre = aux.getIdSemestre();
                }
            }
        });
        add(comboSemestre);



        //button deletarSemestre()
        JButton deletar = new JButton("Deletar");
        deletar.setBounds(50,300, 100, 30);
        deletar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                sistema.deletarSemestre(idSemestre);
            }
        });
        add(deletar);
        //Button cadastrarSemestre()



        tabelaModel.setSemestres(sistema.listaSemestre());
        tabela.setModel(tabelaModel);
        add(tabela);
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
