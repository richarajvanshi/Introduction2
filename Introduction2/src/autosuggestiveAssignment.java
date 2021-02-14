import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class autosuggestiveAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\AnkuRicha\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		// For dynamic dropdown

		driver.get("http://www.qaclickacademy.com/practice.php");

		WebElement dropdown = driver.findElement(By.id("autocomplete"));
		Thread.sleep(2000);

		String str = "Uni";
		dropdown.sendKeys(str);

		Thread.sleep(2000);
		
		 dropdown.sendKeys(Keys.DOWN);
		 
		 //javascript executor DOM
		 
		 JavascriptExecutor  Js= (JavascriptExecutor)driver;
			
			String script = "return document.getElementById(\"autocomplete\").value;";
		    String text = (String) Js.executeScript(script);
		    System.out.println(text);
		    
		 
		int i=0;
         
         while (!text.equalsIgnoreCase("United Kingdom (UK)")) 
			
         {
        	 driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.DOWN);
        	 text=(String) Js.executeScript(script);
         	
 	    	  System.out.println(text);
 	    	  if(i>10)
 	    	    {
 	    	      break;
 	    	    }

		}
		
         driver.findElement(By.xpath("//input[@id='autocomplete']")).sendKeys(Keys.ENTER);
     	
	}

}
