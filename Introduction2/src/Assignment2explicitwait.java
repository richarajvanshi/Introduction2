import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment2explicitwait {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\AnkuRicha\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.itgeared.com/demo/1506-ajax-loading.html");
		
		WebDriverWait w =new WebDriverWait(driver,10);
	
		driver.findElement(By.xpath("//a[contains(text(),'Click to load get data via Ajax!')]")).click();

	   w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[id='results']")));
				
	   
		System.out.println(driver.findElement(By.cssSelector("div[id='results']")).getText().trim());
	}

}
