package Cucumber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step_Defination {
	public WebDriver driver;
	@Given("^Login the Apllication$")
	public void login_the_Apllication() throws InterruptedException {
	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\pedde\\OneDrive\\Desktop\\Drivers\\chromedriver-win32 (1)\\chromedriver-win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    //driver.get("https://www.amazon.in/");
	    driver.get("https://login.salesforce.com/?locale=in");
	    Thread.sleep(2000);
	    driver.manage().window().maximize();
	}

	@When("user enter valid username and password")
	public void user_enter_valid_username_and_password() throws InterruptedException {
	    driver.findElement(By.id("username")).sendKeys("abcde@gmail.com");
	    Thread.sleep(2000);
	    driver.findElement(By.id("password")).sendKeys("123456789");
	}

	@Then("Click on Login Page")
	public void click_on_Login_Page() throws InterruptedException {
	    driver.findElement(By.id("Login")).click();
	    Thread.sleep(2000);
	}

	@Then("Get the appliaction Title")
	public void get_the_appliaction_Title() {
	   String data=driver.getTitle();
	   System.out.println(data);
	}
}
