package SeleniumAutomationScenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProductComments {
	public static void main(String args[]) {
		try {
			System.setProperty("webdriver.chrome.driver", "/C:/Users/HP/Downloads/chromedriver_win32/chromedriver.exe/");
			WebDriver driver = new ChromeDriver();
			System.setProperty("webdriver.chrome.verboseLogging", "true");
			driver.get("https://www.amazon.in/");
			driver.manage().window().maximize();
			
			System.out.println(driver.getTitle());
			
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).click();
			driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone SE");
			
			
			
			driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
			driver.navigate().to("https://www.amazon.in/Apple-iPhone-256-Starlight-Generation/dp/B09V3MPSMF/ref=sr_1_1_sspa?keywords=Iphone+SE&qid=1678178555&sr=8-1-spons&sp_csd=d2lkZ2V0TmFtZT1zcF9hdGY&psc=1");
//			driver.quit();
			WebElement element =  driver.findElement(By.id("reviewsMedley"));
			Actions action = new Actions(driver);
			action.moveToElement(element);
			action.perform();
			
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
