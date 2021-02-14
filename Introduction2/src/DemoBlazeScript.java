import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoBlazeScript {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\AnkuRicha\\geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("https://demoblaze.com");
		
	Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div/div[1]/div/div/h4/a")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("/html/body/div[5]/div/div[2]/div[2]/div/a")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,1000);
		
		Alert alert=wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		
		driver.findElement(By.id("cartur")).click();
		
		Thread.sleep(2000);
		
		File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(srcFile, new File("cart.png"));
		
	
	Thread.sleep(2000);
		
		
		driver.close();
		
		
	}

}
