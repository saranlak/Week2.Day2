package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Xpath {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//WebElement WE= driver.findElement(By.id("username"));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");;
		
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Create Lead')]")).click();
		
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("SaraComp");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("sara");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("lax");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("sales");
		driver.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("New sales lead for new products from south zone");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("newleads@sales.com");
	
		
		WebElement wee=driver.findElement(By.xpath("//select[@id='createLeadForm_generalStateProvinceGeoId']"));
		Select Sel=new Select(wee);
		
		Sel.selectByVisibleText("New York");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		System.out.println(driver.getTitle());
		
	}
}
