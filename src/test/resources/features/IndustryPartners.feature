@ASU
Feature: Industry Participants - ASU Women in Computer Science Group
    The ASU Women's group needs to track number of participants from industry attending their meetings

  @minimum @pending
  Scenario: Minimum participation is met
  We have a minimum number of participants required to keep group going
    Given we require a minimum of 2 industry partners attending meetings
    When we have 2 industry partners attend the meetings
    Then we can continue having meetings and are somewhat ok with it
    And we ate lunch happily

  @less
  Scenario: Not enough partners attend
    Given we require a minimum of 2 industry partners attending meetings
    When we have 1 industry partners attend the meetings
    Then we can disband

  @more
  Scenario: More than enough partners attend
    Given we require a minimum of 2 industry partners attending meetings
    When we have 3 industry partners attend the meetings
    Then we can celebrate
