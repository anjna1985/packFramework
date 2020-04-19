package parameterizationTestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestparameterizationExcel {

	public static ExcelReader excel = null;

	@Test(dataProvider = "getData")
	public void doLogin(String username, String password, String is_correct) {

		System.out.println(username + "----" + password+"----"+is_correct);
	}

	@DataProvider
	public Object[][] getData() {

		if (excel == null) {
			excel = new ExcelReader("C:\\SeleniumMaster\\my-app\\testngdata.xlsx");
		}
		String sheetname = "loginTest";
		int rows = excel.getRowCount(sheetname);
		int cols = excel.getColumnCount(sheetname);

		Object[][] data = new Object[rows - 1][cols];

		for (int rowNum = 2; rowNum <= rows; rowNum++) {
			for (int colNum = 0; colNum < cols; colNum++) {
				 data[rowNum - 2][colNum] = excel.getCellData(sheetname, colNum, rowNum);
			}
		}
		return data;
	}

}
