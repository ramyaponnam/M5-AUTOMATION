package ShopperStack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_01_Register 
{
	@Test(groups="smoke")
	public void Register() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		//identify the login button and click
		driver.findElement(By.id("loginBtn")).click();
		//identify Create Account button click
		driver.findElement(By.id("Create Account")).click();
		// identify the FN and pass data
		driver.findElement(By.name("First Name")).sendKeys("rams");
		//identify the LN and pass data
		driver.findElement(By.name("Last Name")).sendKeys("ponnam");
		// identify the female Radio Button  and click
		driver.findElement(By.name("Female")).click();
		// identify the ph number and pass data
		driver.findElement(By.id("Phone Number")).sendKeys("9705502724");
		// identify the email pass the data
		driver.findElement(By.id("Email Address")).sendKeys("ramyasriponnam2001@gmail.com");
		// identify the password
		driver.findElement(By.id("Password")).sendKeys("Ramy@2724");
		// identify the confirm password
		driver.findElement(By.id("Confirm Password")).sendKeys("Ramy@2724");
		// identify the agree button click
		driver.findElement(By.id("Terms and Conditions")).click();
		//identify the register button 
		Thread.sleep(40000);
		driver.findElement(By.id("Register")).click();
		//message
		Reporter.log("Register complted succssfully");
		driver.quit();
		
	}

}
