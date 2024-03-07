package com.Ecommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class NopecommerceTest {
WebDriver Driver;
  @BeforeTest
  public void LaunchTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "F:\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	Driver =new ChromeDriver(options);
//	  WebDriverManager.chromedriver().setup();
//	  Driver =new ChromeDriver();
		Driver.get("http://demo.nopcommerce.com/");
		Driver.manage().window().maximize();
		JavascriptExecutor Java = (JavascriptExecutor)Driver;
		Java.executeScript("window.scroll,(0,5000)");
		Java.executeScript("Window.scroll,(0,-5000)");
		Thread.sleep(1000);
		
  }

  @Test(priority=1)
  public void SignupTest() throws InterruptedException {
	  
      Driver.findElement(By.xpath("//a[@class=\'ico-register\']")).click();
 
            JavascriptExecutor java = (JavascriptExecutor)Driver;
            java.executeScript("window.scroll(0,1000)");
            Thread.sleep(2000);
            java.executeScript("window.scroll(0,-1000)");
            Thread.sleep(2000);
            java.executeScript("Window.scroll,(0,3000)");
            Thread.sleep(2000);
            
            WebElement Radio = Driver.findElement(By.xpath("//input[@id=\"gender-male\"]"));
            Radio.click();
            
            Thread.sleep(2000);
            
            WebElement Firstname = Driver.findElement(By.xpath("//input[@id=\"FirstName\"]"));
            Firstname.sendKeys("Dom");
           
            Thread.sleep(2000);
            
            WebElement Lastname = Driver.findElement(By.xpath("//input[@id=\"LastName\"]"));
            Lastname.sendKeys("Paul");
            
            Thread.sleep(2000);
            
            WebElement Drop = Driver.findElement(By.xpath("//select[@name=\'DateOfBirthDay\']"));
            Select sel = new Select(Drop); 
            sel.selectByValue("1");
            Thread.sleep(2000);
            
            WebElement Month = Driver.findElement(By.xpath("//select[@name=\'DateOfBirthMonth\']"));
            Select Mon = new Select(Month);
            Mon.selectByValue("12");
            Thread.sleep(2000);
            
            WebElement year = Driver.findElement(By.xpath("//select[@name=\'DateOfBirthYear\']"));
            Select ye = new Select(year);
            ye.selectByValue("1997");
            Thread.sleep(2000);
            
            WebElement Email = Driver.findElement(By.xpath("//input[@id='Email']"));
            Email.sendKeys("domnic@gmail.com");
            Thread.sleep(2000);
            
            WebElement Newsletter = Driver.findElement(By.xpath("//input[@id='Newsletter']"));
            Newsletter.click();
            Thread.sleep(2000);
                  
            WebElement Password = Driver.findElement(By.xpath("//input[@id='Password']"));
            Password.sendKeys("12345678");
            Thread.sleep(2000);
            
            WebElement ConfirmPass = Driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
            ConfirmPass.sendKeys("12345678");
            Thread.sleep(2000);
            
            WebElement Submit = Driver.findElement(By.xpath("//button[@id='register-button']"));
            Submit.click();
            
            Thread.sleep(2000);
            
            WebElement Continue = Driver.findElement(By.xpath("//a[@class='button-1 register-continue-button']"));
            Continue.click();
            Thread.sleep(5000);
      	  
            
  }
  @Test(priority = 2)
public void Login() throws InterruptedException {
	
	  WebElement Login= Driver.findElement(By.xpath("//a[@class=\"ico-login\"]"));
	  Login.click();
	  
	  WebElement Email = Driver.findElement(By.xpath("//input[@class=\"email\"]"));
	  Email.sendKeys("Domnic@gmail.com");
	  Thread.sleep(5000);
	  
	  WebElement Password = Driver.findElement(By.xpath("//input[@class=\"password\"]"));
	  Password.sendKeys("12345678");
	  Thread.sleep(5000);
	  
	  WebElement Button = Driver.findElement(By.xpath("//button[@class=\"button-1 login-button\"]"));
	  Button.click();
	  Thread.sleep(2000);
	  
}
  
  
 @Test(priority = 3)
  public void Product() throws InterruptedException {
	 
	  WebElement Click = Driver.findElement(By.xpath("//img[@title=\"Show products in category Electronics\"]"));
	  Click.click();
	  Thread.sleep(5000);
			  
			  
	 WebElement Cellphones = Driver.findElement(By.xpath("(//a[@href=\"/cell-phones\"])[3]"));
	 Cellphones.click();
	 Thread.sleep(5000);
			  
			  
	 WebElement View = Driver.findElement(By.xpath("(//h2[@class=\"product-title\"])[1]"));
	 View.click();
	 Thread.sleep(5000);
			  
			
  }
 
 @Test(priority=4)
 public void cart() throws InterruptedException {
	 WebElement Addcart = Driver.findElement(By.xpath("//button[@id=\"add-to-cart-button-18\"]"));
	 Addcart.click();
	  Thread.sleep(5000);
	  
	 
	 WebElement Checkcart = Driver.findElement(By.xpath("//a[@class=\"ico-cart\"]"));
	 Checkcart.click();
	  Thread.sleep(5000);
	  
	 WebElement Agree = Driver.findElement(By.xpath("//input[@id=\"termsofservice\"]"));
	 Agree.click();
	  Thread.sleep(5000);
	  
	 WebElement Checkout = Driver.findElement(By.xpath("//button[@class=\"button-1 cart-button\"]"));
	 Checkout.click();
	  Thread.sleep(5000);
	  
	 
 }
 @AfterTest
  public void Endtest(){
	Driver.close();
  }





}
