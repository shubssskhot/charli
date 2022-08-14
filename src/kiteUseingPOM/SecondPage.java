package kiteUseingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {
	@FindBy(id = "pin")
	private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement continuebutton;

	public SecondPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void pin() {
		password.sendKeys("982278");
	}

	public void clickonContinue() {
		continuebutton.click();
	}
}
