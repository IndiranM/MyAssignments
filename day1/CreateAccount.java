package seleniumAssignments.week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

//import com.sun.org.apache.bcel.internal.generic.Select;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	
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
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account96");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Indhru");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("(//input[@class='inputBox'])[5]")).sendKeys("200000");
		
		WebElement SourceDD = driver.findElement(By.name("industryEnumId"));
		Select sec = new Select(SourceDD);
		sec.selectByIndex(3);
		
		WebElement OwnerShip = driver.findElement(By.name("ownershipEnumId"));
		Select sec1 = new Select(OwnerShip);
		sec1.selectByVisibleText("S-Corporation");
		
		WebElement Source = driver.findElement(By.id("dataSourceId"));
		Select sec3 = new Select(Source);
		sec3.selectByValue("LEAD_EMPLOYEE");
		
		WebElement MarCamp = driver.findElement(By.id("marketingCampaignId"));
		Select sec4 = new Select(MarCamp);
		sec4.selectByIndex(6);
		
		WebElement State = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select sec5= new Select(State);
		sec5.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
	}

}
