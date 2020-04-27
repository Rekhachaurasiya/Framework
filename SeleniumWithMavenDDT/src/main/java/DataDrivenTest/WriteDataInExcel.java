package DataDrivenTest;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataInExcel {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("C://Users//admin/Desktop//TestData.xlsx");
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet=workbook.createSheet("writedata");
		for(int i=0;i<5;i++) {
			XSSFRow row=sheet.createRow(i);
			
			for(int j=0;j<5;j++) {
				row.createCell(j).setCellValue("Rekha");
			}
		}
		workbook.write(fos);
		fos.close();
		
		
		
	}

}
