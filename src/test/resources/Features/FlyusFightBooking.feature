Feature: Feature containing flyus fight booking page functionality

  @FlyusBooking
  Scenario Outline: Fight booking in flyus
    Given user launches chrome and navigates to url
    When user enters "<Source>" and "<Destination>" and click search
    When user selects the flight
    When users enters below passenger info
      | firstname   | lastname   | opional    | Gender   | dob   |
      | <FirstName> | <LastName> | <Optional> | <gender> | <Dob> |
    # | jothimani   | b          | Ms.        | F      | 12/06/1967 |
    # | ammu        | s          | Dr.        | M      | 14/09/1974 |
    When user selects seat
    Then print the price

    Examples: 
      | Source                                            | Destination                              | FirstName | LastName | Optional | gender | Dob        |
      | New York City, United States - All Airports (NYC) | Sanliurfa, Turkey - Sanliurfa (SFQ)      | joo       | p        | Ms.      | F      | 12/06/1967 |
      | New York City, United States - All Airports (NYC) | Sylhet, Bangladesh - Civil Airport (ZYL) | ammu      | s        | Dr.      | M      | 14/09/1974 |
