import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Multiple_Tabs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", "C://thirupathi//Selenium drivers//chromedriver_win32//chromedriver.exe");
System.setProperty("webdriver.chrome.silentOutput", "true");
WebDriver driver=new ChromeDriver();
driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");

driver.findElement(By.xpath("//*[text()='Help']")).click();
System.out.println("Brfore switching");
System.out.println(driver.getTitle());
//w.click();
//driver.switchTo().window().

  Set<String> s=driver.getWindowHandles(); Iterator<String> i=s.iterator();
  String parentwindow=i.next();
  System.out.println(parentwindow); //w.click();
  
  String Childwindow=i.next(); 
  System.out.println(Childwindow);
  driver.switchTo().window(Childwindow); 
  System.out.println("After switching");
  System.out.println(driver.getTitle());
  driver.findElement(By.xpath("//*[text()='Sign in']")).click();
 
  driver.switchTo().window(parentwindow);//it will gp to parent window
  //driver.switchTo().defaultContent();
  System.out.println("Back to parent window");
  System.out.println(driver.getTitle());
  
 


	}

}
