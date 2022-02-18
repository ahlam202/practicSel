package PracticeU;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\PracticeU\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	  driver.findElement(By.xpath("(//*[text()=\"ADD TO CART\"])[1]")).click();
	  driver.findElement(By.xpath("//*[@alt=\"Cart\"]")).click();
	  driver.findElement(By.xpath("//*[text()=\"PROCEED TO CHECKOUT\"]")).click();
	  driver.findElement(By.className("promoCode")).sendKeys("rahulshettyacademy");
	  driver.findElement(By.className("promoBtn")).click();
	  WebDriverWait wait= new WebDriverWait(driver, 5);
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoInfo")));
	  System.out.println(driver.findElement(By.className("promoInfo")).getText());
	  driver.findElement(By.xpath("//*[text()=\"Place Order\"]")).click();
		
		
		
		
	}

}
