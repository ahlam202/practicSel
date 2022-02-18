package PracticeU;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;



public class Booking {
	public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\PracticeU\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
	   WebElement roundTrp= driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1"));
		roundTrp.click();
		//handling dynamic dropdown
		WebElement from= driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction"));
		from.click();
		WebElement ahmd=driver.findElement(By.xpath("//a[@text= \"Ahmedabad (AMD)\"]"));
		ahmd.click();
	
		//WebElement dlh=driver.findElement(By.xpath("(//*[@text=\"Delhi (DEL)\"])[2]"));//using index
		WebElement dlh=driver.findElement(By.xpath("//*[@id=\"ctl00_mainContent_ddl_destinationStation1_CTNR\"]//*[@text=\"Delhi (DEL)\"]"));// using parent-child				
		dlh.click();
		
		WebElement departurDate=driver.findElement(By.xpath("//*[text()=12]"));
		departurDate.click();
		WebElement returnDate= driver.findElement(By.id("Div1"));
		System.out.println(returnDate.getAttribute("style"));//for see if this elemnt enable or disable 
		if (returnDate.getAttribute("style").contains("1")) {
				System.out.println("it is enabled");
			} else {
		         System.out.println("it is disabled");
		}
		WebElement pass= driver.findElement(By.id("divpaxinfo"));
		pass.click();
		WebElement clickon= driver.findElement(By.id("hrefIncAdt"));
		// clickon.click(); //if wanna click more than one can just repeat this code
		for (int i = 1; i <2; i++) {
		clickon.click();//the best methode for click more than one by using for loop
		}	
		System.out.println(pass.getText());
		Assert.assertEquals(pass.getText(),"2 Adult" );
		//int i=1;
		//while (i<2) {
		//clickon.click();
		//i++;// 
		//}	
		WebElement doneButton= driver.findElement(By.id("btnclosepaxoption"));
		doneButton.click();	
		//handling static dropdown
		WebElement currency= driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		Select usa=new Select(currency);
		usa.selectByValue("USD");
		System.out.println(usa.getFirstSelectedOption().getText());//how printing in select class
		//handling checkbox
		WebElement box= driver.findElement(By.id("ctl00_mainContent_chk_friendsandfamily"));
		box.click();
		//System.out.println(box.isSelected());
		Assert.assertTrue(box.isSelected());
	    System.out.println( driver.findElements(By.xpath("//*[@type=\"checkbox\"]")).size());//how many checkboxes we have
	    //handling AutoSuggestive dropdown 
	    WebElement country=driver.findElement(By.id("autosuggest"));
		country.sendKeys("al");
		
		//using for loop
		for (int i = 0; i < 2; i++) {
			country.sendKeys(Keys.DOWN);
		}
		//using for each loop
		List<WebElement> allcount= driver.findElements(By.xpath("//*[@class=\"ui-menu-item\"]"));
	    for (WebElement element : allcount) {
		if (element.getText().equalsIgnoreCase("Algeria")) {
		    element.click();
		    break;
			}
		}
		WebElement searchButton= driver.findElement(By.id("ctl00_mainContent_btn_FindFlights"));
		searchButton.click();
				
				
	
			
		
		
		
	

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
