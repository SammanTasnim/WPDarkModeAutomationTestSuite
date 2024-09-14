package wppool.wppool;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

public class SwitchSettingsLeft extends BaseClass {

	@Test
	public void test() throws InterruptedException {
		
		// Navigate to WP Dark Mode
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
		// Click on Switch Settings
		driver.findElement(By.xpath("//a[normalize-space()='Switch Settings']")).click();
		driver.findElement(By.xpath("(//div[@class='cursor-pointer flex items-center gap-2 py-2 transition duration-75 px-3.5 text-base font-normal leading-6 rounded-lg bg-gray-100 hover:bg-gray-200'])[6]")).click();
		
		Thread.sleep(3000);
		// Save
		driver.findElement(By.cssSelector("button.disabled\\:opacity-50.disabled\\:cursor-not-allowed.inline-flex.items-center.gap-2.px-4.py-2.text-sm.font-medium.rounded-md.cursor-pointer.outline-none.focus\\:outline-none.hover\\:opacity-90.transition.duration-75.bg-blue-500.text-white.border.border-blue-500")).click();
	}

}
