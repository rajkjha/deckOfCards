package com.deckOfCards.deckOfCards;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources"}
        ,glue = {"com.deckOfCards.deckOfCards.imple"}
        ,plugin = {"html:target/cucumber-html-Report"}
        ,dryRun=false
        ,tags="@DrawCards"
)
public class TestRunnner {
	//test
}
