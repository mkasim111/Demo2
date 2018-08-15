$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Practice.feature");
formatter.feature({
  "line": 2,
  "name": "Work with Practice Page",
  "description": "",
  "id": "work-with-practice-page",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tagPractice"
    }
  ]
});
formatter.before({
  "duration": 32556007624,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Work with the pactise page scenario",
  "description": "",
  "id": "work-with-practice-page;work-with-the-pactise-page-scenario",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "User navigate to practice page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "User clicks on the Login button",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User should navigate successfully to Login Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefPractice.user_navigate_to_practice_page()"
});
formatter.result({
  "duration": 9950884392,
  "status": "passed"
});
formatter.match({
  "location": "StepDefPractice.user_clicks_on_the_Login_button()"
});
formatter.result({
  "duration": 3277238871,
  "status": "passed"
});
formatter.match({
  "location": "StepDefPractice.user_should_navigate_successfully_to_Login_Page()"
});
formatter.result({
  "duration": 5116846994,
  "status": "passed"
});
formatter.after({
  "duration": 3574112635,
  "status": "passed"
});
});