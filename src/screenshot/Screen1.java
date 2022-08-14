package screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screen1 {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","E:\\selenium soft\\selenium\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver ();
		
		driver.manage().window().maximize();
		driver .get("https://www.facebook.com/login/");
		
		Thread.sleep(5000);
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		File dest=new File(" E:\\selenium soft\\ScreenShot backup data\\facebook5.jpeg ");//this extension make the file to be store of same name only repetative not accepted.
		FileHandler.copy(src, dest);
		 //random class should be used to take multiple screenshots .
		
		
		
		
	}

} 
