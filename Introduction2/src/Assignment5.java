import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AnkuRicha\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("http://www.qaclickacademy.com/practice.php");

		WebElement chkBox = driver.findElement(By.id("checkBoxOption2"));
		chkBox.click();

		Assert.assertFalse(chkBox.isSelected());
		String chkVal= chkBox.getAttribute("value");

		System.out.println(chkVal);

		
		// dropdown selection

		Select s = new Select(driver.findElement(By.id("dropdown-class-example")));
		s.selectByValue(chkVal);
		
		//textbox
		driver.findElement(By.id("name")).sendKeys(chkVal);
		Thread.sleep(2000);
		
		//alert

		driver.findElement(By.id("alertbtn")).click();

		System.out.println(driver.switchTo().alert().getText());

		driver.switchTo().alert().accept();
		
	}

}
