package aaaUtilityClasses;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class UtilityKite {

	public static String testData(int row, int cell) throws EncryptedDocumentException, IOException {

		File f = new File("E:\\shubham.xlsx");
		String myfile = WorkbookFactory.create(f).getSheet("sheet1").getRow(row).getCell(cell).getStringCellValue();
		return myfile;
	}

	public static void screenshot(WebDriver driver, String ext) throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\selenium soft\\ScreenShot backup data\\testcase"+ext+".png");
		FileHandler.copy(src, dest);

	}

}
