package week4.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\eclipse-workspace\\SeleniuAmAug\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/sortable.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		WebElement src=driver.findElement(By.xpath("//*[@id='sortable']/li[3]"));
		WebElement desc=driver.findElement(By.xpath("//*[@id='sortable']/li[7]"));
		Point pt=src.getLocation();
		int t=pt.getX();
		int v=pt.getY();
		System.out.println(pt);
		Actions acc= new Actions(driver);
		acc.dragAndDropBy(src, t, v).perform();
}}




