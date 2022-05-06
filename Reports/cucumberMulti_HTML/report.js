$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AdactinHotel.feature");
formatter.feature({
  "line": 1,
  "name": "Booking Hotel Via Adactin Hotel Website",
  "description": "",
  "id": "booking-hotel-via-adactin-hotel-website",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "whether Login Functionality Is Working Properly",
  "description": "",
  "id": "booking-hotel-via-adactin-hotel-website;whether-login-functionality-is-working-properly",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@home"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user Has Opened The Adaction Hotel Website",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enter username and password then click login",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 6
    },
    {
      "cells": [
        "revanshasti",
        "Riyaan"
      ],
      "line": 7
    },
    {
      "cells": [
        "revan",
        "revan@123"
      ],
      "line": 8
    },
    {
      "cells": [
        "shasti",
        "shasti@123"
      ],
      "line": 9
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "Step_Definition.user_Has_Opened_The_Adaction_Hotel_Website()"
});
formatter.result({
  "duration": 3822037478,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.the_following_user_records(DataTable)"
});
formatter.result({
  "duration": 4906164655,
  "status": "passed"
});
});