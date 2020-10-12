import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class How_to_open_Incognito_window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//chrome
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		DesiredCapabilities capabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		options.addArguments("incognito");
		
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		
		WebDriver driver =new ChromeDriver(capabilities);
		driver.get("https://brooklyn-dev.techolution.com/login");
		
		//firefox
		
		/*System.setProperty("webdriver.gecko.driver", "C:\\thirupathi\\Selenium drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		FirefoxOptions opts = new FirefoxOptions();
		opts.addArguments("-private");
		WebDriver driver = new FirefoxDriver(opts);
		 
		driver.get("https://brooklyn-dev.techolution.com/login");*/
		
	}

}
