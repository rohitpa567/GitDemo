package seleniumIntro10;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArrayKart {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

		List<WebElement> vegCounts = driver.findElements(By.cssSelector("h4.product-name"));
		System.out.println(vegCounts.size());
		for (int i = 0; i < vegCounts.size(); i++) {

			String[] name = vegCounts.get(i).getText().split("-");

			List<String> itemsToAdd = new ArrayList<>(List.of("Cauliflower","Beetroot"));

			if (itemsToAdd.contains(name[0].trim())) {
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

			}
		}
	}

}
