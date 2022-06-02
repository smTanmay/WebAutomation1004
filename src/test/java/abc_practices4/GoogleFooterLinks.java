package abc_practices4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleFooterLinks {

	public static void main(String[] args) throws Throwable {
	
	System.setProperty("webdriver.chrome.driver", "C:/webdrivers/chromedriver.exe"); 
	 
	  WebDriver driver = new ChromeDriver(); 
	 // For ChromeBrowser 
	  driver.get("https://www.google.com");	
	
	  driver.findElement(By.linkText("Privacy")).click();
	  System.out.println("I clicked on the Privacy link ...");
	  Thread.sleep(5000);

	
	
	
	
	}
		// TODO Auto-generated method stub

  }


