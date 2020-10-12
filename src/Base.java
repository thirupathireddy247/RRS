import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C://thirupathi//Selenium drivers//chromedriver_win32//chromedriver.exe");
		System.setProperty("webdriver.chrome.silentOutput", "true");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.makemytrip.com/");
		
		
		String[] item_names = {"Brocolli","Cucumber","Tomato"};

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(5000);
WebDriverWait w=new WebDriverWait(driver,5);
		
		additems(driver,item_names);   //Method is static
/*Base b=new Base();
b.additems(driver, item_names); */     //Method is non static

		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input.promoCode")));

		driver.findElement(By.cssSelector("input.promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explicit wait

		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span.promoInfo")));


		System.out.println(driver.findElement(By.cssSelector("span.promoInfo")).getText());
	}
	
		
	
		public static void additems(WebDriver driver,String[]item_names)
		{
			
			int j = 0;
		List<WebElement> productname = driver.findElements(By.xpath("//div/div[1]/div/div/h4"));
		for (int i = 0; i<=productname.size();i++) {
			
			String[] name = productname.get(i).getText().split("-");
			//System.out.println(name);
			String formatName = name[0].trim();
			System.out.println(formatName);
			List itemsneeds = Arrays.asList(item_names);
			//System.out.println(itemsneeds);
			// int j = 0;

			if(itemsneeds.contains(formatName)) {
				// int j=1;;
				j++;
				driver.findElements(By.xpath("//div/div[1]/div/div/div/button")).get(i).click();
				//j++;
				if (j == item_names.length) {
					break;
				}
			}
		}
		
		
		
		
	}

}
