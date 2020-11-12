$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/AcademyFeatures/Academy_homePage.feature");
formatter.feature({
  "name": "autosuggestion menu dropDown",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Verify autosuggestion menu is working",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user open url and navigate to academy rahul Home page",
  "keyword": "Given "
});
formatter.match({
  "location": "AcademyStepDefenition.Academy_HomePageSD.user_open_url_and_navigate_to_academy_rahul_Home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user write the word \"fr\" at autosuggestion menu dropDown",
  "keyword": "When "
});
formatter.match({
  "location": "AcademyStepDefenition.Academy_HomePageSD.user_write_the_word_at_autosuggestion_menu_dropDown(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user can see all country suggestions list and can select the country",
  "keyword": "Then "
});
formatter.match({
  "location": "AcademyStepDefenition.Academy_HomePageSD.user_can_see_all_country_suggestions_list_and_can_select_the_country()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});