$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("2HomePage.feature");
formatter.feature({
  "comments": [
    {
      "line": 1,
      "value": "#Author: your.email@your.domain.com"
    }
  ],
  "line": 3,
  "name": "Home Page Test",
  "description": "",
  "id": "home-page-test",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@HomePage"
    }
  ]
});
formatter.scenarioOutline({
  "line": 9,
  "name": "Test profile and home button",
  "description": "",
  "id": "home-page-test;test-profile-and-home-button",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 8,
      "name": "@HomePageButtonTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "\"\u003cButtons\u003e\" should be present",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "home-page-test;test-profile-and-home-button;",
  "rows": [
    {
      "cells": [
        "Buttons"
      ],
      "line": 13,
      "id": "home-page-test;test-profile-and-home-button;;1"
    },
    {
      "cells": [
        "profilelink"
      ],
      "line": 14,
      "id": "home-page-test;test-profile-and-home-button;;2"
    },
    {
      "cells": [
        "homelink"
      ],
      "line": 15,
      "id": "home-page-test;test-profile-and-home-button;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am logged in facebook with Mozilla",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Mozilla",
      "offset": 29
    }
  ],
  "location": "CommonUtil.i_am_logged_in_facebook_with(String)"
});
formatter.result({
  "duration": 16813568361,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Test profile and home button",
  "description": "",
  "id": "home-page-test;test-profile-and-home-button;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@HomePage"
    },
    {
      "line": 8,
      "name": "@HomePageButtonTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "\"profilelink\" should be present",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "profilelink",
      "offset": 1
    }
  ],
  "location": "CommonUtil.should_be_present(String)"
});
formatter.result({
  "duration": 975220689,
  "status": "passed"
});
formatter.after({
  "duration": 102637,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am logged in facebook with Mozilla",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Mozilla",
      "offset": 29
    }
  ],
  "location": "CommonUtil.i_am_logged_in_facebook_with(String)"
});
formatter.result({
  "duration": 959957397,
  "status": "passed"
});
formatter.scenario({
  "line": 15,
  "name": "Test profile and home button",
  "description": "",
  "id": "home-page-test;test-profile-and-home-button;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 2,
      "name": "@HomePage"
    },
    {
      "line": 8,
      "name": "@HomePageButtonTest"
    }
  ]
});
formatter.step({
  "line": 10,
  "name": "\"homelink\" should be present",
  "matchedColumns": [
    0
  ],
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "homelink",
      "offset": 1
    }
  ],
  "location": "CommonUtil.should_be_present(String)"
});
formatter.result({
  "duration": 133191116,
  "status": "passed"
});
formatter.after({
  "duration": 24080,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am logged in facebook with Mozilla",
  "keyword": "Given "
});
formatter.match({
  "arguments": [
    {
      "val": "Mozilla",
      "offset": 29
    }
  ],
  "location": "CommonUtil.i_am_logged_in_facebook_with(String)"
});
formatter.result({
  "duration": 76071707,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Test title",
  "description": "",
  "id": "home-page-test;test-title",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@HomePageTitleTest"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "title should be \"Google\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Google",
      "offset": 17
    }
  ],
  "location": "HomePage_Step.title_should_be(String)"
});
formatter.result({
  "duration": 18217655,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Google]\u003e but was:\u003c[(1) Facebook]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat com.facebook.stepDefination.HomePage_Step.title_should_be(HomePage_Step.java:20)\r\n\tat ✽.Then title should be \"Google\"(2HomePage.feature:19)\r\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 410081786,
  "status": "passed"
});
});