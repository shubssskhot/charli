package findelementsStudy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindMultiLinks {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium soft\\selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.amazon.in/?&ext_vrnc=hi&tag=googinhydr1-21&ref=pd_sl_833o4zmtnn_b&adgrpid=55759171661&hvpone=&hvptwo=&hvadid=294130660745&hvpos=&hvnetw=g&hvrand=4819916183992445750&hvqmt=b&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007780&hvtargid=kwd-326600735004&hydadcr=5840_1914862&gclid=EAIaIQobChMIlZKewbbf-AIVy7WWCh0z9wnOEAAYASAAEgLzf_D_BwE");

		Thread.sleep(500);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());                                      //how many links
		
		
  			
			
			
			
			
		}
		
	}


