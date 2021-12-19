Feature: Create account

Scenario: Create account on the website https://hotel-testlab.coderslab.pl/
Given Web https://hotel-testlab.coderslab.pl/ opened in browser
When click on the icon Sign Ind
And complete the registration
  And registration in the new page
Then Account has been created