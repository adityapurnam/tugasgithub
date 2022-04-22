package com.adit.StepDefinition;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
    @CucumberOptions(
//            tags = {"Chat"},
            features = {"classpath:features/"},
            glue = {"classpath:com.adit.StepDefinition"},
            plugin = {"pretty","html:target/site/cucumber-pretty","json:target/cucumber/cucumber.json"}
    )


public class RunCuTest {
}
