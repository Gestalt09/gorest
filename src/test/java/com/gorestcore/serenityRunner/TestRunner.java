package com.gorestcore.serenityRunner;

import cucumber.api.CucumberOptions;
import io.restassured.RestAssured;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * Main class with the execution settings and @BeforeClass hook
 */
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = {"src/test/resources/features"},
        plugin = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"},
        glue = {"com.gorestcore.gherkinsDefinitions", "com.gorestcore.hooks"}
)
public class TestRunner {

    private TestRunner() {
    }

    /**
     * This is set up and which is executed before gherkin scenarios.
     * In the method are set all necessary values for execution.
     */
    @BeforeClass
    public static void setup() throws IOException {
        Properties prop = new Properties();
        prop.load(new FileInputStream("src/main/java/resources/data.properties"));

        RestAssured.baseURI = prop.getProperty("baseURL");
    }
}
