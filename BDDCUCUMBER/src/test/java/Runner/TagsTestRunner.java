package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith (Cucumber.class)

@CucumberOptions(features="src/test/java/Features/Tags.feature",glue={"StepDefination"},
tags="@SecurityTest and @SmokeTest")


public class TagsTestRunner
{

}
