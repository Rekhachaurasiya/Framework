package DataDrivenTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadWriteUtility {
	public static void main(String[] args) throws IOException {
		try {
		File src=new File("C://Users//admin/Desktop//TestData1.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet("sheet1");
	    int row=sheet.getLastRowNum();
	    int column=sheet.getRow(row).getLastCellNum();
	    System.out.println(row+ " "+column);
	    for(int i=0;i<row;i++) {
	    	XSSFRow currentrow=sheet.getRow(i);
	    	for(int j=0;j<column;j++)
	    	{
	    		String value=currentrow.getCell(j).toString();
	    		System.out.print(" "+value);
	    	}
	    	 System.out.println();
	    }
	   
	    sheet.getRow(0).createCell(2).setCellValue("Status");
	    sheet.getRow(1).createCell(2).setCellValue("Pass");
	    sheet.getRow(2).createCell(2).setCellValue("Fail");
	    sheet.getRow(3).createCell(2).setCellValue("Fail");
	    FileOutputStream fos=new FileOutputStream("C://Users//admin/Desktop//TestData1.xlsx");
	    workbook.write(fos);
	    System.out.println("create the data on the sheet");
	    fos.close();
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	    
	    
	    
		
		
		
	}

}
