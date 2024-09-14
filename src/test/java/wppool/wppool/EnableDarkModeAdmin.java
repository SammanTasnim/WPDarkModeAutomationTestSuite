package wppool.wppool;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

public class EnableDarkModeAdmin extends BaseClass {

	@Test
	public void EnableDarkMode() {
		// Enable/Disable Admin panel Dark Mode
		
		// Admin panel
		driver.findElement(By.xpath("//div[contains(text(),'WP Dark Mode')]")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Admin Panel Dark Mode']")).click();
		
		// Enable Frontend Dark Mode
		driver.findElement(By.xpath("//a[normalize-space()='Frontend Dark Mode']")).click();
		driver.findElement(By.xpath("//div[@class='text-base w-content leading-6 font-medium flex items-center gap-3 text-black']//div[1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Save Changes']")).click();
		
		// Enable Admin Dashboard Dark Mode
		driver.findElement(By.xpath("//a[normalize-space()='Admin Panel Dark Mode']")).click();
		driver.findElement(By.xpath("//div[@class='rounded text-base flex flex-col gap-3 bg-transparent gap-5']//div[1]//label[1]//div[2]//div[1]")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Save Changes']")).click();
		
		System.out.println("Enabled/Disabled Dark Mode");
	}

}
