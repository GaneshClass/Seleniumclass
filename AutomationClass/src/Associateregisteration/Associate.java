package Associateregisteration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Associate 
{
    public static void main(String[] args) 
  {
	System.setProperty("webdriver.chrome.driver", "/Users/user/Desktop/chromedriver");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://flexforceondemand.com");
	driver.manage().window().maximize();
	

	WebElement user = driver.findElementByXPath("//*[text()[contains(.,'I want to Work')]]");
	user.click();
	
	WebElement Zip = driver.findElementById("zipcode");
	Zip.sendKeys("302020");
	
	WebElement Check_Zip = driver.findElementById("checkZip");
	Check_Zip.click();

		
	WebElement Apply_Button = driver.findElement( By.linkText("Apply Now"));
	Apply_Button.click();  
	
			
	//WebElement Apply = driver.findElementByXPath("//*[text()[contains(.,'Apply Now')]]");
	//Apply.click();
	
	
	new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//label[@for='term_and_conditions']"))).click();
	
	
	WebElement next = driver.findElementById("consentToProceed");
	next.click();
	
	WebElement First_Name= driver.findElementById("Register_firstname");
	First_Name.sendKeys("Test");
	
	WebElement Last_Name= driver.findElementById("Register_lastname");	
	Last_Name.sendKeys("Associate");
		
	WebElement Password= driver.findElementById("Register_password");
	Password.sendKeys("Test@123");
	
	WebElement Confirm_Password= driver.findElementById("Register_repeat_password");
	
	Confirm_Password.sendKeys("Test@123");
	
	WebElement Email= driver.findElementById("verifyWithEmail");
	Email.click();
	
	WebElement Email_id= driver.findElementById("Register_email");
	Email_id.sendKeys("testa@mailinator.com");
	
    WebElement checkbox1 = driver.findElementByXPath("//*[text()[contains(.,' Consent to Contact')]]");
	
	//WebElement checkbox = driver.findElementByXPath("/html/body/div[1]/div[1]/form/section/div/div[2]/div[6]/div/div/div/label");
    checkbox1.click();
    
    WebElement register= driver.findElementById("registerEmail");
	register.click();
	
	WebElement verify= driver.findElementById("verification_code");
	verify.sendKeys("");
    
    
    
	 
  }
    

	
		
}
	


