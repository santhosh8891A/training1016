package selenium;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
      
		String path="F:\\Automation Training\\Rough\\Sample12262024.xls";
		HSSFWorkbook workbook=new HSSFWorkbook();
		HSSFSheet sheet=workbook.createSheet("Sample");
		HSSFRow row;
		HSSFCell cell=null;
		for(int i=0;i<5;i++)
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
