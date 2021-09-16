Feature: Test Facebook sign up page
  As a user I want to make sure I can register in Facebook

  Background:
    Given I am on Facebook sign up page

  Scenario Outline: Sign up filling all the required fields
    When I complete sign up from using <customerData>
    And I click on Register button
    Then I am registered as user

    Examples:
      | customerData |
      | completeData |

  Scenario Outline: Sign up without all the required fields
    When I complete sign up from using <customerData>
    And I click on Register button
    Then I am registered as user

    Examples:
      | customerData    |
      | userNoFirstName |
      | userNoLastName  |
      | userNoAge       |

  Scenario Outline: Sign up without optional fields
    When I complete sign up from using <customerData>
    And I click on Register button
    Then I am registered as user

    Examples:
      | customerData     |
      | userCustomGender |

  Scenario Outline: Sign up with invalid email address
    When I complete sign up form
    When I enter <email> as email address
    And I click on Register button
    Then A message alerts email is mandatory

    Examples:
      | email          |
      | test.test.com  |
      | testAttest.com |
      | test@testcom   |
      | @gmail.com     |
      | test@gmail     |

  Scenario Outline: Check links
    When I click on <link>
    Then I am redirected to <link> page

    Examples:
      | link         |
      | cookiePolicy |
      | dataPolicy   |
      | conditions   |