package khotSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsdisplayedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver ();
		driver .get(" https://www.amazon.in/ ");
		
		Thread.sleep(5000);
		
	//driver.findElement(By.linkText("See more")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("headphones");
		Thread.sleep(4000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Zebronics Zeb-Yoga N1 Wireless Earphone")).click();
//		Thread.sleep(10000);
//		driver.findElement(By.id("buy-now-button")).click();
//		
	}}
 