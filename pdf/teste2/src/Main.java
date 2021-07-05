import java.io.FileNotFoundException;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;

public class Main {
    public static void main(String[] args) {
        try{
            //Creating a pdf Dcoment object
            String dest = "arquivo\\addingTable.pdf";
            PdfWriter writer = new PdfWriter(dest);

            //creatting pdfDocument object
            PdfDocument pdf = new PdfDocument(writer);

            //creating a document objext
            Document doc = new Document(pdf);

            //creating a table
            float[] pointColummWidths = {150F, 150F, 150F, 150F};
            Table table = new Table(pointColummWidths);

            //adding cells to the table
            table.addCell(new Cell().add((new Paragraph("Name"))));
            table.addCell(new Cell().add((new Paragraph("Raju"))));
            table.addCell(new Cell().add((new Paragraph("Id"))));
            table.addCell(new Cell().add((new Paragraph("1001"))));
            table.addCell(new Cell().add((new Paragraph("Designation"))));
            table.addCell(new Cell().add((new Paragraph("Programmer"))));

            //adding Table to document
            doc.add(table);

            //closing document
            doc.close();
            System.out.println("Table_created_successfully...");
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
    }
}
