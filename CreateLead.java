package week2.day1.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("http://leaftaps.com/opentaps/control/main");
		
		String title = driver.getTitle();
		System.out.println("Title of Home: " + title);

		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys("demosalesmanager");
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		loginButton.click();
		WebElement crmsfaLink = driver.findElement(By.linkText("CRM/SFA"));
		crmsfaLink.click();
		
		String titlecrmsfa = driver.getTitle();
		System.out.println("Title of crmsfa page: " + titlecrmsfa);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		
		String titleOfCreateLeadPage = driver.getTitle();
		System.out.println("Title of Create Lead: " + titleOfCreateLeadPage);
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//creating an object in order to get the value passed to FirstName field before Creating Lead.
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		firstName.sendKeys("Elavarasi");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arunagiri");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Arunagiri");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Ela");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("Arun");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("Software Engineer");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Tester");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("1200000");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("123");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium Learner");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("Learner and not an employee");
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).sendKeys("456789");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("03/1/86");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Information Technology");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("2000");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ELAA");
		//Clear the value and enter a new value.
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).clear();
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("9144");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("201");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("ela.arunagiri@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("9940009391");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("Elavarasi Arunagiri");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/login");
		
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Elavarasi Arunagiri");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("Selenium");
		driver.findElement(By.id("createLeadForm_generalAddress1")).sendKeys("CSK, LIC Manickam Road");
		driver.findElement(By.id("createLeadForm_generalAddress2")).sendKeys("Sevilimedu");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Kanchipuram");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("631201");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("231");
		driver.findElement(By.id("createLeadForm_generalCountryGeoId")).sendKeys("India");
		driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")).sendKeys("TAMILNADU");
		
		System.out.println("The value passed to First Name field: " +firstName.getAttribute("value"));
		
		driver.findElement(By.className("smallSubmit")).click();
		
		String titleAfterSubmiting = driver.getTitle();
				
		String titleOfLastPage = "View Lead | opentaps CRM";
		
		if(titleAfterSubmiting.equals(titleOfLastPage))
			System.out.println("The page after submitting is: " +titleAfterSubmiting);
		else
			System.out.println("The page after submitting is not View Lead, it is:" +titleAfterSubmiting);
		
		WebElement firstName1 = driver.findElement(By.id("viewLead_firstName_sp"));
		System.out.println("First Name in the View Lead page is " +firstName1.getText());
		
		//driver.close();

	}

}
