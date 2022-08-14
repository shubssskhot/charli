package seleniumpractice;

import java.util.ArrayList;
import java.util.Set;                                                    //error

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Focuschange {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://skpatro.github.io/demo/links");
		Thread.sleep(5000);
		driver.findElement(By.name("NewWindow")).click();
		Set<String> sk = driver.getWindowHandles();
		ArrayList<String> a=new ArrayList<String>(sk);
		System.out.println(a.size());
		String c=a.get(0);
		String b = a.get(1);
		Thread.sleep(5000);
		driver.switchTo().window(b);
		Thread.sleep(5000);
		driver.manage().window().maximize();
		//driver.close();
		Thread.sleep(5000);
		
		
		driver.switchTo().window(c);
		Thread.sleep(500);
		String myText = driver.findElement(By.xpath("//p[contains(text(),' link in new tab')]")).getText();
		String text = driver.findElement(By.xpath("//p[contains(text(),' link in new tab')]")).getText();
		driver.findElement(By.xpath("(//input[@type='button'])[2]")).click();
	//	WebElement text = driver.findElement(By.xpath("//h3[@class='vc_custom_heading']"));
		System.out.println(myText);
	}

}
