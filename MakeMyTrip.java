package SeleniumDeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(
				"https://www.makemytrip.com/flights/?gclid=EAIaIQobChMI94KjgIKF5wIVlYePCh0CBwtzEAAYASAAEgJvLvD_BwE&cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|Expanded|162031058804&s_kwcid=AL!1631!3!162031058804!e!!g!!make%20my%20trip&ef_id=EAIaIQobChMI94KjgIKF5wIVlYePCh0CBwtzEAAYASAAEgJvLvD_BwE:G:s");

		driver.manage().window().maximize();

		/*
		 * WebElement element = (WebElement) driver.findElements(By.id("abcd"));
		 * JavascriptExecutor executor = (JavascriptExecutor) driver;
		 * executor.executeScript("arguments[0].click()", element); Thread.sleep(4000);
		 */
		
		
		
		
		
		
		
		
		driver.findElement(By.className("makeFlex")).click();
		driver.findElement(By.id("username")).sendKeys("alphonsa@gmail.com");
		driver.findElement(By.cssSelector(
				"#SW > div.landingContainer > div.headerOuter > div.modal.displayBlock.modalLogin.dynHeight.personal > section > form > div.btnContainer.appendBottom25 > button"))
				.click();
		
		try
		{
			Thread.sleep(4000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.id("password")).sendKeys("alphonsa26");
		try {
			Thread.sleep(400);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		driver.findElement(By.cssSelector("button")).click();
		
		
		

	/*	driver.findElement(By.cssSelector(
				"#SW > div.landingContainer > div.makeFlex.hrtlCenter.prependTop5.appendBottom40 > ul > li.makeFlex.hrtlCenter.font10.makeRelative.lhUser"))
				.click();

		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("alphonsavb@gmail.com");
		driver.findElement(By.cssSelector(
				"#SW > div.landingContainer > div.headerOuter > div.modal.displayBlock.modalLogin.dynHeight.personal > section > form > div.btnContainer.appendBottom25 > button"))
				.click();*/
		
		
		// driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div[2]/div[2]/div[2]/section/form/div[2]/button")).click();
	}

}
