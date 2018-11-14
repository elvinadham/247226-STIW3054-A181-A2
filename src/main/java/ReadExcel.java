
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ReadExcel {

    public static ArrayList<publicformat> chess = new ArrayList<>();
    public static ArrayList<String> firstrow = new ArrayList<>();

    //  public static void main (String[]args) {
    public static List<String> All() {


        try {
            // Location of the source file
            FileInputStream file = new FileInputStream(new File("C:\\Users\\SPIN 5\\Downloads\\ChestRanking.xlsx"));
            //Format excel converter
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);

            for(int w = 0 ; w <1; w++){
                XSSFRow R1 = sheet.getRow(0);
                XSSFRow R2 = sheet.getRow(1);
                XSSFRow R3 = sheet.getRow(2);
                XSSFRow R4 = sheet.getRow(3);

                String  a1 = R1.getCell(0).getStringCellValue();
                String b1 = R2.getCell(0).getStringCellValue();
                String c1 = R3.getCell(0).getStringCellValue();
                String d1 = R4.getCell(0).getStringCellValue();

                firstrow.add(new String(a1));
                firstrow.add(new String(b1));
                firstrow.add(new String(c1));
                firstrow.add(new String(d1));

                System.out.println(a1);
                System.out.println(b1);
                System.out.println(c1);
                System.out.println(d1);
            }

            for(int i=4; i<155; i++){

                XSSFRow row = sheet.getRow(i);

                Cell cell = row.getCell(0);
                String num = String.valueOf(cell);

                Cell cell1 = row.getCell(2);
                String nam = String.valueOf(cell1);

                Cell cell2 = row.getCell(3);
                String fide = String.valueOf(cell2);

                Cell cell3 = row.getCell(4);
                String fed = String.valueOf(cell3);

                Cell cell4 = row.getCell(5);
                String rtg = String.valueOf(cell4);

                Cell cell5 = row.getCell(6);
                String club = String.valueOf(cell5);

                chess.add(new publicformat(num,nam,fide,fed,rtg,club));

                System.out.printf("%4s%40s%5s%5s%10s%25s",num,nam,fide,fed,rtg,club);
                System.out.println();

            }


        } catch (Exception e) {

        }
        return firstrow;
    }
}