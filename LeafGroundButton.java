package Week2.day2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LeafGroundButton {

	public static void main(String[] args) {
		
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("http://leafground.com/pages/Button.html");
		
		driver.manage().window().maximize();
		String Data="color";		
		System.out.println(driver.findElement(By.id(Data)).getCssValue("background-color"));		
		System.out.println(driver.findElement(By.id(Data)).getText());		
		System.out.println(driver.findElement(By.id(Data)).getLocation());		
		System.out.println(driver.findElement(By.id(Data)).getTagName());
			
	}
	
}
