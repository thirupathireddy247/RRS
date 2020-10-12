import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestive_DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
		
		 driver.get("https://www.apsrtconline.in/oprs-web/");
		 driver.findElement(By.id("fromPlaceName")).sendKeys("vija");
		 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN);
		 Thread.sleep(2000);
		 System.out.println(driver.findElement(By.id("fromPlaceName")).getText());
		 //when the class is hidden we should use javascript Dom because selenium
		 //can't handle hidden elements //Javascript DOM can extract hidden elements
		 //because selenium cannot identify hidden elements - (Ajax implementation)
		 //investigate the properties of object if it have any hidden text
		 JavascriptExecutor js=(JavascriptExecutor)driver; 
		 String s="return document.getElementById(\"fromPlaceName\").value;"; 
		 String text=(String) js.executeScript(s); 
		 System.out.println(text);
		 
		 while (!text.equalsIgnoreCase("VIYRAI")); 
		 {
		 driver.findElement(By.id("fromPlaceName")).sendKeys(Keys.DOWN); 
		 text=(String) js.executeScript(s); 
		 System.out.println(text); 
		 }
		 
		/*driver.get("https://www.ksrtc.in");
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys("BENG");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

		System.out.println(driver.findElement(By.xpath("//input[@id='fromPlaceName']")).getText());

		//Javascript DOM can extract hidden elements
		//because selenium cannot identify hidden elements - (Ajax implementation)
		//investigate the properties of object if it have any hidden text

		//JavascriptExecutor
		JavascriptExecutor js= (JavascriptExecutor)driver;

		String script = "return document.getElementById(\"fromPlaceName\").value;";
		String text=(String) js.executeScript(script);
		System.out.println(text);
		int i =0;
		//BENGALURU INTERNATION AIPORT
		while(!text.equalsIgnoreCase("BENGALURU INTATION AIPORT"))
		{
		i++;
		driver.findElement(By.xpath("//input[@id='fromPlaceName']")).sendKeys(Keys.DOWN);

		text=(String) js.executeScript(script);
		System.out.println(text);
		if(i>10)
		{
		break;
		}

		}

		if(i>10)
		{
		System.out.println("Element not found");
		}
		else
		{
		System.out.println("Element  found");
		}
*/







		
		
		
		


	}

}
