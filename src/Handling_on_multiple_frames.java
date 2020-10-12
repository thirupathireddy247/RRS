import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_on_multiple_frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver", "C://thirupathi//Selenium drivers//chromedriver_win32//chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver d=new ChromeDriver();

		   d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		   d.manage().window().maximize();

		   d.get("https: //www.google.com/recaptcha/api2/demo");

		     d.switchTo().frame(0);

		     d.findElement(By.id("recaptcha - anchor")).click();

		     d.switchTo().defaultContent();

		     d.switchTo().frame(1);

		     System.out.println(d.findElements(By.tagName("iframe")).size());

		     d.findElement(By.xpath(" //*[text()=’Verify’]")).click();
	}

}
