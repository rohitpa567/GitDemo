package seleniumIntro10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Practice {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        
    List<WebElement>cbCount=driver.findElements(By.xpath("//input[@type='checkbox']"));
                   System.out.println(cbCount.size());
                   
        
        
        
        WebElement cb1 =driver.findElement(By.id("checkBoxOption1"));
                 cb1.click();
              Assert.assertTrue(cb1.isSelected());
              
              cb1.click();
           Assert.assertFalse(cb1.isSelected());   
              

	}

}
