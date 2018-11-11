$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DrawCards.feature");
formatter.feature({
  "line": 1,
  "name": "NumberOfCardsRemaing",
  "description": "This is for calculating numbers of cards left in the deck.",
  "id": "numberofcardsremaing",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2786710209,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "validate remaining cards count.",
  "description": "",
  "id": "numberofcardsremaing;validate-remaining-cards-count.",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@DrawCards"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "A new shuffled deck is available",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I retrieve cards from the deck",
  "rows": [
    {
      "cells": [
        "noOfCardsToDraw"
      ],
      "line": 8
    },
    {
      "cells": [
        "1"
      ],
      "line": 9
    },
    {
      "cells": [
        "2"
      ],
      "line": 10
    },
    {
      "cells": [
        "3"
      ],
      "line": 11
    },
    {
      "cells": [
        "4"
      ],
      "line": 12
    },
    {
      "cells": [
        "5"
      ],
      "line": 13
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the remaining cards count should be correct in deck",
  "keyword": "Then "
});
formatter.match({
  "location": "DrawCards.a_new_shuffled_deck_is_available()"
});
formatter.write("deck id is h3p9q230fg6f");
formatter.result({
  "duration": 11081066265,
  "status": "passed"
});
formatter.match({
  "location": "DrawCards.i_retrieve_cards_from_the_deck(DataTable)"
});
formatter.write("Number of cards drawn is : 15");
formatter.result({
  "duration": 3270296754,
  "status": "passed"
});
formatter.match({
  "location": "DrawCards.the_remaining_cards_count_should_be_correct_in_deck()"
});
formatter.write("Total Remaining cards 37");
formatter.result({
  "duration": 342928,
  "status": "passed"
});
});