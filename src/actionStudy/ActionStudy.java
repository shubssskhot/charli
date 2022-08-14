package actionStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionStudy {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://vctcpune.com/selenium/practice.html");
		Thread.sleep(500);
		WebElement ab = driver.findElement(By.linkText("About Us"));
		Actions a=new Actions(driver);
		a.moveToElement(ab).perform();
		Thread.sleep(500);
		a.click().perform();
		Thread.sleep(500);
	//	WebElement word = driver.findElement(By.linkText("Start Selenium Practice"));
		
		System.out.println("word.getText()");
	
		
	}

}
