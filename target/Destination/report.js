$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resourses/features/registration.feature");
formatter.feature({
  "line": 1,
  "name": "Registration features",
  "description": "",
  "id": "registration-features",
  "keyword": "Feature"
});
formatter.before({
  "duration": 11709778000,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "User should be able to regester successfully",
  "description": "",
  "id": "registration-features;user-should-be-able-to-regester-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@registration"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user clicks on registration button",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user enters all required registration details",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user clicks on registration-submit button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should able to see registration successful massage",
  "keyword": "Then "
});
formatter.match({
  "location": "MyStepDefs.user_is_on_homepage()"
});
formatter.result({
  "duration": 309651399,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_clicks_on_registration_button()"
});
formatter.result({
  "duration": 1120707300,
  "status": "passed"
});
formatter.match({
  "location": "MyStepDefs.user_enters_all_required_registration_details()"
});
formatter.result({
  "duration": 2510999,
  "error_message": "java.lang.AssertionError: You are not on Registration page expected [Register] but found [By.xpath: //h1[text()\u003d\"Register\"]]\r\n\tat org.testng.Assert.fail(Assert.java:97)\r\n\tat org.testng.Assert.assertEqualsImpl(Assert.java:136)\r\n\tat org.testng.Assert.assertEquals(Assert.java:118)\r\n\tat org.example.RegisterPage.registrationPageVerification(RegisterPage.java:34)\r\n\tat org.example.MyStepDefs.user_enters_all_required_registration_details(MyStepDefs.java:27)\r\n\tat ✽.And user enters all required registration details(src/test/resourses/features/registration.feature:6)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "MyStepDefs.user_clicks_on_registration_submit_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "MyStepDefs.user_should_able_to_see_registration_successful_massage()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 30600,
  "status": "passed"
});
});