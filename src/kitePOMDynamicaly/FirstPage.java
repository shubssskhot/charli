package kitePOMDynamicaly;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FirstPage {
	@FindBy(id = "userid")private WebElement UID;
	@FindBy(id ="password") private WebElement PASS;
	@FindBy(xpath = "//button[@type='submit']") private WebElement SUB;
	public FirstPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
			}
public void userid(String UI) {
	UID.sendKeys(UI);
}
public void Password(String PA) throws InterruptedException {
	PASS.sendKeys(PA);
	Thread.sleep(200);
	SUB.click();
	
}

	
	
	
}
