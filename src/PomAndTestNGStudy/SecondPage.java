package PomAndTestNGStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SecondPage {
	@FindBy(id = "pin") private WebElement PIN;
	@FindBy(xpath = "//button[@type='submit']") private WebElement SUB;
	public SecondPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void pin(String P) throws InterruptedException {
		PIN.sendKeys(P);
		Thread.sleep(200);
		SUB.click();
	}

}
