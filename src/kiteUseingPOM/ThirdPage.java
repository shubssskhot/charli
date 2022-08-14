package kiteUseingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ThirdPage {
	@FindBy(xpath = "//span[@class='user-id']") private WebElement userid;
	@FindBy(xpath = "//a[@target='_self']") private WebElement logout;
	 
	public ThirdPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	public void useridclick() {
		userid.click();
	}
	public void logout() {
		logout.click();
	}
	
}
