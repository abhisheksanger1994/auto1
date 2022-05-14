package test;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.GoogleSearchPage;

public class  Test1_GoogleSearch{

	static WebDriver driver = null;
	
	public static void main(String[] args) {
		googleSearch();
	}
	
	public static void googleSearch() {
		
		String projectPath = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		GoogleSearchPage.textbox_search(driver).sendKeys("Automation step by step");
		GoogleSearchPage.button_search(driver).sendKeys(Keys.RETURN);
		driver.close();
		System.out.println("Test Completed Successfully");
	}
}
