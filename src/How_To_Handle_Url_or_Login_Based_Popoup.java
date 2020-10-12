import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class How_To_Handle_Url_or_Login_Based_Popoup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
WebDriver driver =new ChromeDriver();
		String URL = "http://rajkumar:myPassword@www.softwaretestingmaterial.com";
		driver.get(URL);
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}

}
