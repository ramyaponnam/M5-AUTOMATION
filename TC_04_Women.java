package ShopperStack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_04_Women 
{
	@Test(groups="Functional")
	public void Register()
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		//identify the login button and click
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("ramyasriponnam2001@gmail.com");
		// identify the password
		driver.findElement(By.id("Password")).sendKeys("Ramy@2724");
		// indify the Login page and click
		driver.findElement(By.id("Login")).click();
		// identify the womens module and click
		driver.findElement(By.name("women")).click();
		// identify the add to cart and click
		driver.findElement(By.xpath("(//span[text()='forever21']/../../div[2]/button[1])[1]")).click();
		Reporter.log("woment added to cart succssfully");
		driver.quit();
		
	}
}
