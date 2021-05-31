$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Giphy Login Automation",
  "description": "",
  "id": "giphy-login-automation",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Successfully Login and perform Upload Function and Pages Check",
  "description": "",
  "id": "giphy-login-automation;successfully-login-and-perform-upload-function-and-pages-check",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user clicks on Login Button",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter correct username",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "user enter correct password",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user successfully Logged in",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User clicked on upload Button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user select upload file Option",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "user performed pages check",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.userClicksOnLoginButton()"
});
formatter.result({
  "duration": 7872470100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userEnterUsername()"
});
formatter.result({
  "duration": 265506000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userEnterpassword()"
});
formatter.result({
  "duration": 436312500,
  "status": "passed"
});
formatter.match({
  "location": "Steps.userSuccessfullyLoggedIn()"
});
formatter.result({
  "duration": 1671638700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_clicked_on_upload_button()"
});
formatter.result({
  "duration": 1432694100,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_select_upload_file_option()"
});
formatter.result({
  "duration": 91518600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_performed_pages_check()"
});
formatter.result({
  "duration": 3371952400,
  "status": "passed"
});
});