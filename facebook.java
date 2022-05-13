package week2day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class facebook {

public static void main(String[] args) {
	   
	  WebDriverManager.chromedriver().setup();
	  ChromeDriver driver=new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	  driver.findElement(By.id("email")).sendKeys("santhos@gmail.com ");
	  driver.findElement(By.id("pass")).sendKeys("12345");
	  // driver.findElement(By.name("login")).click();
      driver.close();
		  
	  
}
	  
	  
	   }