package selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelWriteExistingSheet {

	public static void main(String[] args) throws IOException {
      
		String path="F:\\Automation Training\\Rough\\Sample12262024.xls";
		FileInputStream file=new  FileInputStream(path);
		HSSFWorkbook workbook=new HSSFWorkbook(file);
		HSSFSheet sheet=workbook.getSheet("Sample");
		int rowcount=sheet.getLastRowNum();//
		int coulCount=sheet.getRow(0).getLastCellNum();
		HSSFRow row;
		HSSFCell cell=null;
		for(int i=rowcount;i<10;i++)
		{
			row=sheet.createRow(i);
			for(int j=0;j<5;j++)
			{
				row.createCell(j).setCellValue("This is row : "+i+"Column : "+j);
			}
		}
		
		FileOutputStream fo=new FileOutputStream(path);
		workbook.write(fo);
		workbook.close();
		
		

	}

}
