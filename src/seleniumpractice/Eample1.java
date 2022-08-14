package seleniumpractice;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Eample1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		
System.setProperty("webdriver.chrome.driver","E:\\selenium soft\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		
		//WebElement heading = driver.findElement(By.l
		Thread.sleep(2500);
		//System.out.println(heading.getText());
		 driver.switchTo().frame("frame1");
		 Thread.sleep(2500);
		 driver.switchTo().frame("frame3");
		 
		 driver.findElement(By.xpath("//input[@type='checkbox']")).click();
 
			driver.switchTo().defaultContent();
			Thread.sleep(2500);
			driver.switchTo().frame("frame2");

			WebElement id = driver.findElement(By.id("animals"));
			Select s=new Select(id);
			s.selectByVisibleText("Avatar");
			
			
			
		 		
		
		
		
		
		
	}

}
