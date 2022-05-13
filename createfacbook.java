package week2day6;

import java.lang.module.FindException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class createfacbook {

	public static void main(String[] args) {
		
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.facebook.com/");
        driver.findElement(By.linkText("Create New Account")).click();
        driver.findElement(By.name("firstname")).sendKeys("santhosh");
        driver.findElement(By.name("lastname")).sendKeys("kumar");
        driver.findElement(By.name("reg_email__")).sendKeys("santhoshkumarmm2398@gmail.com");
        driver.findElement(By.id("password_step_input")).sendKeys("santhosh@98");
        WebElement day = driver.findElement(By.id("day") );
		Select obj = new Select(day);
		obj.selectByValue("3");
		WebElement month = driver.findElement(By.id("month") );
		Select obj1 = new Select(month);
		obj1.selectByVisibleText("Mar");
		WebElement year = driver.findElement(By.id("year") );
		Select obj2 = new Select(year);
		obj2.selectByVisibleText("2019");
        driver.findElement(By.xpath("(//input[@name='sex'])[2]")).click();
        
        
        //driver.findElement(By.xpath("(//input[@name='sex'])[2]" )).click();  
        
        
       

	}

}
