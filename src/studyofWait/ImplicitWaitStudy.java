package studyofWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ImplicitWaitStudy {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Velocity\\Java Class\\Aug-2021 Class\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://vctcpune.com/");
		WebElement Reviews=driver.findElement(By.xpath("(//a[text()='Student Review'])[1]"));

		WebDriverWait w= new WebDriverWait(driver, Duration.ofSeconds(30));// new Syntax
		//WebDriverWait wait= new WebDriverWait(driver, 30); old syntax
		w.until(ExpectedConditions.visibilityOf(Reviews));

	}

}
