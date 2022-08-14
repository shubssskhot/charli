package automateEmail;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Emailpage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/ServiceLogin/identifier?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		Thread.sleep(900);
		driver.findElement(By.id("identifierId")).sendKeys("khotshubham94@gmail.com");
		driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("V67aGc");
		
		
	//not working webpage.
	
	
	
	}

}
