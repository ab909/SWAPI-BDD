package stepDefnitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class planetStepDefinition {

	WebDriver driver;
	
	@Given("user is on the Home Page")
	public void user_is_on_the_home_page() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://swapi.dev/");
	}

	@When("title is SWAPI The Star Wars API")
	public void title_is_swapi_the_star_wars_api() {
		String title=driver.getTitle();
		Assert.assertEquals("SWAPI - The Star Wars API", title);
	}
	@Then("the user will input a specific planet into the search box")
	public void the_user_will_input_planet_into_the_search_box() {
		driver.findElement(By.xpath("//input[@id='interactive']")).sendKeys("planets/50/");
	}
	@Then("the user will click on the request button")
	public void the_user_will_click_on_the_request_button() {
		driver.findElement(By.cssSelector(".btn.btn-primary")).click();
	}
	@Then("the user can see the results")
	public void the_user_can_see_the_results() throws InterruptedException {
		Thread.sleep(2000);
		String expectedChar=driver.findElement(By.xpath("//pre[@id='interactive_output']")).getText();
		String actualChar = driver.findElement(By.xpath("//pre[@id='interactive_output']")).getText();
		Assert.assertEquals(expectedChar, actualChar);
	}
	@Then("the user closes the browser")
	public void the_user_closes_the_browser() {
	    driver.close();
	}



	
	
}
