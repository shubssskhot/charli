package aaaUtilityClasses;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class NewUtilityKite
{

	public static String readDataFromPropertyFile(String key) throws IOException
	{
		Properties prop=new Properties();
		FileInputStream myfile=new FileInputStream("C:\\Users\\OM\\eclipse-workspace\\khotSelenium\\myProperty.properties");
		prop.load(myfile);
		String value = prop.getProperty(key);
		return value;
		}
	public static void screenshot(WebDriver driver, String ext) throws IOException {

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("E:\\selenium soft\\ScreenShot backup data\\testcase"+ext+".png");
		FileHandler.copy(src, dest);

	}
	
}
