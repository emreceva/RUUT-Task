
@wip
Feature: Users should be able to apply

  Background:
      Given go to websites
      And homepage should be seen on window

  Scenario: User should be able to apply as "driver"
      Given click the apply button
      When click the "driver" tab
      Then check that "driver" explanation

  Scenario: User should be able to apply as "bikes"
    Given click the apply button
    When click the "bikes" tab
    Then check that "bikes" explanation

  Scenario: User should be able to apply as "advertiser"
    Given click the apply button
    When click the "advertiser" tab
    Then check that "advertiser" explanation
  Scenario: User should be able to apply as "screenInvestor"
    Given click the apply button
    When click the "screen investor" tab
    Then check that "screen investor" explanation

    Scenario Outline: User should be able to apply as "<user>"
      Given click the apply button
      When click the "<user>" tab
      Then check that "<user>" explanation

      Examples:
        |user           |
        |driver         |
        |biker          |
        |advertiser     |
        |screen investor|





