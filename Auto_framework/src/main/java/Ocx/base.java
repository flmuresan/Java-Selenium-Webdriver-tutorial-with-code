package Ocx;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {
	
	public WebDriver driver;  //Webdriver is initialized once, in the beginning so it can be used through all the if/else loop
	public WebDriver initializeDriver() throws IOException
	{
		Properties prop = new Properties ();
		FileInputStream fis = new FileInputStream("G:\\Florin Work\\Selenium workplace\\Ocx Framework\\Auto_framework\\src\\main\\java\\Ocx\\data.properties");
		
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if(browserName=="chrome")
		{
			System.setProperty("webdriver.chrome.driver", "G:\\Florin Work\\Eclipse\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browserName=="firefox")
		{
			//execute in firefox driver 
		}
		else if(browserName=="edge")
		{
			//execute in Edge browser 
		}
		else if(browserName=="IE")
		{
			//execute in IE11 browser 
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
		
	}

}
