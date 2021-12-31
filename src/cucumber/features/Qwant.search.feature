Feature: Qwant search

  Scenario: Search for "W pustyni i w puszczy" in https://www.qwant.com/
    Given Web page https://www.qwant.com/ opened in browser
    When Search phrase "W pustyni i w puszczy" entered in search input box
    And key enter pressed
    Then First 3 search results titles contain phrase "W pustyni i w puszczy"

  Scenario Outline : Search for "W pustyni i w puszczy" in https://www.qwant.com/
    Given Web page https://www.qwant.com/ opened in browser
    When Search phrase "searchPhrase" entered in search input box entered in search input box
    And key enter pressed
    Then First <result> search result titles contain phrase "<searchPhrase>"
    Examples:
    | searchPhrase        | result|
    |W pustyni i w puszczy|   3   |

