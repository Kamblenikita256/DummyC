package testmeApp;

import org.testng.annotations.Test;

import com.mongodb.MapReduceCommand.OutputType;

import MavenPac.Driver.Drivers;

import org.testng.annotations.BeforeTest;

import java.io.File;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;

//import static org.testng.Assert.assertEquals;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;

public class OnlineShoppingTest {
	WebDriver driver;
	WebDriverWait wait;
	
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
		  driver.findElement(By.name("address")).sendKeys("pune");
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
  
  
  @BeforeTest
  public void startReportbeforeTest() {
	  driver=Drivers.getDriver("chrome");
	  driver.get("http://10.232.237.143:443/TestMeApp/fetchcat.htm");
  }

  @AfterTest
  public void endreportAfterTest() {
	  driver.close();
  }

}
