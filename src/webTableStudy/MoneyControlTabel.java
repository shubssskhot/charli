package webTableStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MoneyControlTabel {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.moneycontrol.com/stocksmarketsindia/");
		Thread.sleep(1800);
		List<WebElement> tabledata = driver.findElements(By.xpath("(//table[@cellpadding='0'])[21]/tr"));
		
		System.out.println(tabledata.size());
	
	
	
	}

}
