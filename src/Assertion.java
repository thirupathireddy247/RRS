import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Assertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
		
		
        driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/default.aspx");
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0")).click();
		//Assert.assertTrue(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		Assert.assertFalse(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
		driver.findElement(By.id("ctl00_mainContent_view_date2")).click();
		

	}

}
