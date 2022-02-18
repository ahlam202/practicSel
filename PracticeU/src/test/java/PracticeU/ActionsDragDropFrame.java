package PracticeU;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDragDropFrame {
	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\git\\repository\\Automationtraining\\src\\Drivers\\chromedriver.exe");
	      driver=new ChromeDriver();
	      driver.navigate().to("https://jqueryui.com/droppable/");
	      driver.manage().window().maximize();
	      Thread.sleep(6000);
	      //An IFrame (Inline Frame) is an HTML document inside another HTML document on a website.
	      //The IFrame HTML element is often used to insert content from another source, such as an advertisement
	      System.out.println(driver.findElements(By.tagName("iframe")).size());
	      driver.switchTo().frame(0);
	      WebElement dragged=driver.findElement(By.id("draggable"));
	      WebElement drropable=driver.findElement(By.id("droppable"));
	      Actions ob=new Actions(driver);
	      ob.dragAndDrop(dragged, drropable).build().perform();
	      Thread.sleep(6000);
	      driver.switchTo().parentFrame();
	      //driver.switchTo().defaultContent();
	      WebElement sizeds=driver.findElement(By.linkText("Resizable"));
	      sizeds.click();		
		
	}

}
