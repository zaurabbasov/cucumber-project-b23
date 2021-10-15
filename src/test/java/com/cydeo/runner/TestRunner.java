package com.cydeo.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(  features = "src/test/resources/features" , //alternatively "classpath:features"
        glue = "com/cydeo/step_definitions" ,
        publish = true, // it will give you public link of your local html report
        plugin = {"pretty", "html:target/cucumber.html"  } ,
        dryRun = false
        , tags = "@bla"
)
public class TestRunner {
}
