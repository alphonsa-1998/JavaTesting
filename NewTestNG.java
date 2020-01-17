package DeloittePackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTestNG {
	public String baseUrl="https://demo.guru99.com/test/newtours/";
	//public String baseUrl="https://google.com";
	//main method
  @Test
  public void verifyHomepageTitle() {
	  
	  System.out.println("launching chrome browser");
	  System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
	  
	  WebDriver driver=new ChromeDriver();
	  driver.get(baseUrl);
	 String expectedTitle="Welcome: Mercury Tours";
	 // String expectedTitle="Welcome: Google";
	  String actualTitle=driver.getTitle();
	  Assert.assertEquals(actualTitle, expectedTitle);  //assert means Make Sure ie., they are the test cases
	  driver.close();
  }
}
