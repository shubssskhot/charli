package kitePOMDynamicaly;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

	@FindBy(xpath ="((((//div[@class='instrument-widget'])/span)[4])/span)[1]" ) private WebElement sen;
	@FindBy(xpath = "(//span[@class='last-price up'])[1]") private WebElement nif ;
	
	
	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	public void CurrentNifty() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("current sensex is"+sen.getText());
		System.out.println("current Nifty is "+nif.getText());
	}
	
}
