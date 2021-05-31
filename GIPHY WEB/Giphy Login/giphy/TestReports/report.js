$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("End2End_Test.feature");
formatter.feature({
  "line": 1,
  "name": "Login Application",
  "description": "As a user\nI want to login to the application",
  "id": "login-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 5,
  "name": "Valid user name and password",
  "description": "",
  "id": "login-application;valid-user-name-and-password",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I launch the url \"https://www.giphy.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I provide \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see the login page",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "login-application;valid-user-name-and-password;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 13,
      "id": "login-application;valid-user-name-and-password;;1"
    },
    {
      "cells": [
        "testmail@test.com",
        "Test@432"
      ],
      "line": 14,
      "id": "login-application;valid-user-name-and-password;;2"
    },
    {
      "cells": [
        "987654210",
        "Test@432"
      ],
      "line": 15,
      "id": "login-application;valid-user-name-and-password;;3"
    },
    {
      "cells": [
        "username1",
        "Test@432"
      ],
      "line": 16,
      "id": "login-application;valid-user-name-and-password;;4"
    },
    {
      "cells": [
        "mathewj1324@gmail.com",
        "0@Iwonthegame"
      ],
      "line": 17,
      "id": "login-application;valid-user-name-and-password;;5"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Valid user name and password",
  "description": "",
  "id": "login-application;valid-user-name-and-password;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I launch the url \"https://www.giphy.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I provide \"testmail@test.com\" and \"Test@432\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see the login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.giphy.com",
      "offset": 18
    }
  ],
  "location": "Steps.i_launch_the_url(String)"
});
formatter.result({
  "duration": 9900844200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "testmail@test.com",
      "offset": 11
    },
    {
      "val": "Test@432",
      "offset": 35
    }
  ],
  "location": "Steps.i_provide_and(String,String)"
});
formatter.result({
  "duration": 225141000,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_login_button()"
});
formatter.result({
  "duration": 447402700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_should_see_the_Error_message()"
});
formatter.result({
  "duration": 797130800,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Valid user name and password",
  "description": "",
  "id": "login-application;valid-user-name-and-password;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I launch the url \"https://www.giphy.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I provide \"987654210\" and \"Test@432\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see the login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.giphy.com",
      "offset": 18
    }
  ],
  "location": "Steps.i_launch_the_url(String)"
});
formatter.result({
  "duration": 7542251500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "987654210",
      "offset": 11
    },
    {
      "val": "Test@432",
      "offset": 27
    }
  ],
  "location": "Steps.i_provide_and(String,String)"
});
formatter.result({
  "duration": 228657600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_login_button()"
});
formatter.result({
  "duration": 59798600,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_should_see_the_Error_message()"
});
formatter.result({
  "duration": 772253000,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Valid user name and password",
  "description": "",
  "id": "login-application;valid-user-name-and-password;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I launch the url \"https://www.giphy.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I provide \"username1\" and \"Test@432\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see the login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.giphy.com",
      "offset": 18
    }
  ],
  "location": "Steps.i_launch_the_url(String)"
});
formatter.result({
  "duration": 7953376500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "username1",
      "offset": 11
    },
    {
      "val": "Test@432",
      "offset": 27
    }
  ],
  "location": "Steps.i_provide_and(String,String)"
});
formatter.result({
  "duration": 216627400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_login_button()"
});
formatter.result({
  "duration": 57130300,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_should_see_the_Error_message()"
});
formatter.result({
  "duration": 767346300,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Valid user name and password",
  "description": "",
  "id": "login-application;valid-user-name-and-password;;5",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 6,
  "name": "I launch the url \"https://www.giphy.com\"",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I provide \"mathewj1324@gmail.com\" and \"0@Iwonthegame\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "I should see the login page",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.giphy.com",
      "offset": 18
    }
  ],
  "location": "Steps.i_launch_the_url(String)"
});
formatter.result({
  "duration": 8069433400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mathewj1324@gmail.com",
      "offset": 11
    },
    {
      "val": "0@Iwonthegame",
      "offset": 39
    }
  ],
  "location": "Steps.i_provide_and(String,String)"
});
formatter.result({
  "duration": 348388700,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_click_on_login_button()"
});
formatter.result({
  "duration": 1814436400,
  "status": "passed"
});
formatter.match({
  "location": "Steps.i_should_see_the_Error_message()"
});
formatter.result({
  "duration": 764940400,
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat stepdefinition.Steps.i_should_see_the_Error_message(Steps.java:46)\r\n\tat ✽.Then I should see the login page(End2End_Test.feature:9)\r\n",
  "status": "failed"
});
});