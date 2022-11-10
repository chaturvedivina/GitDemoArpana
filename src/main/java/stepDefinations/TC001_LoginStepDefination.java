package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_LoginStepDefination {
WebDriver driver;
	@Given("user is on home page")
	public void user_is_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Launch Rediff"); 
	   System.out.println("Launch Rediff..");
		System.setProperty("webdriver.chrome.driver", "G:\\Sel_New\\Sel@11PM(EST)\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://rediff.com/");
		driver.manage().window().maximize();
	}
	@Then("user clicks on Sign in link check title")
	public void user_clicks_on_sign_in_link_check_title() {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.println("Click on Signin");
	    driver.findElement(By.linkText("Sign in")).click();
		String title=driver.getTitle();
		System.out.println(title);
		Assert.assertEquals(title, "Rediffmail");
	}
	@When("user enter valid user name and valid password logs in")
	public void user_enter_valid_user_name_and_valid_password_logs_in() {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Enter user name and password"); 
	   
	}
	@Then("check user and display as login successful")
	public void check_user_and_display_as_login_successful() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Login Successful...");
	   driver.findElement(By.id("login1")).sendKeys("m.arpana1234");
		driver.findElement(By.id("password")).sendKeys("arpana123");
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.name("proceed")).click();
		driver.findElement(By.linkText("Logout")).click();
		//Thread.sleep(5000);
		//driver.quit();
	}
//	@Then("close")
//	public void close() {
//	    // Write code here that turns the phrase above into concrete actions
//	   System.out.println("Close Rediff");
//	   
//	}
	
	@When("user clicks on Compose check Compose page appeared")
	public void user_clicks_on_compose_check_compose_page_appeared() {
		System.out.println("Click on Compose Email");
	}
	@Then("enter valid email Subject and body click on send button")
	public void enter_valid_email_subject_and_body_click_on_send_button() {
	    System.out.println("Enter valid email, subject and body content click on Submit");
	}






}
