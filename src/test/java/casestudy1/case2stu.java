package casestudy1;

import static org.junit.Assert.*;


import org.junit.After;
 import org.junit.Before;
 import org.junit.Test;
 import org.openqa.selenium.By;
 import org.openqa.selenium.WebDriver;
 import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
 import cucumber.api.java.en.Then;
 import cucumber.api.java.en.When;
 import junit.framework.Assert;


public class case2stu {
	WebDriver driver;
	@Given("user opens testmeapp")
	public void user_opens_testmeapp() {
		 System.setProperty("webdriver.chrome.driver","C:\\Nisha\\Nisha Selenium TestNG\\Drivers\\chromedriver.exe");
		  driver=(WebDriver) new ChromeDriver();
		  driver.get("http://google.com");
		  driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("user clicks signIn button")
	public void user_clicks_signIn_button() {
		driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	}

	@When("user Enters {string} in the user id field")
	public void user_Enters_in_the_user_id_field(String uname) {
		driver.findElement(By.id("userName")).sendKeys(uname);
	}

	@When("enters {string} in the password field")
	public void enters_in_the_password_field(String pass) {
		driver.findElement(By.id("password")).sendKeys(pass);
	}

	@When("clicks on login")
	public void clicks_on_login() {
		 driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	}

	@Then("Homepage displayed")
	public void homepage_displayed() {
		 String title=driver.getTitle();
		  Assert.assertEquals("Home", title);
	}
}
