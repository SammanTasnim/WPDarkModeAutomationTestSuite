package wppool.wppool;

import static org.junit.Assert.*;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CustimizationSwitchSettings extends BaseClass {

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
		
		// Click on Floating Switch Style
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

		try {
		    // Attempt to click the first button
		    WebElement firstButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[contains(@class, 'floating-switch')]")));
		   
		    firstButton.click();
		    System.out.println("First button clicked");
		    
		    // Check if "Save Changes" button appears after first button is clicked
		    WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Save Changes']")));
		    if (saveButton.isDisplayed()) {
		        System.out.println("Save button appeared after first button click");
		        saveButton.click();
		        System.out.println("Changes saved after first button click");
		    } else {
		        throw new Exception("Save button not visible after first button click");
		    }
		} catch (Exception e) {
		    // First button didn't work or save button didn't appear, trying the second button
		    System.out.println("First button failed, trying second button");
		    
		    try {
		        WebElement secondButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//body/div/div/div[@role='main']/div/div/div/div/div/div/div/div/section/div/div/div/div/div[1]/div[2]/div[2]")));

		        secondButton.click();
		        System.out.println("Second button clicked");
		        
		        Thread.sleep(3000);
		        // Check if "Save Changes" button appears after second button is clicked
		        WebElement saveButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Save Changes']")));
		        if (saveButton.isDisplayed()) {
		            System.out.println("Save button appeared after second button click");
		            saveButton.click();
		            System.out.println("Changes saved after second button click");
		        } else {
		            System.out.println("Save button not visible after second button click");
		        }
		    } catch (Exception ex) {
		        System.out.println("Second button failed as well. Could not save changes.");
		        throw ex;  // Stop execution if both buttons fail
		    }
		}


       
        
		
	}

}
