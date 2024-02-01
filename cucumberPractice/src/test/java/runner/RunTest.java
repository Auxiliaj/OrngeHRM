package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
//        plugin = {
//                "pretty",
//                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
//                "io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm",
//                "json:target/reports/cucumber-json-reports/json-report.json",
//                "html:target/reports/cucumber-html-reports/html-report.html"
//        },
        glue = {"stepdefinition" },
        dryRun=!true,
        monochrome = true,
        features = {"src/test/java/features"}
)
public class RunTest {

}
