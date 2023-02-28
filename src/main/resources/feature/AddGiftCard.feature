Feature: Sales

  @tag2
  Scenario: Add Gift cards successfully
    Given User launch chrome browser
    When user open the Url"https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"
    And User enter username "admin@yourstore.com" and enter password "admin"
    And user enter login button
    Then User can view Dashboard
    And User enter Sales Icon
    And User enter Gift card Icon and Click Add new Button
    And user Enter gift card information
    And User enter save button for save information
    Then User navigate to gftcard page
    
