import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handlng_Tables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\\\thirupathi\\\\Selenium drivers\\\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/live-cricket-scorecard/22585/aus-vs-nz-1st-odi-new-zealand-tour-of-australia-2020");
		 WebElement table=driver.findElement(By.xpath("//div[@class='cb-col cb-col-100 cb-ltst-wgt-hdr']"));
				 int rowcount=table.findElements(By.xpath("//div[@class='cb-col cb-col-100 cb-scrd-itms']")).size();
				 int columncount=table.findElements(By.xpath("/html/body/div/div[2]/div[4]/div[2]/div[2]/div[1]/div/div[3]")).size();
				 System.out.println(columncount);
				 int sum=0;
				 for(int i=1;i<columncount -2;i++)
				 {
					String values=table.findElements(By.xpath("/html/body/div/div[2]/div[4]/div[2]/div[2]/div[1]/div/div[3]")).get(i).getText();
				 int columnvalues=Integer.parseInt(values);
				 System.out.println(columnvalues);
				 sum=sum+columnvalues;
				 }
				 //System.out.println(sum);
				 
		String Extras=driver.findElement(By.xpath("(//div[text()='Extras']/following-sibling::div)[1]")).getText();
		int extrasvalue=Integer.parseInt(Extras);
		// System.out.println(extrasvalue);
		 int totalsumvalues=sum+extrasvalue;
		 System.out.println(totalsumvalues);
		 
		 String Total=driver.findElement(By.xpath("(//div[text()='Total']/following-sibling::div)[1]")).getText();
		 int Totalvalue=Integer.parseInt(Total);
		 System.out.println(Totalvalue);
		 if(Totalvalue==totalsumvalues)
		 {
			 System.out.println("Countmatched");
		 }
		 else
		 {
			 System.out.println("Count not matched");
		 }
	}

}
