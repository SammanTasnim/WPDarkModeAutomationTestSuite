package wppool.wppool;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://wppool.local/wp-admin/");
		driver.findElement(By.xpath("//input[@id='user_login']")).sendKeys("wppool");
		driver.findElement(By.id("user_pass")).sendKeys("wp1234");
		driver.findElement(By.id("wp-submit")).click();
		
	}
	
	@After
	public void close() {
		driver.quit();
	}
}
