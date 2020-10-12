import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        /*driver.get("https://www.makemytrip.com/");
        driver.findElement(By.xpath("//label[@for='departure']")).click();
        //String Month=driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText();
//System.out.println(Month);
while(!driver.findElement(By.xpath("(//div[@class='DayPicker-Caption'])[1]")).getText().contains("September 2020"))
{
	Thread.sleep(5000);
	driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
}
        int count=driver.findElements(By.xpath("//div[@role='gridcell']")).size();
        System.out.println(count);
        for(int i=0;i<=count;i++)
        	 {
        	String date=driver.findElements(By.xpath("//div[@role='gridcell']")).get(i).getText();
        	
        	if(date.equalsIgnoreCase("17"))
        	{
        		driver.findElements(By.xpath("//div[@role='gridcell']")).get(i).click();
        		break;
        	}
        }*/
        driver.get("https://www.path2usa.com/travel-companions");
      //April 23
      driver.findElement(By.xpath(".//*[@id='travel_date']")).click();


      while(!driver.findElement(By.cssSelector("[class='datepicker-days'] [class='datepicker-switch']")).getText().contains("May"))
      {
      driver.findElement(By.cssSelector("[class='datepicker-days'] th[class='next']")).click();
      }


      List<WebElement> dates= driver.findElements(By.className("day"));
      //Grab common attribute//Put into list and iterate
      int count=driver.findElements(By.className("day")).size();

      for(int i=0;i<count;i++)
      {
      String text=driver.findElements(By.className("day")).get(i).getText();
      if(text.equalsIgnoreCase("21"))
      {
      driver.findElements(By.className("day")).get(i).click();
      break;
      }

      }

	}

}

        