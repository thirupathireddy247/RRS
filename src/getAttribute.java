import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAttribute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C://thirupathi//Selenium drivers//chromedriver_win32//chromedriver.exe");
	    System.setProperty("webdriver.chrome.silentOutput", "true");
	    WebDriver d=new ChromeDriver();
	    d.get("https://www.facebook.com/");
	    
	 WebElement email= d.findElement(By.id("email"));
	 String email_class=email.getAttribute("class");
	 System.out.println(email_class);
	 String email_data_testid=email.getAttribute("data-testid");
	 System.out.println(email_data_testid);
	    

	}

}
