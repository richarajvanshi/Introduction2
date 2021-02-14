import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnkuRicha\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("ankurmittal1412");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("password");
		
		driver.findElement(By.xpath("//input[@data-testid=\"royal_login_button\"]")).click();
		
		driver.findElement(By.xpath("//a href[@id=\"forgot-password-link\"]")).click();
	}

}
