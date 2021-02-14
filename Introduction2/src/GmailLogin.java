import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\AnkuRicha\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
		
		driver.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("testseleniumeclipse");
		
		driver.findElement(By.cssSelector("#identifierNext > span")).click();
		
		//driver.findElement(By.xpath("//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("S1lenium");
		
	//	driver.findElement(By.cssSelector("#password > div.aCsJod.oJeWuf > div > div.Xb9hP > input")).sendKeys("S1lenium");
		
		//driver.findElement(By.name("password")).sendKeys("S1lenium");
		
		driver.findElement(By.cssSelector("#passwordNext > span")).click();
		
		
		
	   /*driver.findElement(By.xpath("//*[@id=\"gbw\"]/div/div/div[1]/div[1]/a")).click();
		
      driver.findElement(By.xpath("//div[@class='h-c-header__cta']/ul/li[2]/a")).click();
     
      System.out.println(driver.findElement(By.xpath("//div[@class='Y4dIwd']/span")).getText());*/
     
    
      //driver.findElement(By.cssSelector("#identifierId")).sendKeys("ankurmittal1412");
      
    //  driver.findElement(By.id("identifierId")).sendKeys("abcd");
      
    //  driver.findElement(By.xpath("//*[@id=\"identifierNext\"]/span")).click();
      
		
		
		
		
		
		

	}

}
