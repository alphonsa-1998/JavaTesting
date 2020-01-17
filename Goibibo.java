package SeleniumDeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibibo {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	driver.get("https://www.goibibo.com/flights/?utm_source=google&utm_medium=cpc&utm_campaign=DF-Brand-EM&utm_adgroup=Only%20Goibibo&campaign=DF-Brand-EM&gclid=EAIaIQobChMIubqKlqaF5wIVUCUrCh0RFAREEAAYAiAAEgLcbPD_BwE");

		driver.manage().window().maximize();		
		driver.findElement(By.cssSelector("#get_sign_in")).click();
		driver.findElement(By.xpath("//*[@id=\"authMobile\"]")).sendKeys("9856320142");
		driver.findElement(By.cssSelector(
				"#mobileSubmitBtn")).click();
		
		try
		{
			Thread.sleep(4000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		/*driver.findElement(By.id("password")).sendKeys("alphonsa26");
		try {
			Thread.sleep(400);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("button")).click();*/
		
		
	
	}

}
