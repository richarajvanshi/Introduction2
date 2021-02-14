import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class frameAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AnkuRicha\\geckodriver.exe");

		FirefoxDriver driver = new FirefoxDriver();

		driver.get("https://the-internet.herokuapp.com/");

		driver.findElement(By.xpath("//a[contains(text(),'Nested Frames')]")).click();

		// parent frame
		driver.findElement(By.xpath("/html/frameset/frame[1]"));

		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[1]")));

		// child frame

		driver.findElement(By.xpath("/html/frameset/frame[2]"));

		driver.switchTo().frame(driver.findElement(By.xpath("/html/frameset/frame[2]")));

		System.out.println(driver.findElement(By.xpath("/html/body/div")).getText());

		driver.switchTo().defaultContent();

	}

}
