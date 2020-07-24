package stepDefnitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class peopleStepDefinition {
	
	WebDriver driver;
	
	@Given("user is on the Home Page")
	public void user_is_on_the_Home_Page() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\abhib\\Desktop\\chromedriver_win32 (7)\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://swapi.dev/");
	}
	
	@When ("title is SWAPI The Star Wars API")
	public void title_is_SWAPI_The_Star_Wars_API() {
		String title=driver.getTitle();
		Assert.assertEquals("SWAPI - The Star Wars API", title);
		
	}
	@Then("the user will input people into the search box")
	public void the_user_will_input_people_into_the_search_box() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='interactive']")).sendKeys("people/");
		
				
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
