package com.deckOfCards.deckOfCards.imple;

import cucumber.api.DataTable;
import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;

import java.util.List;

public class DrawCards {

	String deckId;
	int numberOfCardsDrawn;
	RequestSpecification request = RestAssured.given();
	int remainingCards;
	Scenario scenario;
	
	@Given("^A new shuffled deck is available$")
	public void a_new_shuffled_deck_is_available()  {
			
		String url = "https://deckofcardsapi.com/api/deck/new/shuffle/?deck_count=1";		
		Response response = request.get(url);
		Assert.assertTrue(String.format("Could not reach URL : '%s', Please check URL",url),response.getStatusCode()==200);
		deckId = response.jsonPath().get("deck_id");
		scenario.write("deck id is " + deckId);

		
	}

	@When("^I retrieve cards from the deck$")
	public void i_retrieve_cards_from_the_deck(DataTable cardsToDrawTable){
	
		List<List<String>> cardsToDraw= cardsToDrawTable.raw();
		
		for(int iteration=1;iteration<cardsToDraw.size();iteration++){
			int numberOfCardsToDraw = Integer.valueOf(cardsToDraw.get(iteration).get(0));
			String url = "https://deckofcardsapi.com/api/deck/"+deckId+"/draw/?count="+numberOfCardsToDraw;
			
			Response response = request.get(url);
			Assert.assertTrue(String.format("Could not reach URL : '%s', Please check URL",url),response.getStatusCode()==200);			
			
			System.out.println("Number of cards to draw " + numberOfCardsToDraw);
			numberOfCardsDrawn = numberOfCardsDrawn + numberOfCardsToDraw;	
			
			remainingCards = Integer.valueOf(response.jsonPath().get("remaining").toString());
		}	
		
		scenario.write("Number of cards drawn is : "+numberOfCardsDrawn);
		
	}

	@Then("^the remaining cards count should be correct in deck$")
	public void the_remaining_cards_count_should_be_correct_in_deck()  {
		   
	   Assert.assertTrue("Number of remaining cards does not match", remainingCards == (52 - numberOfCardsDrawn));
	   scenario.write("Total Remaining cards " + remainingCards );
	}
	
	@Before
	public void before(Scenario scenario) {
	    this.scenario = scenario;
	}
}
