package com.mindtreee.seleniumclass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Seleenium222 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub.
		
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://tide.com/en-us");
		System.out.println(driver.getTitle());
		Actions action = new Actions(driver);
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@class='lilo3746-close-link lilo3746-close-icon']")).click();
		driver.findElement(By.linkText("Contact Us")).click();
		
		
		driver.get("https://tide.com/en-us");
		
		action.moveToElement(driver.findElement(By.linkText("Our Commitment"))).build().perform();
		driver.findElement(By.xpath("//a[@data-action-detail='Turn to Cold ']")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement search = driver.findElement(By.name("q"));
		search.click();
		search.sendKeys("stain removal");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.linkText("Read More")).click();
		
		driver.get("https://tide.com/en-us");

	}

}
