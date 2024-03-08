package ShopperStack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_05_Kids
{
	@Test(groups="Funtional")
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
		// identify the kinds and fetch price of 1st product
		driver.findElement(By.name("kids")).click();
		List<WebElement> prices=driver.findElements(By.xpath("//span[text()='santoor']/../../div[1]/div/p/span[2]"));
		//print allproductnames
		for (WebElement price : prices)
		{
			Reporter.log(price.getText(),true);
		}
		driver.quit();
	}
}
