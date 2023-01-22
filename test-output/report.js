$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:features/NHSBSA.feature");
formatter.feature({
  "name": "Paying for nhs costs online service.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "UK Citizen",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "I can see \"Chrome\" browser",
  "keyword": "Given "
});
formatter.match({
  "location": "stepDefinitions.steps.i_can_see_browser(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I enter the RahulShettyAcademy Practise link \"https://services.nhsbsa.nhs.uk/check-for-help-paying-nhs-costs/start\"",
  "keyword": "When "
});
formatter.match({
  "location": "stepDefinitions.steps.i_enter_the_rahul_shetty_academy_practise_link(java.lang.String)"
});
formatter.result({
  "status": "skipped"
});
});