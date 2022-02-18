package PracticeU;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Miscelleanous {
public static WebDriver driver;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\PracticeU\\src\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//take screenshot
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\Admin\\eclipse-workspace\\PracticeU\\screenshoot\\capture.jpg"));
		//FilleUtils.copyFile(src,new file(""));
	}

}
