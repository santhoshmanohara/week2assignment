package week2day6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {

	public static void main(String[] args) {
		  WebDriverManager.chromedriver().setup();
		  ChromeDriver driver=new ChromeDriver();
		  driver.get("http://leaftaps.com/opentaps/control/main");
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  
		  driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		  driver.findElement(By.id("password")).sendKeys("crmsfa");
		  driver.findElement(By.className("decorativeSubmit")).click();
		  driver.findElement(By.linkText("CRM/SFA")).click();
		  driver.findElement(By.linkText("Leads")).click();
		  driver.findElement(By.linkText("Create Lead")).click();
		  driver.findElement(By.id("createLeadForm_companyName")).sendKeys("infosys");
		  driver.findElement(By.id("createLeadForm_firstName")).sendKeys("santhosh");
		  driver.findElement(By.id("createLeadForm_lastName")).sendKeys("kumar");
		  driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("678521");
		  driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("100");
		  driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("+91");
		  WebElement findElement = driver.findElement(By.id("createLeadForm_dataSourceId"));
		          Select obj=new Select(findElement);
		          obj.selectByIndex(4); 
		  driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("santhosh");
		  driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("kumar");
		  driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("mr");
		  driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("23/3/1998");
		  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("automation");
		  driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Automation");
		  driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Quality Assurance");
		  driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("2000000");
		  WebElement findElement2 = driver.findElement(By.id("createLeadForm_industryEnumId"));
		  Select obj2=new Select(findElement2);
		  obj2.selectByIndex(9);
		  WebElement findElement3 = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		  Select obj3=new Select(findElement3);
		  obj3.selectByIndex(2);
		  driver.findElement(By.id("createLeadForm_description")).sendKeys("exanplation");
		  driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("#");
		  driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("special");
		  driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("91");
		  driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("12345678");
		  driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("santhosh@gamail.com");
		  driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("santhosh");
		  driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9361494758");
		  driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("//http.facbook.com");
		  driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("santhosh");
		  driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("uncertain");
		  driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("175/trichy main road thammampatty");
		  driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("175/trichy main road thammampatty");
		  driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("salem");
		  WebElement findElement4 = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		       Select obj4=new Select(findElement4);
		       obj4.selectByVisibleText("Alaska");
		       WebElement findElement5 = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		           Select obj5=new Select(findElement5);
		           obj5.selectByIndex(5);
		 driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("636113");
		 driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("45612");
		 driver.findElement(By.name("submitButton")).click();
		 String text1 =driver.findElement(By.id("viewLead_firstName_sp")).getText();
		 System.out.println(text1);
		 String title2=driver.getTitle();
		 System.out.println(title2);
		 driver.findElement(By.className("linktext")).click();
		 driver.close();
		 
		 
		 
		 
		 
		           
		  
		  
		  
		  
		  
		  
		  
		 
		  
		        
		       
		  
		  
	
		  
		 

		  
		  
		  
		  
		  
	}
		  
		  
		  
		  
		      
			  

	}


