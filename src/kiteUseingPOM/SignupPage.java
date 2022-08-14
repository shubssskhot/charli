 package kiteUseingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage {

	@FindBy(id = "userid")
	private WebElement userID;
	@FindBy(id = "password")
	private WebElement password;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement loginButton;

	public SignupPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void senduserid() {
		userID.sendKeys("ELR321");
	}

	public void sendpassword() {
		password.sendKeys("Dhana1111");
	}

	public void clickonsubmit() {
		loginButton.click();
	}
}
