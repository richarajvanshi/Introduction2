import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultiWindowHandlerPrint {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\AnkuRicha\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://the-internet.herokuapp.com/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/ul/li[33]/a")).click();
		
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();

		System.out.println(driver.getTitle());
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		
	    
		Set <String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		
		String Parentid=it.next();
		String Childid=it.next();
		
		driver.switchTo().window(Childid);
		
		System.out.println(driver.findElement(By.xpath("/html/body/div/h3")).getText());
		
		driver.switchTo().window(Parentid);
		
		System.out.println(driver.findElement(By.xpath("/html/body/div[2]/div/div/h3")).getText());
		
		
		
	}

}
