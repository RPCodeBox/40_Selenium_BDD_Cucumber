package stepdefinations;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import utility.Hook;

public class AutoPractice {

	private WebDriver driver;
	
	public AutoPractice() {
		this.driver = Hook.getDriver();
	}

	@Given("^I open the new tours application$")
	public void i_open_newtours_browser() throws Throwable {
		driver.get("http://automationpractice.com/index.php?controller=my-account");
	}

	@When("^I enter valid credentials \"([^\"]*)\" and \"([^\"]*)\"$")
	public void i_validate_login_entry(String strUsername, String strPassword) throws Throwable {
		driver.findElement(By.name("email")).sendKeys(strUsername);
		driver.findElement(By.name("passwd")).sendKeys(strPassword);
		driver.findElement(By.name("SubmitLogin")).click();
	}
	
	@Then("^Welcome page is displayed$")
	public void i_validate_welcome_page() throws Throwable {
		Assert.assertTrue(driver.findElement(By.linkText("Sign out")).isDisplayed());
	}
}
