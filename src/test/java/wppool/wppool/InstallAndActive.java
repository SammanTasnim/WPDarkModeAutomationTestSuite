package wppool.wppool;

import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InstallAndActive extends BaseClass {

	@Test
	public void extention() throws InterruptedException {
		
		// Go to plugins section and search for "WP Dark Mode" and check exists or not
		driver.get("http://wppool.local/wp-admin/plugins.php");
		String keywords = "WP Dark Mode";
		String pageSource = driver.getPageSource();
		if(pageSource.contains(keywords)) {
			System.out.println("Plugin already exists");
		}
		else {
			// Install plug-in
			driver.findElement(By.cssSelector(".page-title-action")).click();
			driver.findElement(By.id("search-plugins")).sendKeys("WP Dark Mode");
			Thread.sleep(6000);
			// Click "Install Now" button for WP Dark Mode
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(500));
            WebElement installButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[@aria-label='Install WP Dark Mode – WordPress Dark Mode Plugin for Improved Accessibility, Dark Theme, Night Mode, and Social Sharing 5.1.0 now'])[1]")));
            installButton.click();

            // Wait for the "Activate" button to appear
            WebElement activateButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Activate']")));
            activateButton.click();
			
			
		}
	}

}
