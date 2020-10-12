import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handling_of_Dynami_Table {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "C://thirupathi//Selenium drivers//chromedriver_win32//chromedriver.exe");
	System.setProperty("webdriver.chrome.silentOutput", "true");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/web-table-element.php#l");
	WebElement table=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));
	List<WebElement>rows=table.findElements(By.tagName("tr"));
	for(int row=0;row<rows.size();row++)
	{
		List<WebElement>cells=rows.get(row).findElements(By.tagName("td"));
		System.out.println("number of columns "+ cells.size());
		for(int cell=0;cell<cells.size();cell++)
		{
			System.out.println(cells.get(cell).getText());
		}
	}
	
	}

}
