package com.bbc.runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="src/main/resources/features",
		glue= {"in.stack.glue"},
		plugin= {"html:target/cucumber-html-report.html"}
				)
public class TestRunner {

}
