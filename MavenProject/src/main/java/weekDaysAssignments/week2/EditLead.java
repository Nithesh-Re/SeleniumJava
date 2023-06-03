package weekDaysAssignments.week2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("CompanyNameField");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("FirstName");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("LastName");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("FirstName(Local)");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Department");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Description");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("NRemail@test.com");
		Select select = new Select(driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId")));
		select.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		
		
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_description")).sendKeys("new Description");
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("ImportantNote");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		System.out.println("Title of Resulting Page--> "+driver.getTitle());
		  
	}

}
