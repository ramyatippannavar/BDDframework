package stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class test 
{
  WebDriver driver;
  @Before
  public void start()
  {
	  
	  System.out.println("application is starting");
  }
  
  @After
  public void ends()
  {
	  System.out.println("application closed");
  }
	@Given("^user should have un pwd$")
	public void setup()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions op=new ChromeOptions();
		op.addArguments("disable-infobars");
		driver=new ChromeDriver(op);
		
		driver.get("http://www.facebook.com");
	}
	@When("^user eneter \"(.*?)\" and \"(.*?)\"$")
	public void data(String uname,String pass)
	{
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pass);
     
	}
	
    @Then("^user should login in to application$")	
    public void teardown() throws Exception
    {
    	
      driver.findElement(By.xpath("//*[@id='u_0_b']")).click();
      Thread.sleep(1000);
    }
	
    @Then("^application should close$")
    public void application_should_close()
    {
        driver.quit();        
    }

	
	
	
}
