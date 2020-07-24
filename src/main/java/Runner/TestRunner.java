package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\abhib\\eclipse-workspace\\SWAPI\\src\\main\\java\\features\\planets.feature",
		glue= {"stepDefinitions"}
		//format={"pretty", "html:test-output","json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"}	
		
		
		)





public class TestRunner {
	
	

}
