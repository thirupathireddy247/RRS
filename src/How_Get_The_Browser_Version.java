import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class How_Get_The_Browser_Version {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
		// TODO Auto-generated method stub
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
        System.out.println("Browser Name is : "+cap.getBrowserName());
        System.out.println("Browser version is : "+cap.getVersion());           
        System.out.println("Platform is : "+cap.getPlatform().toString());
        driver.quit();
	}

}
