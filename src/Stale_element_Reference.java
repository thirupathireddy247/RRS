import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Stale_element_Reference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
        driver.findElement(By.id("email")).sendKeys("9441426563");
        driver.findElement(By.id("pass")).sendKeys("9603775392");
        driver.findElement(By.id("u_0_b")).click();
        
        
	}

}
