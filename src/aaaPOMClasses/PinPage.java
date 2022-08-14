package aaaPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PinPage {
	@FindBy(id = "pin")
	private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement continuebutton;

	public PinPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void pin(String PI) {
		password.sendKeys(PI);
	}

	public void clickonContinue() {
		continuebutton.click();
	}

}