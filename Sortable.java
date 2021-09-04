package week4.Assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sortable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\eclipse-workspace\\SeleniuAmAug\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/sortable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.xpath("//*[@id='sortable']/li[2]"));
		WebElement desc= driver.findElement(By.xpath("//*[@id='sortable']/li[3]"));
		Point pt=desc.getLocation();
		int x=pt.getX();
		int y=pt.getY();
		Actions acc=new Actions(driver);
		acc.dragAndDropBy(src, x, y).perform();
		
	}}




