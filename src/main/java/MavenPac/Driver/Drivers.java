package MavenPac.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Drivers {
	static WebDriver driver;
	public static WebDriver getDriver(String browser)
	{
		if(browser.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Drivers\\webD\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Drivers\\webD\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Ie"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Drivers\\webD\\IEDriverServer.exe");
			driver= new InternetExplorerDriver();
		}
		else
			System.out.println("Invalid browser !!");
		return driver;
	}

}
