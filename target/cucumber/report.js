$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/com/qa/OrangeHR/Test/LoginTest.feature");
formatter.feature({
  "line": 1,
  "name": "login OrangeHR Application",
  "description": "",
  "id": "login-orangehr-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login to Orange HR Application",
  "description": "",
  "id": "login-orangehr-application;login-to-orange-hr-application",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I open my application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with following credentials",
  "rows": [
    {
      "cells": [
        "Admin",
        "admin123"
      ],
      "line": 7
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "Validate the landing page",
  "rows": [
    {
      "cells": [
        "OrangeHRM"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.i_open_my_application()"
});
formatter.result({
  "duration": 3427123545,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_login_with_following_credentials(DataTable)"
});
formatter.result({
  "duration": 1837969354,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.validate_the_landing_page(DataTable)"
});
formatter.result({
  "duration": 106079084,
  "status": "passed"
});
formatter.uri("src/test/java/com/qa/OrangeHR/Test/Multiplication.feature");
formatter.feature({
  "line": 1,
  "name": "Calculate the multiplication of given numbers",
  "description": "",
  "id": "calculate-the-multiplication-of-given-numbers",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "The multiplication of a list of numbers should be calculated",
  "description": "",
  "id": "calculate-the-multiplication-of-given-numbers;the-multiplication-of-a-list-of-numbers-should-be-calculated",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "a list of numbers",
  "rows": [
    {
      "cells": [
        "4"
      ],
      "line": 5
    },
    {
      "cells": [
        "5"
      ],
      "line": 6
    },
    {
      "cells": [
        "6"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I multiply them",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should get 120",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.a_list_of_numbers(DataTable)"
});
formatter.result({
  "duration": 594089,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.i_multiply_them()"
});
formatter.result({
  "duration": 83169,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "120",
      "offset": 13
    }
  ],
  "location": "StepDefinition.i_should_get(int)"
});
formatter.result({
  "duration": 1459399,
  "status": "passed"
});
});