package marathon3;

import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtils {

	static String projectPath;
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	public ExcelUtils(String excelPath, String sheetName)
	{
		try 
		{
			projectPath = System.getProperty("user.dir");
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static int getRowCount()
	{
		int rowCount=0;
		try 
		{
			rowCount = sheet.getPhysicalNumberOfRows();
			//System.out.println("No. Of Rows : "+ rowCount);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return rowCount;
	}
	public static int getColCount()
	{
		int colCount=0;
		try 
		{

			colCount = sheet.getRow(0).getPhysicalNumberOfCells();
			//System.out.println("No. Of Columns : "+ colCount);
		} 
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return colCount;
	}
	public static String getCellDataString(int rowNum, int colNum)
	{
		String cellData=null;
		try 
		{

			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
		}
		catch (Exception e) 
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return cellData;
	}

}

