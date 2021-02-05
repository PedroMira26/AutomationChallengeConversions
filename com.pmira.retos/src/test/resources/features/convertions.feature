
#Sample Feature Definition Template
Feature:
  I want to convert units such as speed and area


  Scenario: Convert the distance beteween Medellin to Bogota in meters
    Given Im in the convertions page
    When I fill out the field from with the value 416.4
    Then In the screen i see the value 416400.000000 in meters
    
  Scenario: Convert the Max speed of my motorcycle from km/h to mph
    Given Im in the convertions page
    When I fill out the from field with the value 140 for the speed
    Then the result in the screen shows 86.991967 in mph

