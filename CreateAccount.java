package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {

public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("checking Account");
		driver.findElement(By.name("description")).sendKeys("Savings Account for TestLeaf");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("State Bannk of India");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("cenetoff road");
		driver.findElement(By.xpath("(//input[contains(@class,'input')])[5]")).sendKeys("50,00,000");
		driver.findElement(By.className("smallSubmit")).click();
		

	}
}
