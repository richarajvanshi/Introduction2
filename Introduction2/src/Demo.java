
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Selenium Code

		
		//create a driver object for chrome browser
		
		// we will strictly implement methods of webdriver
		
		/*Class name= x ,
				
				x driver= new x();*/
		
		//invoke .exe file first
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnkuRicha\\chromedriver.exe");
				
		WebDriver driver=new ChromeDriver();
		/*driver.get("http://google.com");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		
				
		//System.out.println(driver.getPageSource());
		
		driver.get("http://yahoo.com");
		

		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.close();
		
		driver.quit();*/
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("ankurmittal");
		
		driver.findElement(By.name("pass")).sendKeys("1234");
		
		//driver.findElement(By.linkText("Forgotten account?")).click();
		
		//driver.close();
		
		driver.findElement(By.cssSelector("#login_form > table > tbody > tr:nth-child(3) > td:nth-child(2) > div > a")).click();
		
		driver.findElement(By.xpath("//*[@id='u_0_2']")).click();
		driver.findElement(By.xpath("//*[@id='identify_yourself_flow']/div/div[3]/div/div[1]/a/span")).click();
		
		driver.close();
		
		//driver.findElement(By.cssSelector("#identify_yourself_flow > div > div.uiInterstitialBar.uiBoxGray.topborder > div > div.rfloat._ohf > a > span")).click();
	
		
	}

}
