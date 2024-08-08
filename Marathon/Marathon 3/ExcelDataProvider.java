package marathon3;

public class ExcelDataProvider {	
	public static ExcelUtils excel;
	public static Object[][] testData(String excelpath, String sheetName)
	{
		excel = new ExcelUtils(excelpath,sheetName);
		int rowCount = ExcelUtils.getRowCount();
		int colCount = ExcelUtils.getColCount();

		Object data[][] = new Object[rowCount-1][colCount];

		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String cellData = ExcelUtils.getCellDataString(i, j);
				data[i-1][j]=cellData;
			}
		}
		return data;
	}
}
