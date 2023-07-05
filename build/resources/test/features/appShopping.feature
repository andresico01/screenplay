Feature: I as a user want login in the shoping app

  @SUCCESS_LOGIN
  Scenario: Login to app shopping
    When I login with me name Andres in Chile and gender Female
    Then I should see the inicial page from shop app


  @SUCCESS_SELECT_ITEAM
  Scenario: Login to app shopping
    Given The login user with me name Cesar in Colombia and gender Female
    When Select the PG 3 and ADD TO CART
    And buy the shoes
    Then Check the Cart





