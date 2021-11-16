$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("TagsFF.feature");
formatter.feature({
  "line": 2,
  "name": "Create account of FaceBook12",
  "description": "As a user you need to open facebook home  page and to the validation",
  "id": "create-account-of-facebook12",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@Important"
    }
  ]
});
formatter.scenario({
  "line": 6,
  "name": "Validate First Name field1121",
  "description": "",
  "id": "create-account-of-facebook12;validate-first-name-field1121",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 5,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 7,
  "name": "User needs to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "User clicks on button Create New Account",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "User enters user \"Donald\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "User checks user \"Donald\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsSD.userNeedsToBeOnFacebookLoginPage()"
});
formatter.result({
  "duration": 8349578100,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.userClicksOnButtonCreateNewAccount()"
});
formatter.result({
  "duration": 1141857700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Donald",
      "offset": 18
    }
  ],
  "location": "TagsSD.userEntersUserFirstName(String)"
});
formatter.result({
  "duration": 2095880300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Donald",
      "offset": 18
    }
  ],
  "location": "TagsSD.userChecksUserFirstNameIsPresent(String)"
});
formatter.result({
  "duration": 1148072200,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.closeBrowser()"
});
formatter.result({
  "duration": 1739405500,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Validate create user multiple fields2122",
  "description": "",
  "id": "create-account-of-facebook12;validate-create-user-multiple-fields2122",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 13,
      "name": "@Smoke"
    },
    {
      "line": 13,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "User needs to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "User clicks on button Create New Account",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "User enters user \"Linda\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "User enters user \"Xaba\" surname",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "User checks user \"Linda\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "User Mobile field should be blank",
  "keyword": "Then "
});
formatter.step({
  "line": 21,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsSD.userNeedsToBeOnFacebookLoginPage()"
});
formatter.result({
  "duration": 8794028700,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.userClicksOnButtonCreateNewAccount()"
});
formatter.result({
  "duration": 1178168999,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Linda",
      "offset": 18
    }
  ],
  "location": "TagsSD.userEntersUserFirstName(String)"
});
formatter.result({
  "duration": 2173289400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Xaba",
      "offset": 18
    }
  ],
  "location": "TagsSD.userEntersUserSurname(String)"
});
formatter.result({
  "duration": 1298624600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Linda",
      "offset": 18
    }
  ],
  "location": "TagsSD.userChecksUserFirstNameIsPresent(String)"
});
formatter.result({
  "duration": 1063878201,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.userMobileFieldShouldBeBlank()"
});
formatter.result({
  "duration": 1062827499,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.closeBrowser()"
});
formatter.result({
  "duration": 1876310900,
  "status": "passed"
});
formatter.scenario({
  "line": 31,
  "name": "Validate First Name field4124",
  "description": "",
  "id": "create-account-of-facebook12;validate-first-name-field4124",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 30,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 32,
  "name": "User needs to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 33,
  "name": "User clicks on button Create New Account",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "User enters user \"Donald\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 35,
  "name": "User checks user \"Donald\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 36,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsSD.userNeedsToBeOnFacebookLoginPage()"
});
formatter.result({
  "duration": 9159537900,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.userClicksOnButtonCreateNewAccount()"
});
formatter.result({
  "duration": 1210371600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Donald",
      "offset": 18
    }
  ],
  "location": "TagsSD.userEntersUserFirstName(String)"
});
formatter.result({
  "duration": 2115018099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Donald",
      "offset": 18
    }
  ],
  "location": "TagsSD.userChecksUserFirstNameIsPresent(String)"
});
formatter.result({
  "duration": 1059844100,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.closeBrowser()"
});
formatter.result({
  "duration": 1525582900,
  "status": "passed"
});
formatter.scenario({
  "line": 39,
  "name": "Validate First Name field5125",
  "description": "",
  "id": "create-account-of-facebook12;validate-first-name-field5125",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 38,
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "line": 40,
  "name": "User needs to be on Facebook login page",
  "keyword": "Given "
});
formatter.step({
  "line": 41,
  "name": "User clicks on button Create New Account",
  "keyword": "And "
});
formatter.step({
  "line": 42,
  "name": "User enters user \"Donald\" first name",
  "keyword": "When "
});
formatter.step({
  "line": 43,
  "name": "User checks user \"Donald\" first name is present",
  "keyword": "Then "
});
formatter.step({
  "line": 44,
  "name": "close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "TagsSD.userNeedsToBeOnFacebookLoginPage()"
});
formatter.result({
  "duration": 8087622800,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.userClicksOnButtonCreateNewAccount()"
});
formatter.result({
  "duration": 1153341599,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Donald",
      "offset": 18
    }
  ],
  "location": "TagsSD.userEntersUserFirstName(String)"
});
formatter.result({
  "duration": 2115017199,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Donald",
      "offset": 18
    }
  ],
  "location": "TagsSD.userChecksUserFirstNameIsPresent(String)"
});
formatter.result({
  "duration": 1102576100,
  "status": "passed"
});
formatter.match({
  "location": "TagsSD.closeBrowser()"
});
formatter.result({
  "duration": 1745827100,
  "status": "passed"
});
});