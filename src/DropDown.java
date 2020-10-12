import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		WebElement w=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		//w.click();
		Select s=new Select(w);
				//driver.findElement(By.xpath("//*[@name='ctl00$mainContent$DropDownListCurrency'] /option[@value='USD']")));
		//s.selectByIndex(3);
		//s.selectByValue("2");
		s.selectByVisibleText("USD");
	
		
		
	}

}
