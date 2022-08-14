package practice;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Omm1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demoqa.com/nestedframes");
		
		driver.switchTo().frame("frame1");
		WebElement txt = driver.findElement(By.tagName("body"));
		
		System.out.println(txt.getText());
		Thread.sleep(500);
		driver.switchTo().frame(0);
		WebElement tmt = driver.findElement(By.tagName("body"));
		System.out.println(tmt.getText());
		
		File pic = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\selenium soft\\ScreenShot backup data\\iframetask.jpeg");
		FileHandler.copy(dest, pic);
		
		
		
	}

}
