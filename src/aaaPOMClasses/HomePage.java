package aaaPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//span[@class='user-id']") private static WebElement USID;
	@FindBy(xpath = "//a[@target='_self']") private static WebElement logout;
	
	
	public  HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public static String userid() {
		String atualuserid = USID.getText();
		return atualuserid ;
	}
	public static void logouts() {
		USID.click();
		logout.click();
		
	}
}
