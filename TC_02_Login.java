package ShopperStack;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v113.browser.Browser;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class TC_02_Login
{
	WebDriver driver;
	@Test
	//(groups="functional")
	//@Parameters("browser")
	public void login(String browser) throws IOException
	{   	
		/*if(browser.equalsIgnoreCase(browser))
		{
			driver=new ChromeDriver();
		}
		if(browser.equalsIgnoreCase(browser))
		{
					driver=new EdgeDriver();
		}*/	
		//WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		
		//step 1-->get an object of external file
		FileInputStream fis=new FileInputStream("./commondata/M5login.properties.txt");
		//step 2--> create an object for properties
		Properties prop = new Properties();
		//step 3--> load the File
		prop.load(fis);
		// step 4 --> read the data
		String url = prop.getProperty("url");
		//System.out.println(data);
		
		//driver.get("url");
		//identify the login button and click
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("ramyasriponnam2001@gmail.com");
		// identify the password
		driver.findElement(By.id("Password")).sendKeys("Ramy@2724");
		// indify the Login page and click
		driver.findElement(By.id("Login")).click();
		Reporter.log("Login complted succssfully");
		driver.quit();
	}
}
