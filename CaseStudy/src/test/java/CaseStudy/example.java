package CaseStudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class example {
	 WebDriver driver;
	  @Test
	  public void openBrowser() {
		  driver.get("https://www.google.com");
	  }
	  @BeforeClass
	  public void beforeClass() {
		  System.setProperty("webdriver.chrome.driver", "C:\\Users\\savin\\eclipse-workspace\\CaseStudy\\src\\test\\resources\\chromedriver.exe");
		  driver=new ChromeDriver();
	  }

	  @AfterClass
	  public void afterClass() {
		 // driver.close();
	  }

	}