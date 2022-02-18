package PracticeU;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Links {
public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\PracticeU\\src\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://www.ebay.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Count of the Link in the Entire Page
		System.out.println("Links in the Page");
	System.out.println(driver.findElements(By.tagName("a")).size());
	//Count of links in the footer section of the page
	WebElement footer=driver.findElement(By.xpath("//*[@id=\"glbfooter\"]"));
	System.out.println("Links in the footer section");
	System.out.println(footer.findElements(By.tagName("a")).size());
	WebElement col=driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
	System.out.println("Links in the 2nd coloumn of the section");
	System.out.println(col.findElements(By.tagName("a")).size());
	//String Beforeclicking = null;
	//String Afterclicking;
	//click on each link in the coloumn and if the page are opening
	for(int i=0;i<col.findElements(By.tagName("a")).size();i++)
	{
	col.findElements(By.tagName("a")).get(i).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
	}//opens all the tabs
	Set<String> win=driver.getWindowHandles();
	Iterator<String> it=win.iterator();
	while (it.hasNext()) {
		driver.switchTo().window(it.next());
		System.out.println(driver.getTitle());
		
	}
		
		/*if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
		{
			Beforeclicking = driver.getTitle();
		
			col.findElements(By.tagName("a")).get(i).click();
			break;
			}
	}
	Afterclicking =driver.getTitle();
	if(Beforeclicking!=Afterclicking)
	{
		if(driver.getPageSource().contains("sitemap"))
	
			System.out.println("PASS");
	}
	else
	{
		System.out.println("FAIL");*/
	}
		
	

}
