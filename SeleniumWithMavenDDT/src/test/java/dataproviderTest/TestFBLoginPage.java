package dataproviderTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.test.utility.TestUtility;

public class TestFBLoginPage {
	WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C://Users//admin//Downloads//chromedriver_win32//chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
	}

	
	@Test(dataProvider="FacebookLogin")
	public void FBLoginTest(String UserName, String Password) throws InterruptedException {
		
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys(UserName);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys(Password);
		driver.findElement(By.id("u_0_b")).click();
		Thread.sleep(5000);
		driver.getTitle();
		
	}
	
	@DataProvider(name="FacebookLogin")
	public Object[][] testdata()
	{
		
		TestUtility config=new TestUtility("C://Users//admin//workspace//SeleniumWithMavenDDT//src//main//java//com//testdata//TestData.xlsx");
		int rows=config.getRowCount(0);
	    Object [][] data=new Object[rows][2];
	    for(int i=0;i<rows;i++)
	    {
	    	data[i][0]=config.getStringData(0, i, 0);
	    	data[i][1]=config.getStringData(0, i, 1);
	    }
	    return data;
	}
	

	@AfterMethod
	public void tearDown(){

	driver.quit();
	
	}
	 
	}
	 