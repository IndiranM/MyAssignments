package seleniumAssignments.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateLead {
	
	public static void main(String[] args) {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TsestLeaf001");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Indiran");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Anu");
		
		WebElement SourceDD = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select sec = new Select(SourceDD);
		sec.selectByVisibleText("Employee");
		
		//createLeadForm_marketingCampaignId
		WebElement MarCamp = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select sec1 = new Select(MarCamp);
		sec1.selectByValue("9001");
		
		//createLeadForm_generalCountryGeoId
		WebElement Country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select sec2 = new Select(Country);
		sec2.selectByVisibleText("India");
		
		driver.findElement(By.name("submitButton")).click();
		
		String title = driver.getTitle();
		System.out.println(title);
		
	}

}
