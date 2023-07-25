package stepDefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC001_VerifyLogin {
	WebDriver driver;
	@Given("user is on home page")
	public void user_is_on_home_page() {
		System.out.println("Launch Rediff..");
		System.setProperty("webdriver.chrome.driver", "G:\\Selenium\\Sel@10.30AM(EST)\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.rediff.com/");
		driver.manage().window().maximize();
		
	}
	@When("user clicks on Sign in link check title")
	public void user_clicks_on_sign_in_link_check_title() {
		driver.findElement(By.linkText("Sign in")).click();
	}


	@When("user enters username and password clicks on Submit button")
	public void user_enters_username_and_password_clicks_on_submit_button() {
		System.out.println("Enter user name and Password click on Submit button");
		String title=driver.getTitle();
		//System.out.println("title="+title);
		Reporter.log("Title="+title);
		Assert.assertEquals(title, "Rediffmail");//hard assert
		System.out.println("Assert Executed...");
		driver.findElement(By.id("login1")).sendKeys("m.arpana1234");
		driver.findElement(By.id("password")).sendKeys("arpana123");
		driver.findElement(By.id("remember")).click();
		driver.findElement(By.name("proceed")).click();
	}
	@Then("Check user and if valid display successful message")
	public void check_user_and_if_valid_display_successful_message() {
		System.out.println("Login Successful..");
	}
	@Then("Logout and Close browser")
	public void logout_and_close_browser() {
		System.out.println("Logout"); 
		driver.quit();
	}



}
