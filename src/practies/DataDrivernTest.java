package practies;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDrivernTest {

	public static void main(String[] args) throws IOException 
	{
		OrangeHRMLibrary app=new OrangeHRMLibrary();
		File src=new File("C:\\Users\\admin\\Desktop\\TestData.xlsx");
		FileInputStream fis=new FileInputStream(src);
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet ws=wb.getSheetAt(0);
		int rcnt=ws.getLastRowNum();
		app.appLaunch();
		app.appLogin();
		for (int i = 1; i <=rcnt; i++) 
		{
			String fName=ws.getRow(i).getCell(0).getStringCellValue();
			String lName=ws.getRow(i).getCell(1).getStringCellValue();
			System.out.println(fName+"--"+lName);
			String results=app.empAdd(fName, lName);
			
			ws.getRow(i).createCell(2).setCellValue(results);
			
			FileOutputStream fos=new FileOutputStream(src);
			wb.write(fos);
		}
		
wb.close();
app.appLogout();
app.appClose();
	}

}
