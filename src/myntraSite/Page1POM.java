package myntraSite;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1POM {
	
	@FindBy(xpath = "//a[text()='Topwear']")private WebElement a;
	
	
	public Page1POM(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void click() {
		a.click();
		
	}
	

}
