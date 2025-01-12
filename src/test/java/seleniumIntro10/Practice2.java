package seleniumIntro10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Practice2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/angularpractice/");

		driver.findElement(By.name("name")).sendKeys("rohit patil");
		driver.findElement(By.name("email")).sendKeys("rohitpatilyahoo.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("rohit123");

		WebElement dd = driver.findElement(By.id("exampleFormControlSelect1"));
		dd.click();
		Select dropdowns = new Select(dd);
		dropdowns.selectByIndex(0);
		
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).sendKeys("02051994");
		driver.findElement(By.cssSelector(".btn.btn-success")).click();
		
	WebElement text	=driver.findElement(By.cssSelector(".alert-success"));
                      System.out.println(text.getText());
                
                      
	}

}
