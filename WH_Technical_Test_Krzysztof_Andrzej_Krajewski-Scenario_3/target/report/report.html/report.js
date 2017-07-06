$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("engpremierleague/test/placeabet.feature");
formatter.feature({
  "line": 1,
  "name": "Place a bet on English Premier League event",
  "description": "     As a WH customer,\r\n     I want the ability to place a bet on a English Premier League event",
  "id": "place-a-bet-on-english-premier-league-event",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Place a bet on English Premier League football event",
  "description": "",
  "id": "place-a-bet-on-english-premier-league-event;place-a-bet-on-english-premier-league-football-event",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "the user is on English Premier League Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he choose \"\u003cevent\u003e\" from the list",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "he bet \"\u003cbet_slip\u003e\" for the home team to Win",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "assert the odds and returns offered",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "place-a-bet-on-english-premier-league-event;place-a-bet-on-english-premier-league-football-event;",
  "rows": [
    {
      "cells": [
        "event",
        "bet_slip"
      ],
      "line": 12,
      "id": "place-a-bet-on-english-premier-league-event;place-a-bet-on-english-premier-league-football-event;;1"
    },
    {
      "cells": [
        "Arsenal v Leicester",
        "0,05"
      ],
      "line": 13,
      "id": "place-a-bet-on-english-premier-league-event;place-a-bet-on-english-premier-league-football-event;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 3121102934,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Place a bet on English Premier League football event",
  "description": "",
  "id": "place-a-bet-on-english-premier-league-event;place-a-bet-on-english-premier-league-football-event;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "the user is on English Premier League Page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "he choose \"Arsenal v Leicester\" from the list",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "he bet \"0,05\" for the home team to Win",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "assert the odds and returns offered",
  "keyword": "Then "
});
formatter.match({
  "location": "PlacABetStepDef.theUserIsOnEnglishPremierLeaguePage()"
});
formatter.result({
  "duration": 14335628086,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Arsenal v Leicester",
      "offset": 11
    }
  ],
  "location": "PlacABetStepDef.heChooseEvent(String)"
});
formatter.result({
  "duration": 3133428676,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "0,05",
      "offset": 8
    }
  ],
  "location": "PlacABetStepDef.hePlaceABet(String)"
});
formatter.result({
  "duration": 5200874269,
  "status": "passed"
});
formatter.match({
  "location": "PlacABetStepDef.assertTheOddsAndReturns()"
});
formatter.result({
  "duration": 4034107075,
  "status": "passed"
});
formatter.after({
  "duration": 119271737,
  "status": "passed"
});
});