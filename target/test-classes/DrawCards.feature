Feature: NumberOfCardsRemaing
  This is for calculating numbers of cards left in the deck.
  
  @DrawCards
  Scenario: validate remaining cards count.
    Given A new shuffled deck is available
    When I retrieve cards from the deck
      |noOfCardsToDraw 	|
      | 1     			|
      | 2     			|
      | 3     			|
      | 4     			|
      | 5     			|
    Then the remaining cards count should be correct in deck