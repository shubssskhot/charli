package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WhatsappAuto {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		Thread.sleep(1500);
		driver.get("http://demo.automationtesting.in/Index.html");
		driver.findElement(By.id("btn2")).click();
		Thread.sleep(600);
		WebElement fn = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		fn.sendKeys("Shubham");
		WebElement ln = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		ln.sendKeys("Khot");
		WebElement add = driver.findElement(By.xpath("//textarea[@class='form-control ng-pristine ng-untouched ng-valid']"));
		add.sendKeys("Sambhaji Nagar Kolhapur");
		WebElement eml = driver.findElement(By.xpath("//input[@type='email']"));
		eml.sendKeys("khotshubham94@gmail.com");
		WebElement ph = driver.findElement(By.xpath("//input[@type='tel']"));
		ph.sendKeys("8411040083");
		driver.findElement(By.xpath("//input[@value='Male']")).click();
		driver.findElement(By.id("checkbox1")).click();
		driver.findElement(By.id("checkbox3")).click();
	//	WebElement lng = driver.findElement(By.id("msdd"));
		//Select l=new Select(lng);
	//	l.selectByValue("English");
		WebElement sk = driver.findElement(By.id("Skills"));
		Select s=new Select(sk);
		s.selectByVisibleText("AutoCAD");
		
	//driver.findElements(By.a);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
