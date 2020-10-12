import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("http://35.244.50.236/gpc/");
		for(int i=1;i<=4;i++)
		{
			driver.findElement(By.xpath("//mat-button-toggle-group/mat-button-toggle)[' + i + ']" )).click();
			driver.findElement(By.xpath("//app-dashboard/div[3]/div[2]/div/div[2]/button/span")).click();
		}


	}

}
