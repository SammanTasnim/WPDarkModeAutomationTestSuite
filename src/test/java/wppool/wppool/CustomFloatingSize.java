package wppool.wppool;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class CustomFloatingSize extends BaseClass {

	@Test
	public void test() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(text(),'WP Dark Mode')]")).click();
		// Click on Customization button
		driver.findElement(By.xpath("//h4[normalize-space()='Customization']")).click();
		
		// Click on Switch Settings
		driver.findElement(By.xpath("//a[normalize-space()='Switch Settings']")).click();
		
		// Validate and enable frontend dark mode
		String keyword = "Enable Frontend Dark Mode";
		String keywords = driver.getPageSource();
		if(keywords.contains(keyword)) {
			// Enable Frontend Dark Mode
			driver.findElement(By.xpath("//a[normalize-space()='Frontend Dark Mode']")).click();
			driver.findElement(By.xpath("//div[@class='text-base w-content leading-6 font-medium flex items-center gap-3 text-black']//div[1]")).click();
			driver.findElement(By.xpath("//button[normalize-space()='Save Changes']")).click();
		}
		// Click on Switch Settings and then Custom for Floating Switch Size
		driver.findElement(By.xpath("//a[normalize-space()='Switch Settings']")).click();
		Thread.sleep(300);
		driver.findElement(By.xpath(("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[2]/div[6]/span[1]"))).click();
		
		
		// Switching size to 220
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/input[1]")).sendKeys(Keys.BACK_SPACE, Keys.BACK_SPACE, Keys.BACK_SPACE);
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/section[1]/div[2]/div[1]/div[2]/div[4]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[2]/input[1]")).sendKeys("220");
		
		Thread.sleep(300);
		try {
			driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[3]/button[2]")).click();
			System.out.print("Saved");
		}catch (Exception e){
			System.out.print("No change");
		}
		
	}

}
