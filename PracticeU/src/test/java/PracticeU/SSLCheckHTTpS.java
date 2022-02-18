package PracticeU;

import java.io.File;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SSLCheckHTTpS {
public static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// handling https certification
		ChromeOptions options=new ChromeOptions();
		options.setAcceptInsecureCerts(true);
      //set proxies,plugins & paths 
		// Add the WebDriver proxy capability.
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("myhttpproxy:3337");
		options.setCapability("proxy", proxy);
		// Add a ChromeDriver-specific capability.
		options.addExtensions(new File("/path/to/extension.crx"));
		ChromeDriver driver = new ChromeDriver(options);
		//Block pop-up windows
		options.setExperimentalOption("excludeSwitches",
		Arrays.asList("disable-popup-blocking"));
		//Set download directory
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("download.default_directory", "/directory/path");
		options.setExperimentalOption("prefs", prefs);
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\PracticeU\\src\\chromedriver.exe");
		driver=new ChromeDriver(options);
		driver.get("https://expired.badssl.com/");
		System.out.println(driver.getTitle());
	}

}
