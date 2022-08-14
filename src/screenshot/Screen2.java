package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen2 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.facebook.com/login/");
	   File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	   File dest = new File("E:\\selenium soft\\ScreenShot backup data\\image1.png");
	   FileHandler.copy(src,dest);
	}
}

