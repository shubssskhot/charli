package aaaPOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {
	@FindBy(id = "userid")
	private WebElement UID;
	@FindBy(id = "password")
	private WebElement PASS;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement SUB;

	public LogInPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void userid(String UI) {
		UID.sendKeys(UI);
	}

	public void Password(String PS) throws InterruptedException {
		PASS.sendKeys(PS);
		Thread.sleep(200);
		SUB.click();

	}

}
