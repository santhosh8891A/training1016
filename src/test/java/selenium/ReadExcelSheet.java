package selenium;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcelSheet {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String path="F:\\Automation Training\\Rough\\Sample1023.xls";
		FileInputStream file=new FileInputStream(path);
		HSSFWorkbook workBook=new HSSFWorkbook(file);
		HSSFSheet sheet=workBook.getSheet("Testing");
		int rowCount=sheet.getLastRowNum();
		int colCount=sheet.getRow(0).getLastCellNum();
		
		for(int i=0;i<rowCount;i++)
		{
			//sheet.getRow(i);
			for(int j=0;j<colCount;j++)
			{
			
				System.out.print(sheet.getRow(i).getCell(j)+" ");
			}
			System.out.println();
		}
		

	}

}
