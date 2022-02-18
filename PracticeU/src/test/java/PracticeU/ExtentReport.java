package PracticeU;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;


public class ExtentReport {
public WebDriver driver;
ExtentReports extent;
@BeforeTest
public void cinfig() {
	//need this 2 ExtentReports  --> for attach reporter
	//ExtentSparkReporter--> for create report and path
	String path=System.getProperty("user.dir")+"\\report\\index.html";
	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	reporter.config().setReportName("web automation results");
	reporter.config().setDocumentTitle("test results");
	
    extent =new ExtentReports();
	extent.attachReporter(reporter);
	extent.setSystemInfo("tester", "ahlam");//create tester name
}
@Test
public void initialDemo() {
	extent.createTest("initial demo");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\git\\repository\\Automationtraining\\src\\Drivers\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.navigate().to("https://www.amazon.com/");
	System.out.println(driver.getTitle());
	extent.flush();//that the test is done, should add in end of all test cases 
}

	
	
	
	
}
