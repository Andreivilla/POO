package dados;

import java.io.FileNotFoundException;
import java.util.concurrent.Phaser;

import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

public class GeradorPdf {
    public void gerarTabela(Aluno aluno){
        try{
            //Creating a pdf Dcoment object
            String dest = "src\\arquivos\\extratoDeNotas.pdf";
            PdfWriter writer = new PdfWriter(dest);

            //creatting pdfDocument object
            PdfDocument pdf = new PdfDocument(writer);

            //creating a document objext
            Document doc = new Document(pdf);

            //creating a table
            float[] pointColummWidths = {150F, 150F, 150F, 150F};
            Table table = new Table(pointColummWidths);

            //adding cells to the table
            table.addCell(new Cell().add((new Paragraph("Semestre"))));
            table.addCell(new Cell().add((new Paragraph("Diciplina"))));
            table.addCell(new Cell().add((new Paragraph("Media"))));
            table.addCell(new Cell().add((new Paragraph("Media Final"))));

            //linhas da tabela
            for(Semestre semestre : aluno.getSemestres().values()){
                for (Diciplina diciplina: semestre.getDiciplinas().values()){
                    table.addCell(new Cell().add((new Paragraph(semestre.getNome()))));
                    table.addCell(new Cell().add((new Paragraph(diciplina.getNome()))));
                    table.addCell(new Cell().add((new Paragraph(diciplina.mediaFinal() +""))));
                    table.addCell(new Cell().add((new Paragraph(diciplina.mediaExame()+""))));
                }
            }
            doc.add(new Paragraph("Nome: " + aluno.getNome() + "\nCpf: " + aluno.getCpf() + "\n"));
            //adding Table to document
            doc.add(table);

            //closing document
            doc.close();
            System.out.println("Tabela Criada");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
