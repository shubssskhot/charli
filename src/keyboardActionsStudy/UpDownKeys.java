package keyboardActionsStudy;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class UpDownKeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		Thread.sleep(500);
		WebElement button = driver.findElement(By.id("day"));
		Actions a = new Actions(driver);
		a.click(button).perform();
		for (int i = 0; i <= 6; i++) {

			a.sendKeys(Keys.ARROW_DOWN).perform();
		}
		
		a.sendKeys(Keys.ENTER).perform();
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));

		a.click(month).perform();
		for (int i = 0; i <= 1; i++) {

			a.sendKeys(Keys.UP).perform();
		}
		a.sendKeys(Keys.ENTER).perform();

		a.click(year).perform();
		for (int i = 0; i <= 27; i++) {

			a.sendKeys(Keys.ARROW_DOWN).perform();
		}
		a.sendKeys(Keys.ENTER).perform();

	}

}
