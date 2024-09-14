package wppool.wppool;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

public class EnablePageaTransition extends BaseClass {

	@Test
	public void test() {
		
		driver.get("http://wppool.local/wp-admin/admin.php?page=wp-dark-mode#/frontend");
		// Click on Customization button
		driver.findElement(By.xpath("//h4[normalize-space()='Customization']")).click();
		
		// Click on Switch Settings
		driver.findElement(By.xpath("//a[normalize-space()='Site Animation']")).click();
		
		// Click on Enable Page Transition Animation
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/label[1]/div[2]/div[1]")).click();
		
		// Save
		driver.findElement(By.xpath("//button[normalize-space()='Save Changes']")).click();
	}

}
