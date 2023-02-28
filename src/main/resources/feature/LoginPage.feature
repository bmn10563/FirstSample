Feature: login page

  @test
  Scenario Outline: validate login poage successfully
    Given User launch chrome browser
    When user open the Url"https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enter username "<email>" and enter password "<password>"
    And user enter login button
    Then the title page should be "Dashboard / nopCommerce administration"
    When user enter logout button
    Then the title page should be "Your store. Login"
    And close browser

    Examples: 
      | email               | password |
      | admin@yourstore.com | admin    |
      | admin@yourstore.com | admin123 |
      | dmin@yourstore.com  | admin    |
