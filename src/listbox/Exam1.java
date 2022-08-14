
package listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exam1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver .get("https://www.facebook.com/login/");
		
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Create ")).click();
		WebElement date = driver.findElement(By.id("day"));
		
		
		Select s=new Select(date);
		s.selectByVisibleText("15");                     //this only done for Select tag name of droup down element
		
		
		
		
	}
 
}
