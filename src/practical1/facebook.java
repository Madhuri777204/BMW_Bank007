package practical1;

import org.testng.annotations.Test;
import practice1.chromedriver;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class facebook {
	
	
	public WebDriver driver;
	
	
  @Test
  public void f() {
  }
  
  
  
  @BeforeTest
  public void beforeTest() {
	  
	    System.setProperty("webdriver.chrome.driver", "D:\\Seleniumworkspace\\chromedriver-win64\\chromedriver.exe");
		driver = new chromedriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
  }

  
  
  @AfterTest
  public void afterTest() {
  }

}
