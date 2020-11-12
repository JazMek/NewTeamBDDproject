$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/main/java/com/MCTallFeatures/MCT_FooterHomePG.feature");
formatter.feature({
  "name": "Footer of Home Page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "skipped"
});
formatter.step({
  "name": "User lands on MCT Home Page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.MCTstepDefenitions.MCT_FooterHomePgSD.user_lands_on_MCT_Home_Page()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "name": "verify the links at the footer are clickable",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@rachidTests"
    }
  ]
});
formatter.step({
  "name": "user scroll down to footer",
  "keyword": "Then "
});
formatter.match({
  "location": "com.MCTstepDefenitions.MCT_FooterHomePgSD.user_scroll_down_to_footer()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on View Cart link",
  "keyword": "And "
});
formatter.match({
  "location": "com.MCTstepDefenitions.MCT_FooterHomePgSD.click_on_View_Cart_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "skipped"
});
});