import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Browsers {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver", "C:\\thirupathi\\Selenium drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		/*System.setProperty("wedriver.ie.driver", "C:\\Program Files\\Internet Explorer\\iexplore.exe");
		WebDriver driver=new InternetExplorerDriver();*/
		driver.manage().window().maximize();
		
		
		driver.get("http://brooklyn-dev.techolution.com/");
		

	}

}
