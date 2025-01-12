package seleniumIntro10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		
		String name = "dhanno";

		WebDriver driver = new ChromeDriver();

		String password = getPass(driver);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);

		String loginMsg = driver.findElement(By.tagName("p")).getText();
		System.out.println(loginMsg);

		Assert.assertEquals(loginMsg, "You are successfully logged in.");

		String username = driver.findElement(By.cssSelector("h2")).getText();

		System.out.println(username);
		Assert.assertEquals(username, "Hello " + name + ",");

		driver.findElement(By.xpath("//button[text()='Log Out']")).click();

		driver.quit();

	}

	public static String getPass(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);

		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();

		String textPass = driver.findElement(By.cssSelector("form p")).getText();
		String[] passText = textPass.split("'");
		
		System.out.println(passText[1]);

		String password = passText[1];

		return password;

	}

}
