Feature: To Validate the Login Functionality of Facebook Application
  
  
  Scenario: To Validate facebook login invalid username and valid password
    Given User have to launch the facebook application through chrome browser
    When User have to enter the invalid username and valid password
      | username | java             |
      | email    | sst123@gmail.com |
      | password |           123456 |
    And User have to click the login button
    Then User have to reach invalid credential page

  Scenario: To Validate facebook login valid username and invalid password
    Given User have to launch the facebook application through chrome browser
    When User have to enter the valid username and invalid password
      | username     | email  | password |
      | javaselenium | 123445 | python   |
      | oracle       | c++    | selenium |
      | java         | manual | .net     |
    And User have to click the login button
    Then User have to reach invalid credential page
