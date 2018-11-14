
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.List;

public class writePDF {

    public static void main(String[] args) {

        //recalling method from ReadExcel class
        ReadExcel test= new ReadExcel();

        //Array List
        List<String>firsrow = test.All();

        try {

            Document document = new Document(PageSize.A4);
            PdfWriter.getInstance(document, new FileOutputStream("C:\\Users\\SPIN 5\\Desktop\\stuff\\ CONVERTEXCEL.pdf"));
            document.open();

            for(int i = 0; i < 4; i++){
                document.add(new Paragraph(""+firsrow.get(i)));
            }

            //Table formar = width , space
            PdfPTable table = new PdfPTable(6);
            table.setWidthPercentage(100);
            table.setSpacingBefore(10f);
            table.setSpacingAfter(10f);
            //Set Column widths
            float[] columnWidths = {1f, 1f, 1f, 1f, 1f, 1f};
            table.setWidths(columnWidths);

            for (int z=0;z<ReadExcel.chess.size();z++){
                table.addCell(ReadExcel.chess.get(z).getNo());
                table.addCell(ReadExcel.chess.get(z).getName());
                table.addCell(ReadExcel.chess.get(z).getFieldid());
                table.addCell(ReadExcel.chess.get(z).getFed());
                table.addCell(ReadExcel.chess.get(z).getRtg());
                table.addCell(ReadExcel.chess.get(z).getClub());
            }
            document.add(table);
            document.close();

        } catch (DocumentException | FileNotFoundException e)
        {
            e.printStackTrace();

        }
    }
}