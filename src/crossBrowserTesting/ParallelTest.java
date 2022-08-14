package crossBrowserTesting;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.Test;

public class ParallelTest {
	public WebDriver driver;
        @Test
        public void FirefoxTest() {	 
        	 System.setProperty("webdriver.gecko.driver", "E:\\selenium soft\\selenium\\geckodriver.exe");
	    driver = new FirefoxDriver();	  
	    driver.get("https://www.demoqa.com"); 
	    driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	    driver.quit();
         }
 
        @Test
 	public void ChromeTest()
 	{ 
        	System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("https://www.demoqa.com"); 
	  driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[1]/div/div[1]")).click();
	  driver.quit();
 	}
}
