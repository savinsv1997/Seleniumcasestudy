package CaseStudy;

import java.util.concurrent.TimeUnit;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.mongodb.MapReduceCommand.OutputType;


public class OnlineShopping {
	 private static final String FileUtils = null;
	private static final boolean False = false;
	private static final boolean True = false;
	WebDriver driver;
	 ExtentHtmlReporter htmlReporter;
	 ExtentReports extent;
	 ExtentTest logger;
	 
	  @Test(priority=1)
	  public void TestRegistration() {
		  driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		  
		  driver.manage().window().maximize();
		 // driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//  driver.findElement(By.partialLinkText("SignUp")).click();
	//	  driver.findElement(By.name("userName")).sendKeys("savin111");
	//	  driver.findElement(By.id("firstName")).sendKeys("savin");
		//  driver.findElement(By.xpath("//*[@type='text']")).sendKeys("sv");
		  
		 
	 driver.findElement(By.partialLinkText("SignUp")).click();
		  driver.findElement(By.name("userName")).sendKeys("savin202");
		  driver.findElement(By.id("firstName")).sendKeys("savin");
	  driver.findElement(By.name("lastName")).sendKeys("sv");
		  driver.findElement(By.xpath("//*[@id='password']")).sendKeys("Savin123");
		  driver.findElement(By.xpath("//*[@class='form-control input-lg']")).sendKeys("Savin123");
		driver.findElement(By.xpath(("//input[@value='Male']"))).click();
		driver.findElement(By.cssSelector("input#emailAddress")).sendKeys("savinsv123@gmail.com");
		driver.findElement(By.cssSelector("input[name='mobileNumber']")).sendKeys("8150884599");
		
		driver.findElement(By.name("dob")).sendKeys("04/30/1997");
	//	Select s=new Select(wb);
	//	s.deselectByVisibleText("Aug");
		  
				//WebElement wb=driver.findElement(By.name("country"));
			//	 Select s= new Select(wb);
			//	 s.selectByIndex(1);
			driver.findElement(By.cssSelector("input[class='form-control input-lg']")).sendKeys("Gabbalagodu");
		WebElement ws=	driver.findElement(By.id("securityQuestion"));
			Select s1=new  Select(ws);
			s1.selectByIndex(1);
			driver.findElement(By.name("answer"));
			driver.findElement(By.name("Submit")).click();
			 logger = extent.createTest("TestRegistration");
		        Assert.assertTrue(true);
			
	  }
	  
	  
	  @Test(priority=2)
	  public void TestLogin() {
		  driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
		//  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		
		//Object wait;
	//	WebElement ws= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[name='userName']")));
	//	ws.sendKeys("savin113");
		  driver.findElement(By.name("userName")).sendKeys("lalitha");
		  driver.findElement(By.id("password")).sendKeys("Password123");
		  driver.findElement(By.name("Login")).click();
		  logger = extent.createTest("TestLogin");
	        Assert.assertTrue(true);
		  
		  
	  }
	  
	  @Test(priority=3)
	  public void TestCart() {
		  
		//  driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		  driver.findElement(By.id("myInput")).sendKeys("Hand bag");
		  driver.findElement(By.xpath("//*[@value='FIND DETAILS']")).click();
		  driver.findElement(By.xpath("//*[@class='btn btn-success btn-product']")).click();
		  logger = extent.createTest("TestCart");
	        Assert.assertTrue(true);
		  
		  
		  
		  
		  
/*	  driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm#");
		  WebElement search = driver.findElement(By.id("myInput"));
			Actions act1=new Actions(driver);
			 act1.keyDown(search,Keys.SHIFT).perform();
		     act1.sendKeys("w").pause(3000).sendKeys("e").pause(3000).sendKeys("a").pause(3000).sendKeys("r").perform();
		     act1.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'Summer wear')]"))).click().perform();
		  driver.findElement(By.xpath("//*[@value='FIND DETAILS']")).click();
		//  String text= driver.findElement(By.xpath("//div[contains(text(),'Summer wear']")).getText();
		//  Assert.assertTrue(text.contains("Summer wear"));
		     //Assert.assertTrue(driver.getCurrentUrl().contains("));
		     //act1.keyDown(search, Keys.SHIFT);
	  }*/
		  
	  }
	  
	  @Test(priority=4) 
	  public void TestPayment() {
		  driver.findElement(By.partialLinkText("Cart")).click();
		//  driver.get("https://lkmdemoaut.accenture.com/TestMeApp/displayCart.htm");
		  driver.findElement(By.xpath("//*[@class='btn btn-success btn-block']")).click();
		  driver.findElement(By.xpath("//*[@class='btn btn-primary btn-submit-fix']")).click(); 
		  
		  
		 driver.get("https://lkmdemoaut.accenture.com/PaymentGateway/getOrderDetails.htm");
		  driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		  driver.findElement(By.partialLinkText("CONTINUE")).click();
		  
		  driver.get("https://lkmdemoaut.accenture.com/PaymentGateway/loginhere.htm?radio=Andhra%20Bank");
		  driver.findElement(By.name("username")).sendKeys("123456");
		  driver.findElement(By.name("password")).sendKeys("Pass@456");
		  driver.findElement(By.xpath("//*[@value='LOGIN']")).click();
		  
		  driver.findElement(By.name("transpwd")).sendKeys("Trans@456");
		  driver.findElement(By.xpath("//*[@value='PayNow']")).click();
		  logger = extent.createTest("TestPayment");
	        Assert.assertTrue(True);
		  
		  
		  
	  }
	  @BeforeTest
	  public void startReportBeforeTest() {
		  htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") + "/test-output/ExtentReport/"
	                + new SimpleDateFormat("hh-mm-ss-ms-dd-MM-yyyy").format(new Date()) + ".htm");
		  
		  extent = new ExtentReports();
	        extent.attachReporter(htmlReporter);
	        extent.setSystemInfo("host Name", "GFT Selenium");
	        extent.setSystemInfo("user", "savin");

	 

	        extent.setSystemInfo("environment", "Selenium");


	        htmlReporter.config().setDocumentTitle("Test Report");
	        htmlReporter.config().setReportName("test result");
	        htmlReporter.config().setTheme(Theme.STANDARD);

	 
		  
	  }
	  @AfterTest
	  public void endReportAfterTest() {
		  extent.flush();
		  
	  }
	  @AfterMethod
	 public void getResultAfterMethod(ITestResult result)  {
		  if (result.getStatus() == ITestResult.FAILURE) {
	            logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + "Test Case Failed", ExtentColor.RED));

	 

	            logger.log(Status.FAIL,
	                    MarkupHelper.createLabel(result.getThrowable() + "Test Case Failed", ExtentColor.RED));
	        //    ScreenShot.captureScreen(driver);
	     //    File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	 

	    //      FileUtils.copyFile(src, new File("C:\\ScreenShots\\myimage" + result.getName() + ".png"));

	 

	        } else if (result.getStatus() == ITestResult.SKIP) {
	            logger.log(Status.SKIP,
	                    MarkupHelper.createLabel(result.getName() + "Test Case Skipped", ExtentColor.ORANGE));

	 

	        }

	 

	        else {

	 

	            logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is passTest", ExtentColor.GREEN));

	 

	        }

	 
		  
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