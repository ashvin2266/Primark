$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Search.feature");
formatter.feature({
  "line": 1,
  "name": "Search product from search Bar",
  "description": "",
  "id": "search-product-from-search-bar",
  "keyword": "Feature"
});
formatter.before({
  "duration": 6695001300,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "search a product",
  "description": "",
  "id": "search-product-from-search-bar;search-a-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I am on Home page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I verify Homepage url as \"https://www.primark.com/\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I enter search item in search bar as\"jeans\"",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I should search item page",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "I verify the search item page title is \"Search jeans | Primark UK\"",
  "keyword": "And "
});
formatter.match({
  "location": "Search_sd.iAmOnHomePage()"
});
formatter.result({
  "duration": 1734363000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "https://www.primark.com/",
      "offset": 26
    }
  ],
  "location": "Search_sd.iVerifyHomepageUrlAs(String)"
});
formatter.result({
  "duration": 47331300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "jeans",
      "offset": 37
    }
  ],
  "location": "Search_sd.iEnterSearchItemInSearchBarAs(String)"
});
formatter.result({
  "duration": 160016200,
  "status": "passed"
});
formatter.match({
  "location": "Search_sd.iShouldSearchItemPage()"
});
formatter.result({
  "duration": 672503400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Search jeans | Primark UK",
      "offset": 40
    }
  ],
  "location": "Search_sd.iVerifyTheSearchItemPageTitleIs(String)"
});
formatter.result({
  "duration": 8066000,
  "status": "passed"
});
formatter.after({
  "duration": 151900,
  "status": "passed"
});
formatter.after({
  "duration": 21100,
  "status": "passed"
});
});