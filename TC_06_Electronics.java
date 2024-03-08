package ShopperStack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_06_Electronics 
{
	@Test(groups="Functional")
	public void Register() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
		driver.manage().window().maximize();
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(40000);
		//identify the login button and click
		driver.findElement(By.id("loginBtn")).click();
		driver.findElement(By.id("Email")).sendKeys("ramyasriponnam2001@gmail.com");
		// identify the password
		driver.findElement(By.id("Password")).sendKeys("Ramy@2724");
		// indify the Login page and click
		driver.findElement(By.id("Login")).click();
		// identify the electronics and fetch product names of
		driver.findElement(By.name("electronics")).click();   
		List<WebElement> allnames=driver.findElements(By.xpath("//div[@class='featuredProducts_footerLeft__iP3CQ']/../div/span[2]"));
		for (WebElement allproductprice : allnames) 
		{
			Reporter.log(allproductprice.getText(),true);
		}
		driver.quit();
		
	}
}
