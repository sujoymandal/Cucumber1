package Runner;


import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"C:\\Users\\sujoym\\workspace\\Cucumber1"
		+ "\\src\\test\\resources\\Features"},glue={"Steps"},monochrome=true)
public class CucumberRunner {
	
}
