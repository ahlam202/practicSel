package PracticeU;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\git\\repository\\Automationtraining\\src\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.amazon.com/");
		driver.manage().window().maximize();
		Actions ob=new Actions(driver);
		//Mouse hover
		WebElement viewds= driver.findElement(By.id("nav-link-accountList"));
		ob.moveToElement(viewds).build().perform();
		WebElement order=driver.findElement(By.id("nav-orders"));
		order.click();
		//uppercase by using keys
		ob.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
		//double click
		ob.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().sendKeys("hello").doubleClick().build().perform();
		//right click
		ob.moveToElement(viewds).contextClick().build().perform();
		
		
		
		
		
	}

}
