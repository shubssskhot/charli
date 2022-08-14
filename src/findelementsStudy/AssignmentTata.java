package findelementsStudy;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AssignmentTata {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(500);
		driver.findElement(By.name("q")).sendKeys("tata");
		Thread.sleep(500);
		List<WebElement> links = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li"));
		System.out.println(links.size());

		for (WebElement l : links) {
			System.out.println(l.getText());
		}

		System.out.println("================");
		for (WebElement l : links) {
			String er = "Tata Motors";
			String ar = l.getText();
			if (er.equals(ar)) {
				l.click();
				break;

			}
		}
		driver.findElement(By.linkText("Images")).click();
		Thread.sleep(500);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\OM\\Desktop\\salenium\\tata.jpeg");
		FileHandler.copy(src, dest);
		
		

	}

}
