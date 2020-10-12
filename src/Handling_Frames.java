import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C://thirupathi//Selenium drivers//chromedriver_win32//chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//driver.switchTo().frame(String); //When we use string we can take should be id or name attributes
		//driver.switchTo().frame(index); //When we have multiple windows then we will use indexs
		                                   //if we have 3 frames then windows start with 0,1,2
		int frames_count=driver.findElements(By.tagName("iframe")).size();  //When we calculate the count on iframes in the application
		System.out.println(frames_count);
		//driver.switchTo().parentFrame()  //When we have a multiple frames when we use parent frame it will go to 1st frame
		
		WebElement w=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(w);//When we use webelement we can use this.
		driver.findElement(By.id("draggable")).click();
		driver.switchTo().defaultContent();//When we use this it will go to out of the frame
		driver.findElement(By.xpath("//*[text()='Accept']")).click();
		}

}
