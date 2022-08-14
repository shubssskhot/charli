package kitePOMDynamicaly;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PomAndTestNGStudy.SecondPage;

public class TestClassDynamic {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(900);
		File myfile=new File("E:\\shubham.xlsx");
		Sheet Excel = WorkbookFactory.create(myfile).getSheet("sheet1");
		
		FirstPage F=new FirstPage(driver);
		F.userid(Excel.getRow(0).getCell(1).getStringCellValue());
		F.Password(Excel.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(500);
		SecondPage S=new SecondPage(driver);
		S.pin(Excel.getRow(2).getCell(1).getStringCellValue());
		Thread.sleep(1500);
		MainPage M=new MainPage(driver);
		M.CurrentNifty();
		
		
		
		
		

}
}