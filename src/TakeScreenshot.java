import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C://thirupathi//Selenium drivers//chromedriver_win32//chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
		//driver.manage().deleteCookieNamed("http://35.244.50.236/gpc/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://35.244.50.236/gpc/");
		
		 File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src,new File("C:\\thirupathi\\thiru.png"));
		 

	
	}

}
