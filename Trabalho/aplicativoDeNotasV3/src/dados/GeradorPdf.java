package dados;

import java.io.FileNotFoundException;

import java.util.List;


import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;


public class GeradorPdf {
    public void gerarTabela(Aluno aluno, List<ObjetoPdf> listaObjetosPdf){
        try{
            String dest = "src\\arquivos\\extratoDeNotas.pdf";
            PdfWriter writer = new PdfWriter(dest);

            //criando objeto do documento de pdf
            PdfDocument pdf = new PdfDocument(writer);

            //criando objeto do documento de texto
            Document doc = new Document(pdf);

            //criando tabela
            float[] pointColummWidths = {150F, 150F, 150F, 150F};
            Table table = new Table(pointColummWidths);

            //adicionando celulas a tabel
            table.addCell(new Cell().add((new Paragraph("Semestre"))));
            table.addCell(new Cell().add((new Paragraph("Diciplina"))));
            table.addCell(new Cell().add((new Paragraph("Media"))));
            table.addCell(new Cell().add((new Paragraph("Media Final"))));

            //linhas da tabela
            for(ObjetoPdf obj : listaObjetosPdf){
                table.addCell(new Cell().add((new Paragraph(obj.getSemestreNome()))));
                table.addCell(new Cell().add((new Paragraph(obj.getDiciplinaNome()))));
                table.addCell(new Cell().add((new Paragraph(obj.getMedia() +""))));
                table.addCell(new Cell().add((new Paragraph(obj.getMediaExame()+""))));
            }

            //gerando e adicionando cabeçalho a tabela
            doc.add(new Paragraph("Nome: " + aluno.getNome() + "\nCpf: " + aluno.getCpf() + "\n"));
            //adicionando a tabela ao documento
            doc.add(table);

            //fechando documento
            doc.close();
            System.out.println("Tabela Criada");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
