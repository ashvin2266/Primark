Feature: Search product from search Bar
  Scenario: search a product
    Given I am on Home page
    Given I verify Homepage url as "https://www.primark.com/"
    Given I enter search item in search bar as"jeans"
    Then I should search item page
    And I verify the search item page title is "Search jeans | Primark UK"