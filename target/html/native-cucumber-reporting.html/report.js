$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/resources/Features/hudlHome.feature");
formatter.feature({
  "name": "hudlHomePageTests",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User logs into hudl coach page successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@hudlTest"
    }
  ]
});
formatter.step({
  "name": "user is on Hudl login page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "clicks login",
  "keyword": "And "
});
formatter.step({
  "name": "User is shown their homepage",
  "keyword": "And "
});
formatter.step({
  "name": "user searches for \"\u003cTeam\u003e\"",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password",
        "Team"
      ]
    },
    {
      "cells": [
        "jahed04368@gmail.com",
        "Passw0rd",
        "Liverpool"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User logs into hudl coach page successfully",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@hudlTest"
    }
  ]
});
formatter.step({
  "name": "user is on Hudl login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepsDef.user_is_on_Hudl_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"jahed04368@gmail.com\" and \"Passw0rd\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginStepsDef.the_user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks login",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepsDef.clicks_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is shown their homepage",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepsDef.user_is_shown_their_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user searches for \"Liverpool\"",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepsDef.the_user_enters_and(String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "User logs into hudl coach page successfully and watches a video",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@hudlTest"
    }
  ]
});
formatter.step({
  "name": "user is on Hudl login page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "clicks login",
  "keyword": "And "
});
formatter.step({
  "name": "User is shown their homepage",
  "keyword": "And "
});
formatter.step({
  "name": "user watches a video and logs out",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "jahed04368@gmail.com",
        "Passw0rd"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User logs into hudl coach page successfully and watches a video",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@hudlTest"
    }
  ]
});
formatter.step({
  "name": "user is on Hudl login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepsDef.user_is_on_Hudl_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"jahed04368@gmail.com\" and \"Passw0rd\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginStepsDef.the_user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks login",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepsDef.clicks_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is shown their homepage",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepsDef.user_is_shown_their_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user watches a video and logs out",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepsDef.videoAndReact()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("file:src/main/resources/Features/logIn.feature");
formatter.feature({
  "name": "testfile",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "User logs into hudl coach page with invalid username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@hudlTest"
    }
  ]
});
formatter.step({
  "name": "user is on Hudl login page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters \"\u003cUsername\u003e\" and \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "clicks login",
  "keyword": "And "
});
formatter.step({
  "name": "User is shown error message",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "hudltesting@gmail.com",
        "fakePassword"
      ]
    }
  ]
});
formatter.scenario({
  "name": "User logs into hudl coach page with invalid username and password",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@hudlTest"
    }
  ]
});
formatter.step({
  "name": "user is on Hudl login page",
  "keyword": "Given "
});
formatter.match({
  "location": "loginStepsDef.user_is_on_Hudl_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters \"hudltesting@gmail.com\" and \"fakePassword\"",
  "keyword": "When "
});
formatter.match({
  "location": "loginStepsDef.the_user_enters_and(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "clicks login",
  "keyword": "And "
});
formatter.match({
  "location": "loginStepsDef.clicks_login()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is shown error message",
  "keyword": "Then "
});
formatter.match({
  "location": "loginStepsDef.error_message()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "user signs up to Hudl with a new team",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@hudlTest"
    }
  ]
});
formatter.step({
  "name": "user is on sign up page",
  "keyword": "Given "
});
formatter.match({
  "location": "signUpStepsDef.user_clicks_on_sign_up()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters about organization",
  "keyword": "And "
});
formatter.match({
  "location": "signUpStepsDef.user_enters_about_organization()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects sport",
  "keyword": "And "
});
formatter.match({
  "location": "signUpStepsDef.user_selects_sport()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user selects their package",
  "keyword": "And "
});
formatter.match({
  "location": "signUpStepsDef.user_selects_their_package()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters relevant information",
  "keyword": "And "
});
formatter.match({
  "location": "signUpStepsDef.user_enters_and()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is redirected to homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "signUpStepsDef.user_is_redirected_to_homepage()"
});
formatter.result({
  "status": "passed"
});
});