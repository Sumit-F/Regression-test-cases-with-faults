package myproject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class testngproject {
	
	public static InternetExplorerDriver driver = null;
	SoftAssert assertver = new SoftAssert();
	
	public static void main(String[] args)
	{
		testngproject project = new testngproject();
		project.TS_001_Scenario1();
		project.TS_001_Scenario2();
		project.TS_001_Scenario3();
		project.TS_001_Scenario4();
		project.TS_001_Scenario5();
		project.TS_001_Scenario6();
		project.TS_001_Scenario7();
		project.TS_001_Scenario8();
		project.TS_001_Scenario9();
		project.TS_001_Scenario10();
	}
	
	@BeforeMethod
	public void LaunchBrowser()
	{
		
		
	}

	
	public void TS_001_Scenario1()
	{
		System.setProperty("webdriver.ie.driver", "iedriverserver.exe");
		driver =  new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElementByName("user_name").sendKeys("admin");
		driver.findElementByName("user_password").sendKeys("admin");
		driver.findElementByName("Login").click();
		String textval = driver.findElementByLinkText("MY HOME PAGE").getText();
		if(textval.equals("my home page"))
		{
		System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		driver.quit();
	}
	
	
	public void TS_001_Scenario2()
	{
		System.setProperty("webdriver.ie.driver", "iedriverserver.exe");
		driver =  new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElementByName("user_name").sendKeys("admin");
		driver.findElementByName("user_password").sendKeys("admin");
		driver.findElementByName("Login").click();
		String pagetitle = driver.getTitle();
		if(pagetitle.equalsIgnoreCase("admin - My Home Page - Home - vtiger CRM 5 - Commercial myhomepage CRM"))
		{
		System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		driver.quit();
	}
	
	public void TS_001_Scenario3()
	{
		System.setProperty("webdriver.ie.driver", "iedriverserver.exe");
		driver =  new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElementByName("user_name").sendKeys("admin");
		driver.findElementByName("user_password").sendKeys("admin");
		driver.findElementByName("Login").click();
		String linktext = driver.findElementByLinkText("Marketing").getText();
		if(linktext.equalsIgnoreCase("MarketingHome"))
		{
		System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		driver.quit();
	}
	
	public void TS_001_Scenario4()
	{
		System.setProperty("webdriver.ie.driver", "iedriverserver.exe");
		driver =  new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElementByName("user_name").sendKeys("admin");
		driver.findElementByName("user_password").sendKeys("admin");
		driver.findElementByName("Login").click();
		String linktext = driver.findElementByLinkText("Sales").getText();
		if(linktext.equalsIgnoreCase("SalesHome"))
		{
		System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		driver.quit();
	}
	
	public void TS_001_Scenario5()
	{
		System.setProperty("webdriver.ie.driver", "iedriverserver.exe");
		driver =  new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElementByName("user_name").sendKeys("admin");
		driver.findElementByName("user_password").sendKeys("admin");
		driver.findElementByName("Login").click();
		String linktext = driver.findElementByLinkText("Support").getText();
		if(linktext.equalsIgnoreCase("SupportHome"))
		{
		System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		driver.quit();
	}
	
	public void TS_001_Scenario6()
	{
		System.setProperty("webdriver.ie.driver", "iedriverserver.exe");
		driver =  new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElementByName("user_name").sendKeys("admin");
		driver.findElementByName("user_password").sendKeys("admin");
		driver.findElementByName("Login").click();
		String linktext = driver.findElementByLinkText("Analytics").getText();
		if(linktext.equalsIgnoreCase("AnalyticstHome"))
		{
		System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		driver.quit();
	}
	
	public void TS_001_Scenario7()
	{
		System.setProperty("webdriver.ie.driver", "iedriverserver.exe");
		driver =  new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElementByName("user_name").sendKeys("admin");
		driver.findElementByName("user_password").sendKeys("admin");
		driver.findElementByName("Login").click();
		String linktext = driver.findElementByLinkText("Inventory").getText();
		if(linktext.equalsIgnoreCase("InventoryHome"))
		{
		System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		driver.quit();
	}
	
	public void TS_001_Scenario8()
	{
		System.setProperty("webdriver.ie.driver", "iedriverserver.exe");
		driver =  new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElementByName("user_name").sendKeys("admin");
		driver.findElementByName("user_password").sendKeys("admin");
		driver.findElementByName("Login").click();
		String linktext = driver.findElementByLinkText("Tools").getText();
		if(linktext.equalsIgnoreCase("ToolsHome"))
		{
		System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		driver.quit();
	}
	
	public void TS_001_Scenario9()
	{
		System.setProperty("webdriver.ie.driver", "iedriverserver.exe");
		driver =  new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElementByName("user_name").sendKeys("admin");
		driver.findElementByName("user_password").sendKeys("admin");
		driver.findElementByName("Login").click();
		String linktext = driver.findElementByLinkText("Settings").getText();
		if(linktext.equalsIgnoreCase("SettingsHome"))
		{
		System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		driver.quit();
	}
	
	public void TS_001_Scenario10()
	{
		System.setProperty("webdriver.ie.driver", "iedriverserver.exe");
		driver =  new InternetExplorerDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://localhost:8888");
		driver.findElementByName("user_name").sendKeys("admin");
		driver.findElementByName("user_password").sendKeys("admin");
		driver.findElementByName("Login").click();
		String linktext = driver.findElementByLinkText("Home").getText();
		if(linktext.equalsIgnoreCase("HomePage"))
		{
		System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");
		}
		driver.close();
		driver.quit();
	}
	
}
