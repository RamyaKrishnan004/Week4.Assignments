package week4.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActDrop {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\eclipse-workspace\\SeleniuAmAug\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http:www.leafground.com/pages/drop.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement src = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		System.out.println(src.getText());
		Thread.sleep(2000);
		WebElement desc = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		System.out.println(desc.getText());
		Thread.sleep(2000);
		Actions acc = new Actions(driver);
		acc.dragAndDrop(src, desc).perform();
		
		
	}}		
		
		
		
		
		
		

