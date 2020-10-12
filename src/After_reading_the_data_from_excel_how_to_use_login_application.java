import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class After_reading_the_data_from_excel_how_to_use_login_application {

	

			public static void main(String args[]) throws InterruptedException, BiffException, IOException
			{
			WebDriver driver = new FirefoxDriver();
			Sheet s;

			FileInputStream fi = new FileInputStream("D:\\Selenium WebDriver\\VineetFolderNew\\vineettest.xls");
			Workbook w = Workbook.getWorkbook(fi);
			s = w.getSheet(0);
			int z=s.getRows();
			System.out.println("no of rows:"+z);
			driver.get("http://www.gmail.com");
			for(int row=0; row <=s.getRows();row++)
			{
			String username = s.getCell(0, row).getContents();
			System.out.println("Username "+username);
			//driver.get("http://www.gmail.com");
			driver.manage().window().maximize();
			driver.findElement(By.name("Email")).sendKeys(username);
			String password= s.getCell(1, row).getContents();
			System.out.println("Password "+password);
			driver.findElement(By.name("Passwd")).sendKeys(password);
			Thread.sleep(10000);
			driver.findElement(By.name("signIn")).click();
			if((driver.findElement(By.xpath("//span[@id='errormsg_0_Passwd']"))).isDisplayed())
			{
			System.out.println("Login Fail !Error Exists");
			String Error=driver.findElement(By.xpath("//span[@id='errormsg_0_Passwd']")).getText();
			System.out.println("The Error is :"+Error);
			}
			else
			{
			System.out.println("Login Pass");
			}
			Thread.sleep(30000);
			String InboxURL = driver.getCurrentUrl();
			System.out.println(InboxURL);
			driver.findElement(By.xpath("//span[@class='gb_d gbii']")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("gb_71")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='account-chooser-link']")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[@id='account-chooser-add-account']")).click();
			Thread.sleep(2000);
			//driver.close();
			}
			driver.quit();
			}}
		
	


