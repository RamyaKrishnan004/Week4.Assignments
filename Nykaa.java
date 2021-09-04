package week4.Assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ramya\\eclipse-workspace\\SeleniuAmAug\\Driver\\chromedriver.exe" );
		WebDriver driver = new ChromeDriver();
		driver.get(" https:www.nykaa.com"); 
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Thread.sleep(2000);		
		WebElement brands=driver.findElement(By.xpath("//a[text()='brands']"));
	    Actions acc=new Actions(driver);
	    acc.moveToElement(brands).perform();
	    WebElement popular=driver.findElement(By.xpath("//a[text()='Popular']"));
	    Actions acc1=new Actions(driver);
	    acc1.moveToElement(popular).perform();
	    driver.findElement(By.xpath("//*[@id=\"brandCont_Popular\"]/ul/li[5]/a/img")).click();
	    Set<String> st = driver.getWindowHandles();
		List<String> Lore=new ArrayList<String>(st);
		driver.switchTo().window(Lore.get(1));
		String title=driver.getTitle();
		if (title.contains("L'Oreal")) {
			System.out.println(" L'Oreal Displayed ");
		}
		driver.findElement(By.xpath("//span[text()='popularity']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"listingContainer\"]/div[2]/div[2]/div/div[1]/div[1]/div/div[1]")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']//following::div[1]")).click();
		WebElement fil = driver.findElement(By.xpath("//*[@id=\"sortComponent\"]/div[1]/div/ul/li"));
		String str=fil.getText();
		if (str.contains("Shampoo")) {
			System.out.println("Filters are : "+ fil.getText());
		}
		else {
			System.out.println(" No filters present");
		}
		WebElement Pp=driver.findElement(By.xpath("//div[@class='price-info']"));
		System.out.println(" Price of the Product  is : " +Pp.getText());
		driver.findElement(By.xpath("(//button[@class='combo-add-to-btn prdt-des-btn js--toggle-sbag nk-btn nk-btn-rnd atc-simple m-content__product-list__cart-btn  '])[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='AddBagIcon']")).click();
		WebElement gt = driver.findElement(By.xpath("//*[@id=\"headerWpr\"]/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/div/div[1]"));
		Thread.sleep(2000);
		String getot=gt.getText();
		System.out.println("Total is : " + getot);
		driver.findElement(By.xpath("//*[@id=\"headerWpr\"]/div[2]/div[1]/div/div/div[1]/div[2]/div[2]/div/div[2]/button/span/span")).click();
		driver.findElement(By.xpath("//button[@class='btn full big']")).click();
		driver.quit();   
	}}



