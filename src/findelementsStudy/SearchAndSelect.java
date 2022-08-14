package findelementsStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchAndSelect {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(500);
		driver.findElement(By.name("q")).sendKeys("vidhan");
		Thread.sleep(500);
		List<WebElement> a = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		Thread.sleep(1500);
		System.out.println(a.size());
		

	}

}
