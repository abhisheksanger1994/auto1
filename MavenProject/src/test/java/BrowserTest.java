//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserTest {

	public static void main(String[] args) {
		
		//String projectPath = System.getProperty("user.dir");
		//System.out.println("projectPath: "+projectPath);
		//System.setProperty("webdriver.chrome.driver", projectPath+"//drivers//chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		//driver.get("https://www.google.com/");
		
		//if you don't want to download the chrome driver
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		//xpath format:- xpath = //tagname[@attribute='value']
		//WebElement textbox = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		//textbox.sendKeys("Testing");
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Testing");
		driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
		
		/*
		driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("Testing");
		List<WebElement> listofInputElement = driver.findElements(By.xpath("//input"));
		int count = listofInputElement.size();
		
		System.out.println("count = "+count);
		*/
		driver.close();
	}	
}