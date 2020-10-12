import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Encapsulation {

	
		WebDriver driver;
		public Encapsulation(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver=driver;
		}
		private By Title =By.xpath("//*[text()='Featured Courses']");
		private By Login=By.xpath("//*[text()='Login']");
		private By Contact=By.xpath("//*[text()='Contact']");
		public WebElement getTitle()
		{
			return driver.findElement(Title);
		}
		public WebElement getContact()
		{
			return driver.findElement(Contact);
		}

		public WebElement getlogin()
		{
			return driver.findElement(Login);
			
		}

	
		// TODO Auto-generated method stub

}
