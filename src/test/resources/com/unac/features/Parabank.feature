Feature: Registro y apertura de nueva cuenta en Parabank

  Scenario: Registro de usuario y apertura de nueva cuenta
    Given I navigate to the parabank registration page "https://parabank.parasoft.com/parabank/register.htm"
    When I register with first name "John", last name "Doe", address "123 Elm St", city "Springfield", state "IL", zip code "62701", phone number "555-1234", ssn "123-45-6789", username "johndoesss", and password "password"
    When I open a new account
    Then I should see the new account in the accounts overview
