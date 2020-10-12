import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class SSL_Certificates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DesiredCapabilities d=new DesiredCapabilities();
		//d.acceptInsecureCerts()
		d.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
		d.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		ChromeOptions c=new ChromeOptions();
		c.merge(d);
		System.setProperty("webdriver.chrome.driver",
				"C://thirupathi//Selenium drivers//chromedriver_win32//chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
		
		

	}

}
