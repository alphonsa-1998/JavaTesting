package TestingFinalProjectPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TrivagoLoginScenario {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://access.trivago.com/oauth/en-IN/login");
				
		driver.manage().window().maximize();

				
		driver.findElement(By.className("input")).click();
		driver.findElement(By.id("check_email")).sendKeys("alphonsa@gmail.com");
		driver.findElement(By.cssSelector("#login_email_submit")).click();

		try
		{
			Thread.sleep(4000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.name("register[password]")).sendKeys("alphonsa26");
		try {
			Thread.sleep(400);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("#register_email_submit")).click();
		
		
	
	}


}
