package week4.Assignments;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Resizable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\eclipse-workspace\\SeleniuAmAug\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.switchTo().frame(0);
		WebElement src =driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[1]"));
		Actions acc=new Actions(driver);
		acc.dragAndDropBy(src, 250, 150).perform();
		driver.switchTo().defaultContent();
}}


