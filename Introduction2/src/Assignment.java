import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\AnkuRicha\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.cleartrip.com/");
		//radio button
		driver.findElement(By.id("OneWay")).click();
		
		//Calender
		//driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.id("DepartDate")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-active")).click();
		
		//Dropdown
		Thread.sleep(2000L);
		
       Select S = new Select(driver.findElement(By.id("Adults")));
		
	    S.selectByValue("4");
	    
	    Select S1 = new Select(driver.findElement(By.id("Childrens")));
	    
	    S1.selectByValue("2");
	    
	    
	    driver.findElement(By.id("MoreOptionsLink")).click();
	    
	    Select S2 = new Select (driver.findElement(By.id("Class")));
	    
	    S2.selectByValue("Business");
	    
	    driver.findElement(By.id("AirlineAutocomplete")).sendKeys("Air India");
	    
	    
	    driver.findElement(By.id("SearchBtn")).click();
	    
	   System.out.println(driver.findElement(By.id("homeErrorMessage")).getText());
		  
	    
	    
	    
	 
	}

}
