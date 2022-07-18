package seamlessHr;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class invalidTest {
  @Test
  public void f() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\User\\Downloads\\chromedriver_win32 (3)\\chromedriver.exe");
	  ChromeDriver driver= new ChromeDriver();
	  
	  driver.manage().window().maximize();
	  
	  //launch the url
	  driver.get("https://the-internet.herokuapp.com");
	  Thread.sleep(1000);
	  
	  //click on 'form authentication'
	  driver.findElement(By.xpath("//a[contains(text(),'Form Authentication')]")).click();
	  
	  //enter 'username'
	  driver.findElement(By.id("username")).sendKeys("thomas");
	  
	  //enter 'password'
	  driver.findElement(By.id("password")).sendKeys("SecretPassword!");
	  Thread.sleep(1000);
	  
	  //click on Login Button
	  driver.findElement(By.xpath("//i[contains(text(),'Login')]")).click();
	  
	  //Assert the error message “Your username is invalid!”
	  String test2 = driver.findElement(By.className("flash")).getText();
	  System.out.println("error message is" +test2);
	
	  assertTrue(test2.contains("Your username is invalid!"));
	   System.out.println("assert pass");
	   Thread.sleep(1000);
	   
	   driver.close();
  }
}    
