package com.dc.rns.qa.TestCases;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/*import com.dc.rns.qa.Pages.LoginPage;
import com.dc.rns.qa.util.ExcelReader;
import com.dc.rns.qa.util.Screenshot;*/

/*import com.dc.rns.qa.Base.*;
import com.dc.rns.qa.ExtentReports.ExtentReport;
import com.dc.rns.qa.ExtentReports.ExtentReport_New;*/

public class LoginPageTest
{

	public static WebDriver driver;
	@Test
	public void dockerselgitjenk() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		System.out.println("Tried one more time again");
		
		driver.get("http://www.google.com");
		
		driver.findElement(By.name("q")).sendKeys("Learn Automation");
		
		Thread.sleep(5000);
		
	}	
	/*public class LoginPageTest extends BaseTest{

	LoginPage loginpage;
	DCDashBoard dashboard;
	HomePage homepage;	
	ExcelReader rd;	
	
	
	//ExtentReport extr;
	//ExtentTest test;
	static ExtentReports rt;
	

	//public static ExtentReports extent;
	//public static ExtentTest test;
 

	public static String sheetname = "login";
	
	public LoginPageTest()
	{
		super();
	}

	@BeforeMethod
	public void setup()
	{
		browsersetup();
		rd = new ExcelReader();
		dashboard =new DCDashBoard();
		dashboard.LoginBtnClick();
		loginpage= new LoginPage();
	
		//sc = new Screenshot();
		
	}

@DataProvider()
public Object[][] strLoginData()
{
 Object data[][]= rd.getData(sheetname);
return data;
}
	

@Test(priority=1,dataProvider = "strLoginData")	
public void Login(String uname,String pswd)
{
	System.out.println("step1");

 loginpage.fnLogin(uname, pswd);
 System.out.println("step3");
}
	
	@Test(priority=2)
	public void ValidateLoginTitle()
	{
		System.out.println("step4");


		String strTitle=loginpage.LoginPageTitle();
		System.out.println("step6");
		Assert.assertEquals(strTitle, "Login1");
	}

	@AfterMethod
	public void Teardown()
	{
        driver.close();
		driver.quit();
	}
*/
}
