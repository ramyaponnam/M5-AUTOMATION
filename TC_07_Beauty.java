package ShopperStack;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TC_07_Beauty 
{
	@Test(groups="functional")
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
	// identify the Login page and click
	driver.findElement(By.id("Login")).click();
	driver.findElement(By.id("beautyProducts")).click();
	List<WebElement> offers=driver.findElements(By.xpath("(//span[text()='lakme']/../div[1]/p/span[3])[1]"));
	for (WebElement off : offers) 
	{
		Reporter.log(off.getText());
	}
	driver.quit();
	
}

}
