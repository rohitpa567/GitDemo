package seleniumIntro10;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
         
     /*   WebElement adultCount1 =driver.findElement(By.id("divpaxinfo"));
        System.out.println( adultCount1.getText());


        driver.findElement(By.id("divpaxinfo")).click();
        Thread.sleep(2000);
        
        for(int i=0;i<=3;i++) {
        	
        	driver.findElement(By.id("hrefIncAdt")).click();
        }
        Thread.sleep(2000);
        driver.findElement(By.id("btnclosepaxoption")).click();
         
      WebElement adultCount2 =driver.findElement(By.id("divpaxinfo"));
                System.out.println( adultCount2.getText());
       */
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='GOI']")).click();
        
        driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BLR']")).click();
        
        driver.findElement(By.cssSelector(".ui-datepicker-current-day")).click(); 
       
	}

}
