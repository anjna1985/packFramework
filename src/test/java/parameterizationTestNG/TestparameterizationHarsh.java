package parameterizationTestNG;

import java.util.Hashtable;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestparameterizationHarsh {

	public static ExcelReader excel = null;

	@Test(dataProvider = "getData")
	public void testData(Hashtable<String, String> data) {

		System.out.println(data.get("username")+"----"+data.get("password")+"----"+data.get("age")+"----"+data.get("gender"));
	}

	@DataProvider
	public Object[][] getData() {

		if (excel == null) {
			excel = new ExcelReader(System.getProperty("user.dir")+"\\testngdatahashtable1.xlsx");
		}
		//System.out.println(System.getProperty("user.dir"));
		String sheetname = "loginTest";
		int rows = excel.getRowCount(sheetname);
		int cols = excel.getColumnCount(sheetname);

		Object[][] data = new Object[rows-1][1];

		Hashtable<String,String>table = null;

		for (int rowNum = 2; rowNum <= rows; rowNum++) {

			table = new Hashtable<String,String>();

			for (int colNum = 0; colNum < cols; colNum++) {

				table.put(excel.getCellData(sheetname, colNum, 1), excel.getCellData(sheetname, colNum, rowNum));
				data[rowNum - 2][0] = table;
			}
		}
		return data;
	}

}
