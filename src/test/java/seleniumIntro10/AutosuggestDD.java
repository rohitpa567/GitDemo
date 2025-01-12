package seleniumIntro10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosuggestDD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        
      List<WebElement>checkBoxCount=driver.findElements(By.cssSelector("input[type='checkbox']"));
                      System.out.println(checkBoxCount.size());
         
        driver.findElement(By.id("autosuggest")).sendKeys("AU");
        
      List<WebElement> list=  driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
                 for(WebElement wes: list) {
                	 System.out.println(wes.getText());
                	 if(wes.getText().equalsIgnoreCase("Saudi Arabia"))
                		 wes.click();
                 }
                	 
	}
	

}
