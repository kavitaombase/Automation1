package Test;
import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class google {

	@Test(priority=20, enabled= true)
	
	public void search_for_selenium()
	{
		WebDriver driver = new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		   driver.manage().window().maximize();
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		driver.findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[2]/div[2]/ul/li[1]/div/div[2]")).click();
	driver.findElement(By.xpath("//*[@id=\"rso\"]/div[3]/div[2]/div/div[1]/a/h3")).click();
	String title = driver.getTitle();
	
	Assert.assertEquals("Selenium Automation Browser", title);
	driver.quit();
	
	/*if(title.equals("SeleniumHQ Browser Automation"))
	{
		System.out.println("Testcase pass");
		
	}
	else
	{
		System.out.println("Test case fail");
	}*/
	
	driver.quit();	
	}
}
