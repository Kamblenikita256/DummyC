import org.testng.annotations.Test;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import MavenPac.Driver.Drivers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ReportOnlineShopping {
	ExtentReports extent;
	ExtentTest logger;
	WebDriver driver;
	WebDriverWait wait;

  @Test
  public void passtest() {
	  logger = extent.startTest("passTest");
		Assert.assertTrue(true);
		logger.log(LogStatus.PASS, "Test Case Passed is passTest");

	  driver = Drivers.getDriver("Ie");
		driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
	    /*		 
		  Assert.assertEquals(driver.getTitle(), "Home");
		  driver.findElement(By.linkText("SignUp")).click();
		  Assert.assertEquals(driver.getTitle(), "Sign Up");
		  driver.findElement(By.name("userName")).sendKeys("vickie345");
		  driver.findElement(By.name("firstName")).sendKeys("swaraly");
		  wait= new WebDriverWait(driver, 1000);
		 
		  //String txt=driver.findElement(By.className("label label-default")).getText();
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.id("firstName")));
		  String txt= driver.findElement(By.id("err")).getText();
		  System.out.println(txt);
		  if(txt.equals("Name Already Exists")) {
			  //System.out.println("nikita");
			  //driver.findElement(By.name("userName")).sendKeys("nikita");
			 driver.close();
			  //driver.findElement(By.name("userName")).sendKeys("swar444");
		  }
		  if(txt.equals("Available")) {
			 // System.out.println("available");
			  
			  driver.findElement(By.name("lastName")).sendKeys("kamble");
			  driver.findElement(By.name("password")).sendKeys("Saku45600");
			  driver.findElement(By.name("confirmPassword")).sendKeys("Saku45600");
			  driver.findElement(By.xpath("//input[@type='radio' and @value='Male']")).click();
			  driver.findElement(By.name("emailAddress")).sendKeys("kambleikita20o@gmail.com");
			  driver.findElement(By.name("mobileNumber")).sendKeys("9908887994");
			  driver.findElement(By.name("dob")).sendKeys("09/08/1998");
			  driver.findElement(By.name("address")).sendKeys("punehhuisyh camp bhjkl");
			  Select sel=new Select(driver.findElement(By.id("securityQuestion")));
			  sel.selectByIndex(1);
			  driver.findElement(By.name("answer")).sendKeys("swaral");
			  
			  driver.findElement(By.xpath("//input[@type='submit' and @value='Register']")).click();
			  //Assert.assertEquals(driver.getTitle(), "Login");

		}
	
		  Assert.assertEquals(driver.getTitle(), "Login");
		  driver.findElement(By.name("userName")).sendKeys("lalitha");
		  driver.findElement(By.name("password")).sendKeys("Password123");
		  driver.findElement(By.name("Login")).click();
		  //Assert.assertEquals(driver.getTitle(), "Home");
		 // String str1=driver.findElement(By.linkText("SignOut")).getText();
		  wait= new WebDriverWait(driver, 100);
		  wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignOut")));
		  wait.until(ExpectedConditions.titleContains("Home"));
			//Assert.assertEquals(driver.getTitle(), "Home");
		  
			
			Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"))).build().perform();
			//System.out.println("ok");
			driver.findElement(By.linkText("Electronics")).click();
			WebDriverWait wait=new WebDriverWait(driver,100);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Head Phone"))).click();
			Assert.assertEquals(driver.getTitle(), "Search");
			driver.findElement(By.linkText("Add to cart")).click();
			driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();//cart1 link
			Assert.assertEquals(driver.getTitle(), "View Cart");
			driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();//checkout button
			wait= new WebDriverWait(driver, 100);
			wait.until(ExpectedConditions.titleContains("Cart Checkout"));
				  
			Assert.assertEquals(driver.getTitle(), "Cart Checkout");
			driver.findElement(By.xpath("//*[@id=\"add1\"]")).sendKeys("chennai ");
			driver.findElement(By.xpath("//input[@type='submit' and @value='Proceed to Pay']")).click();
			
		    wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/h3"), "Net Banking"));
			// wait.until(ExpectedConditions.titleContains("Payment Gateway"));
			driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label")).click();
			driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
			wait= new WebDriverWait(driver, 100);
			driver.findElement(By.name("username")).sendKeys("123456");
			driver.findElement(By.name("password")).sendKeys("Pass@456");
			driver.findElement(By.xpath("//input[@type='submit' and @value='LOGIN']")).click();
			driver.findElement(By.xpath("//input[@type='password' and @value='PASSWORD']")).sendKeys("Trans@456");
			driver.findElement(By.xpath("//input[@type='submit' and @value='PayNow']")).click();
			Assert.assertEquals(driver.getTitle(), "Order Details");
	*/
  }

	 @Test(priority=1)
	  public void testRegistration() {
		  Assert.assertEquals(driver.getTitle(), "Home");
		  driver.findElement(By.linkText("SignUp")).click();
		  Assert.assertEquals(driver.getTitle(), "Sign Up");
		  driver.findElement(By.name("userName")).sendKeys("ccccvvvv");
		  driver.findElement(By.name("firstName")).click();
		  wait= new WebDriverWait(driver, 100);
		  String txt= driver.findElement(By.id("err")).getText();
		 // String txt=driver.findElement(By.className("label label-default")).getText();
		  System.out.println(txt);
		  if(txt.equals("Name Already Exists")) {
			  //System.out.println("nikita");
			  //driver.findElement(By.name("userName")).sendKeys("nikita");
			  driver.close();
		  }
		  if(txt.equals("Available")) {
			  System.out.println("available");
			  driver.findElement(By.name("firstName")).sendKeys("nikita");
			  driver.findElement(By.name("lastName")).sendKeys("kamble");
			  driver.findElement(By.name("password")).sendKeys("nikita256");
			  driver.findElement(By.name("confirmPassword")).sendKeys("nikita256@");
			  driver.findElement(By.xpath("//input[@type='radio' and @value='Male']")).click();
			  driver.findElement(By.name("emailAddress")).sendKeys("kamblenikita2oo@gmail.com");
			  driver.findElement(By.name("mobileNumber")).sendKeys("9998887654");
			  driver.findElement(By.name("dob")).sendKeys("09/09/1998");
			  driver.findElement(By.name("address")).sendKeys("pune camp ok");
			  Select sel=new Select(driver.findElement(By.id("securityQuestion")));
			  sel.selectByIndex(1);
			  driver.findElement(By.name("answer")).sendKeys("niku");
			  
			  driver.findElement(By.xpath("//input[@type='submit' and @value='Register']")).click();
			  Assert.assertEquals(driver.getTitle(), "Login");
				 
			  
			  
			  
			  
			  
			   }
		
		
	  }
	 @Test(priority=2)
	  public void testLogin() {
		//  Assert.assertEquals(driver.getTitle(), "Home");
		 // driver.findElement(By.linkText("SignIn")).click();
		  //Assert.assertEquals(driver.getTitle(), "Login");
		  driver.findElement(By.name("userName")).sendKeys("lalitha	");
		  driver.findElement(By.name("password")).sendKeys("Password123");
		  driver.findElement(By.name("Login")).click();
		  Assert.assertEquals(driver.getTitle(), "Home");
		 // String str1=driver.findElement(By.linkText("SignOut")).getText();
		  wait= new WebDriverWait(driver, 1000);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("SignOut")));
			//wait.until(ExpectedConditions.titleContains("home"));
			Assert.assertEquals(driver.getTitle(), "Home");
		  
		  
		  
		  
	  }
	 @Test(priority=3)
	  public void testCart() {
		  //Assert.assertEquals(driver.getTitle(), "Home");
		 
		 // Actions act=new Actions(driver);
		 /* action.moveToElement(driver.findElement(By.xpath("//span[text()='All Categories']"))).
			
		  moveToElement(driver.findElement(By.xpath("//span[text()='Electronics']")))
		  .moveToElement(driver.findElement(By.xpath("//span[text()='Head Phone']"))).click().build().perform();
			  
		 // driver.findElement(By.linkText("All Categories")).click();
		  //driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		  //driver.findElement(By.xpath("//span[text()='Electronics']")).click();
		  //driver.findElement(By.xpath("//span[text()='Head phone']")).click();
		  */
		//driver.findElement(By.linkText("All Categories")).click();
		  /*
		    Actions act=new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"))).build().perform();
			 System.out.println("success");
			 driver.findElement(By.linkText("Electronics")).click();
			 WebDriverWait wait=new WebDriverWait(driver,100);
			 wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Head Phone")));
			 driver.findElement(By.xpath("//*[@id=\"submenuul11290\"]/li[1]/a/span")).click();
			 // driver.findElement(By.linkText("Add to cart")).click();
			  wait= new WebDriverWait(driver, 100);
			  //wait.until(ExpectedConditions.titleContains("Search"));
			 // Assert.assertEquals(driver.getTitle(), "Search");
			  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				//explicit wait
				wait= new WebDriverWait(driver, 100);
				driver.findElement(By.xpath("/html/body/header/div[1]/div/div/div[2]/div/a[2]")).click();
				//System.out.println(str2);
				driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();
				
			*/
		  //driver.findElement(By.linkText("All Categories")).click();
		    Actions act=new Actions(driver);
		   act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu3\"]/li[2]/a/span"))).build().perform();
		    System.out.println("success");
		    driver.findElement(By.linkText("Electronics")).click();
		    WebDriverWait wait=new WebDriverWait(driver,100);
		    wait.until(ExpectedConditions.presenceOfElementLocated(By.linkText("Head Phone"))).click();
		   Assert.assertEquals(driver.getTitle(), "Search");
			  driver.findElement(By.linkText("Add to cart")).click();
		    //driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();//add to cart button
		    driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();//cart1 link
		    Assert.assertEquals(driver.getTitle(), "View Cart");
		    driver.findElement(By.xpath("//*[@id=\"cart\"]/tfoot/tr[2]/td[5]/a")).click();//checkout button
		   // Assert.assertEquals(driver.getTitle(), "View Cart");
		    wait= new WebDriverWait(driver, 100);
			 wait.until(ExpectedConditions.titleContains("Cart Checkout"));
			  
			  
		  
		
	  }
		
	  @Test(priority=4)
	  public void testPayment() {
		 Assert.assertEquals(driver.getTitle(), "Cart Checkout");
		  driver.findElement(By.xpath("//*[@id=\"add1\"]")).sendKeys("chennai ");
		  driver.findElement(By.xpath("//input[@type='submit' and @value='Proceed to Pay']")).click();
		/*  wait= new WebDriverWait(driver, 100);
		  Assert.assertEquals(driver.getTitle(), "Redirecting to Payment Gateway");
		  wait= new WebDriverWait(driver, 1000);
		  Assert.assertEquals(driver.getTitle(), "Payment Gateway");
		  */
		  WebDriverWait wait=new WebDriverWait(driver,100);
		   wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@id=\"horizontalTab\"]/div[2]/div/div/h3"), "Net Banking"));
		// wait.until(ExpectedConditions.titleContains("Payment Gateway"));
		 driver.findElement(By.xpath("//*[@id=\"swit\"]/div[1]/div/label")).click();
		 driver.findElement(By.xpath("//*[@id=\"btn\"]")).click();
		  wait= new WebDriverWait(driver, 100);
		  driver.findElement(By.name("username")).sendKeys("123456");
		  driver.findElement(By.name("password")).sendKeys("Pass@456");
		  driver.findElement(By.xpath("//input[@type='submit' and @value='LOGIN']")).click();
		  driver.findElement(By.xpath("//input[@type='password' and @value='PASSWORD']")).sendKeys("Trans@456");
		  driver.findElement(By.xpath("//input[@type='submit' and @value='PayNow']")).click();
		  Assert.assertEquals(driver.getTitle(), "Order Details");
		  
		  
	  
		 
		    
		  
	  }
	  

 
  @AfterMethod
  public void afterMethod(ITestResult result)  throws Exception {
	  if (result.getStatus() == ITestResult.SUCCESS) {
			logger.log(LogStatus.PASS, "Test Case Failed is " + result.getName());
			logger.log(LogStatus.PASS, "Test Case Failed is " + result.getThrowable());
			String screenshotPath = ReportOnlineShopping.getScreenshot(driver, result.getName());
			logger.log(LogStatus.PASS, logger.addScreenCapture(screenshotPath));
		} else if (result.getStatus() == ITestResult.SKIP) {
			logger.log(LogStatus.SKIP, "Test Case Skipped is " + result.getName());
		}
		extent.endTest(logger);
  }

  @BeforeTest
  public void beforeTest() {
	 
			extent = new ExtentReports(System.getProperty("user.dir") + "/test-output/Reports.html", true);
			extent.addSystemInfo("Host Name", "TestMe");
			extent.addSystemInfo("Environment", "Selenium Testing");
			extent.addSystemInfo("User Name", "Nikita");				  
  }
  public static String getScreenshot(WebDriver driver, String screenshotName) throws Exception {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "/FailedScreenshots/" + screenshotName + dateName
				+ ".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}

  @AfterTest
  public void afterTest() {
	  extent.close();
		driver.close();
  }
  

}
