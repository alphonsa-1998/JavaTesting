package DeloittePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGTestCasePriority {
   
	 
	  WebDriver driver;
	  
	  //Method 1: Open Browser
	  @Test
	  public void openBrowser()
	  {		   
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }
	  
	  //Method 2:Launch Google.com
	  @Test
	  public void launchGoogle()
	  { System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		  driver.get("https://www.google.co.in");
	  }
	  
	  //Method 3:Perform a search using "Linkedin"
	  @Test
	  public void performSearchandClick1stLink()
	  {
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.google.co.in");
		  driver.findElement(By.className("q")).sendKeys("Linkedin");
		  
		  
	  }
	  
	  //Method 4: Verify Google search page title
	  
	  @Test
	  public void LinkedinPageTitleVerification() throws Exception{
		  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://www.google.co.in");
		  driver.findElement(By.className("q")).sendKeys("Linkedin");
		  Thread.sleep(3000);		
	        Assert.assertEquals(driver.getTitle().contains("Linkedin - Google Search"), true);
		  //driver.findElement(By.cssSelector("#tsf > div:nth-child(2) > div.A8SBwf > div.FPdoLc.tfB0Bf > center > input.gNO89b")).click();
	  }
  
}
