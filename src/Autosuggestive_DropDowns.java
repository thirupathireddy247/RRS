import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive_DropDowns {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C://thirupathi//Selenium drivers//chromedriver_win32//chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.makemytrip.com/"); //URL in the browser
		driver.findElement(By.id("fromCity")).click();
		WebElement source=driver.findElement(By.xpath("//div/div[2]/div/div/div[2]/div[1]/div[1]/div[1]/div/div/div/input"));
		
		//source.click();
		//source.clear();
		source.sendKeys("MUM");
		Thread.sleep(2000);
		source.sendKeys(Keys.ARROW_DOWN);
		source.sendKeys(Keys.ENTER);
		
		driver.findElement(By.id("toCity")).click();
		WebElement destination=driver.findElement(By.xpath("//div/div[2]/div/div/div[2]/div[1]/div[2]/div[1]/div/div/div/input"));
		//destination.clear();
		destination.sendKeys("DEL");
		Thread.sleep(2000);
		destination.sendKeys(Keys.ARROW_DOWN);
		destination.sendKeys(Keys.ENTER);
	
		
	}

}
