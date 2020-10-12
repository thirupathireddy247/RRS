import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HoldOnKeyboards {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://thirupathi//Selenium drivers//chromedriver_win32//chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		/*driver.get("https://selenium08.blogspot.com/2020/01/click-and-hold.html");
		
		Actions acn=new Actions(driver);
		//acn.moveToElement(driver.findElement(By.cssSelector("input[id='twotabsearchtextbox']"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
acn.clickAndHold(driver.findElement(By.xpath("//li[@name='G']"))).build().perform();*/
		String baseUrl = "http://www.facebook.com/"; 
		//WebDriver driver = new FirefoxDriver();

		driver.get(baseUrl);
		WebElement txtUsername = driver.findElement(By.id("email"));

		Actions builder = new Actions(driver);
		//org.openqa.selenium.interactions.Action seriesOfActions = builder
			builder.moveToElement(txtUsername)
			.click()
			.keyDown(txtUsername, Keys.SHIFT)
			.sendKeys(txtUsername, "hello")
			.keyUp(txtUsername, Keys.SHIFT).sendKeys(txtUsername, "hello")
			.doubleClick(txtUsername)
			.contextClick()
			.build().perform();
		
			
	//	seriesOfActions.perform() ;
	}

}
