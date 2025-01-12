package seleniumIntro10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
      WebElement we = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
        
        Select dropdown = new Select(we);
        dropdown.selectByIndex(2);
       WebElement firstoptionElement= dropdown.getFirstSelectedOption();
           System.out.println(firstoptionElement.getText());
        
        dropdown.selectByValue("INR");
        dropdown.selectByVisibleText("USD");
        
      List<WebElement>listWE = dropdown.getOptions();
               for(WebElement list:listWE) 
            	   System.out.println(list.getText());
               
         
        

	}

}
