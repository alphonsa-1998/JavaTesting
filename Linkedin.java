package SeleniumDeloitteDemoPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkedin {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://www.linkedin.com/login?fromSignIn=true&trk=guest_homepage-basic_nav-header-signin");
		driver.get("https://www.linkedin.com/");
		// to maximize the window
		driver.manage().window().maximize();

		// finding the element using the locator
	/*	driver.findElement(By.name("session_key")).sendKeys("Alphonsa");
		driver.findElement(By.name("session_password")).sendKeys("Alphonsa123");*/
		
		
		
		/*to click on sign in button of a page
		known as locators*/
		driver.findElement(By.cssSelector("body > nav > a.nav__button-secondary")).click();
		
		driver.findElement(By.xpath("//*[@id=\"username\"]")).sendKeys("alphonsavb@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys("alphonsa23");
		driver.findElement(By.cssSelector("#app__container > main > div > form > div.login__form_action_container > button")).click();
	}

}
