package Step_Definition;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\balra\\eclipse-workspace02\\cucumber\\src\\test\\resources\\feature\\LIME.feature"
, glue = {"Step_Definition"} ,plugin= {"pretty","junit:target/JunitReports/report.xml",
		"json:target/JSONRports/report.json",
"html:target/HtmlReports"}  )





public class runner {

}
