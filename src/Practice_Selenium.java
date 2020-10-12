import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Practice_Selenium {
	public static void main(String[] args)  {
		
		
		
//System.setProperty("webdriver.gecko.driver", "C:\\thirupathi\\Selenium drivers\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
WebDriver driver =new ChromeDriver();
driver.get("http://demo.guru99.com/test/web-table-element.php#l");
WebElement table=driver.findElement(By.xpath("//*[@id=\"leftcontainer\"]/table"));

List<WebElement> rows=table.findElements(By.tagName("tr"));
System.out.println(rows.size());

for(int row=0;row<rows.size();row++)
{
List<WebElement> cells=rows.get(row).findElements(By.tagName("td"));
System.out.println(cells.size());
for(int cell=0;cell<cells.size();cell++)
{
	System.out.println(cells.get(cell).getText());
}
}







	
	}
		
		
		
		
		

}
