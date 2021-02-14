import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SalesForce {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnkuRicha\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("http://login.salesforce.com");
		
		//driver.findElement(By.linkText("https://login.salesforce.com/?locale=uk")).click();
		
	driver.findElement(By.id("username")).sendKeys("Testing");
	
	driver.findElement(By.name("pw")).sendKeys("TestingSalesForce");
	
//	driver.findElement( By.id("Login")).click();
	
	driver.findElement(By.xpath("//*[@id='Login']")).click();
	
	System.out.println(driver.findElement(By.cssSelector("#error")).getText());
	
	
	driver.close();
	
		
	}

}
