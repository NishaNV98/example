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

public class case4stu
 {
 WebDriver driver;
 
  @Given("users in login page")
  public void users_in_login_page() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Nisha\\Nisha Selenium TestNG\\Drivers\\chromedriver.exe");
	     driver=new ChromeDriver();
	     driver.get("http://10.232.237.143:443/TestMeApp/");
	     driver.manage().window().maximize();
  }




 @When("user searchs prod {string}")
  public void user_searchs_prod(String string) 
  {
    driver.findElement(By.xpath("//input[@id='myInput']")).sendKeys(string);
  }




 @Then("user clicks search button")
  public void user_clicks_search_button()
  {
    driver.findElement(By.xpath("//input[@type='submit']")).click();
  }




 @Then("clicks add to cart")
  public void clicks_add_to_cart() 
  {
    driver.findElement(By.linkText("Add to cart")).click();
  }




 @Then("login page should displayed")
  public void login_page_should_displayed()
  {
      Assert.assertEquals(driver.getTitle(), "Login");
    //  System.out.println("");
  }


}

 