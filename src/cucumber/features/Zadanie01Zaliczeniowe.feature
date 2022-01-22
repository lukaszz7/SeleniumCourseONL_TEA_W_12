
Feature: Log in on account and add address

  Scenario Outline: Log in on the website https://mystore-testlab.coderslab.pl.
    Given Web https://mystore-testlab.coderslab.pl opened in browser
    When on the main page click on sign in
    And log in
    When on the account site click on the + Create new address
    And refill address to the account with the following data: <alias>, <address>, <city>, <postal code>, <country>, <phone>
    And click Save
    Then address on the account has been fill

    Examples:
      | alias | address | city   | postal code | country          | phone     |
      | User  | Ulica 1 | Miasto | 12-345      | United Kingdom   | 963852741 |
