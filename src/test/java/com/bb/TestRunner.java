package com.bb;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * The cucumber test runner.
 *
 * @author Babajide Banjo
 * @since 1.0
 */
@RunWith(Cucumber.class)
@CucumberOptions(format = "json:target/cucumber.json")
public class TestRunner {

}
