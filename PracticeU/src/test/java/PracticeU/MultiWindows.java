package PracticeU;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWindows {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\PracticeU\\drivers\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Click Here")).click();
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> itr=windows.iterator();
		String parentID = itr.next();
		String childID = itr.next();
		driver.switchTo().window(childID);
		//System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		System.out.println(driver.findElement(By.xpath("(//*[text()=\"New Window\"])[2]")).getText());
		driver.switchTo().window(parentID);
		//System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
		System.out.println(driver.findElement(By.xpath("//*[text()=\"Opening a new window\"]")).getText());
	
	}

}
