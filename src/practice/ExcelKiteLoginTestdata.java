package practice;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExcelKiteLoginTestdata {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://kite.zerodha.com/");
		Thread.sleep(800);
		File myfile = new File("E:\\shubham.xlsx");
		Sheet sheets1 = WorkbookFactory.create(myfile).getSheet("sheet1");
		String ui = sheets1.getRow(0).getCell(1).getStringCellValue();
		String pas = sheets1.getRow(1).getCell(1).getStringCellValue();
		String pin = sheets1.getRow(2).getCell(1).getStringCellValue();
		System.out.println("USER ID    " + ui);
		System.out.println("PASSWORD    " + pas);
		System.out.println("PIN OF USER   " + pin);
		driver.findElement(By.id("userid")).sendKeys(ui);
		driver.findElement(By.id("password")).sendKeys(pas);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("pin")).sendKeys(pin);
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(1800);
	WebElement UID = driver.findElement(By.xpath("//span[@class='user-id']"));
	UID.click();
	Thread.sleep(2500);
	driver.findElement(By.xpath("//a[@target='_self']")).click();
	Thread.sleep(2500);
	driver.quit();

	}

}
