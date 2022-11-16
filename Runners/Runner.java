package Runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features/barrigalogin.feature",
				 plugin = "pretty",
				 tags = {""},
				 snippets = SnippetType.CAMELCASE,
				 monochrome = true)
public class Runner {
	
}
