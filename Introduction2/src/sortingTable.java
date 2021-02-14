
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class sortingTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AnkuRicha\\geckodriver.exe");

		WebDriver driver = new FirefoxDriver();

		driver.get("https://www.rahulshettyacademy.com/seleniumPractise/#/offers");

		/*
		 * driver.findElement(By.cssSelector( "#sortableTable > thead:nth-child(1) >
		 * tr:nth-child(1) > th:nth-child(2) > b:nth-child(1)")).click();
		 * 
		 * driver.findElement(By.cssSelector( "#sortableTable > thead:nth-child(1) >
		 * tr:nth-child(1) > th:nth-child(2) > b:nth-child(1)")).click();
		 */

		List<WebElement> firstColumn = driver.findElements(By.cssSelector("tr td:nth-child(2)"));

		ArrayList<String> originalList = new ArrayList<String>();

		// -------original list

		for (int i = 0; i < firstColumn.size(); i++)

		{
			// System.out.println(firstColumn.get(i).getText());
			originalList.add(firstColumn.get(i).getText());

		}

		// -------copied list

		ArrayList<String> copiedList = new ArrayList<String>();
		for (int i = 0; i < originalList.size(); i++) {

			System.out.println(originalList.get(i));
			copiedList.add(originalList.get(i));

		}

		Collections.sort(copiedList);
		// Collections.reverse(copiedList);

		System.out.println(copiedList);

		Assert.assertTrue(originalList.equals(copiedList));
		

	}

}
