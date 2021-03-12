Feature: Test Navigation for the given site

  Scenario Outline: Test if the given site is successfully navigated
    Given the url for site <url>
    Then the browser should successfully navigated to homepage

    Examples:
    				  | 					url				 |
      				| https://www.bbc.com/ |
