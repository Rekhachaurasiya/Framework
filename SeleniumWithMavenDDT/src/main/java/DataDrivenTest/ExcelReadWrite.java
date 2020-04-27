package DataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWrite {
	public static void main(String[] args) throws IOException {
		 File src=new File("C://Users//admin/Desktop//TestData1.xlsx");
		 FileInputStream fis=new FileInputStream(src);
		 XSSFWorkbook wb=new XSSFWorkbook(fis);
		 XSSFSheet s=wb.getSheet("Sheet1");
		 int rowcount=s.getLastRowNum();
		 System.out.println(rowcount);
		 int columnscount=s.getRow(rowcount).getLastCellNum();
		 System.out.println(columnscount);
		 for(int i=0;i<rowcount;i++) {
			XSSFRow currentrow=s.getRow(i);
		 for(int j=0;j<columnscount;j++) {
			 String value=currentrow.getCell(j).toString();
			 System.out.print(" " +value);
		 }
		 System.out.println();
		 }
	
		 
		 
	}
	
	

}
