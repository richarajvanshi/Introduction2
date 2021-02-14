

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class tableAssignment {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AnkuRicha\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();

		driver.manage().deleteAllCookies();
		
		//to take screenshot
			
		File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
				
		// driver.manage().deleteCookieNamed("login");

		WebElement table = driver.findElement(By.id("product"));

		// count no. rows in the table

		Integer rowCount = driver.findElements(By.cssSelector("#product > tbody > tr")).size();

		System.out.println(rowCount);
		// count no. coulmns in the table
		Integer colCount = driver.findElements(By.cssSelector("#product > tbody > tr:nth-child(3) > td")).size();

		System.out.println(colCount);

		// get the third row data

		for (int i = 0; i < colCount; i++) {
			String strValue = driver.findElements(By.cssSelector("#product > tbody > tr:nth-child(3) > td")).get(i)
					.getText();
			System.out.println(strValue);

		}
		
		FileUtils.copyFile(Src, new File ("C://Selenium/Important notes/Screenshots.png"));
		
	}

}
