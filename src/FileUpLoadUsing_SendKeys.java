import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpLoadUsing_SendKeys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\thirupathi\\Selenium drivers\\chromedriver_win32\\chromedriver.exe");
				System.setProperty("webdriver.chrome.silentOutput", "true");
				WebDriver w=new ChromeDriver();
				w.get("http://www.asterhr.com/post-your-resume/");
				WebElement choosfile=w.findElement(By.xpath("(//input[@type='file'])[2]"));
				choosfile.sendKeys("C:\\Users\\TECHOLUTION\\Downloads\\Thiru resume-2020.docx");
				

	}

}
