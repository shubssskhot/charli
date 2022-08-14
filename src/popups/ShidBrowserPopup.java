package popups;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShidBrowserPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links");
		Thread.sleep(500);
		driver.findElement(By.name("NewWindow")).click();
		Set<String> sk = driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<String>(sk);
		String b = a.get(1);
		driver.switchTo().window(b);
		Thread.sleep(500);
		driver.manage().window().maximize();
		
		
		
		
		
	}

} 
