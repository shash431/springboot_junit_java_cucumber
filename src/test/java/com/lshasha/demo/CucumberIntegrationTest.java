package com.lshasha.demo;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty"},
        glue = {"com.lshasha.demo.steps"},
        features = {"src/test/resources/features"})
public class CucumberIntegrationTest extends SpringIntegrationTest{
}
