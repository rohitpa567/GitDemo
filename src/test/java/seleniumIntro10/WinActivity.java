package seleniumIntro10;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WinActivity {

	public static void main(String[] args) {
		 
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
        driver.navigate().to("https://www.google.com");
        driver.navigate().back();
        driver.navigate().forward();

	}
	

}
