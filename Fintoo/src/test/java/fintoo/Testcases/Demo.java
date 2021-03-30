package fintoo.Testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Demo extends BaseClass{
	
	@Test
	public void trial() throws InterruptedException  {
		Thread.sleep(3000);
		driver.findElement(By.xpath("//img[@style='width: 100%;   margin: 4px 0;']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Online Pre-Appointment']")).click();
		
		driver.findElement(By.id("name-input")).sendKeys("Mohammad Asif");
		Thread.sleep(3000);
		driver.findElement(By.id("cnic_input")).sendKeys("1234567891234");
		Thread.sleep(3000);
		driver.findElement(By.id("nextBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Branches']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Nazimabad']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("nextBtn")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Learners Driving License']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("nextBtn")).click();
		
	}

}
