package seleniumIntro10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("rahul");
		driver.findElement(By.name("inputPassword")).sendKeys("qwerty1");
		driver.findElement(By.className("signInBtn")).click();

		String errorText = driver.findElement(By.cssSelector("p.error")).getText();

		System.out.println(errorText.trim());

		driver.findElement(By.linkText("Forgot your password?")).click();

		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("rahul");

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rp@gamil.com");
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear();

		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("rahul@gamil.com");

		driver.findElement(By.xpath("//form/input[@placeholder='Phone Number']")).sendKeys("55555");
           driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
           
          String text= driver.findElement(By.cssSelector("form p")).getText();
          System.out.println(text);
          
          driver.findElement(By.cssSelector(".go-to-login-btn")).click();
          
          Thread.sleep(2000);
          
          driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rohit");
          driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
         driver.findElement(By.id("chkboxOne")).click();
         driver.findElement(By.cssSelector("button[class*='submit']")).click();
	}
}
