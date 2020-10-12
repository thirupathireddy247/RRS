import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Interview_Questions_Part_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	   int link_counts_on_webpage=  driver.findElements(By.tagName("a")).size(); //Links on webpage
	   System.out.println(link_counts_on_webpage);
	 WebElement Footerpage=  driver.findElement(By.id("gf-BIG") );
	   int Footerpage_links=Footerpage.findElements(By.tagName("a")).size();     //Links on footer page
	   System.out.println(Footerpage_links);
	   WebElement columnlinks_Onfooterpage=Footerpage.findElement(By.xpath("(//tbody/tr/td/ul)[1]"));  //links on particular column
	   int columnlinks=columnlinks_Onfooterpage.findElements(By.tagName("a")).size();
	   System.out.println(columnlinks);
	   for(int i=1;i<columnlinks;i++)
	   {
		   //String click_on_links=Keys.chord(Keys.CONTROL,Keys.ENTER);
		   columnlinks_Onfooterpage.findElements(By.tagName("a")).get(i).sendKeys(Keys.CONTROL,Keys.ENTER); //By using this it will go one by one window 
		   //columnlinks_Onfooterpage.findElements(By.tagName("a")).get(i).click();
		   Thread.sleep(5000);
		   
	   }
	   
	   Set<String>s=driver.getWindowHandles();
	   Iterator<String> it=s.iterator();
	   while(it.hasNext())
	   {
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
	   }
	   
	   
	   
	   
		
		

	}

}
