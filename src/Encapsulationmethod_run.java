import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Encapsulationmethod_run {
	static WebDriver driver;
	public static void main(String arga[])
	{
		
	

	
		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		driver=new ChromeDriver();
		driver.get("http://qaclickacademy.com/");
	
	
				Encapsulation e=new Encapsulation(driver);
				
		Assert.assertTrue(e.getContact().isDisplayed());
		
	}
		
}
