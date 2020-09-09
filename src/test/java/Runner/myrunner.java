package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		         features= {"F:\\ramya_selenium\\BDDframework\\src\\test\\java\\feature\\login.feature"},
                 glue= {"stepdefinition"},
                 plugin= {"html:target/cucumber-html-report",
                		   "json:target/cucumber.json",
                		   "junit:target/cucumber-results.xml"},dryRun=false       
		)
public class myrunner {

}
