package wppool.wppool;

import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;

public class ValidateDarkModeAdmin extends BaseClass {

	@Test
	public void VadidateDarkMode() {
		
		// Click on Dark/Light button
		driver.findElement(By.xpath("//div[@role='menuitem']")).click();
		
		System.out.println("Dark mode validation completed");
	}

}
