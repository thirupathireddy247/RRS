import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://thirupathi//Selenium drivers//chromedriver_win32//chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.makemytrip.com/");
		driver.get("https://www.spicejet.com/default.aspx");
		Thread.sleep(2000);
		WebElement w = driver.findElement(By.id("familyandfriend"));
		String a = w.getText();
		System.out.println(a);
		w.click();
		System.out.println(w.isSelected());
		Assert.assertEquals(a, "Family and Friends");
		

	}

}
