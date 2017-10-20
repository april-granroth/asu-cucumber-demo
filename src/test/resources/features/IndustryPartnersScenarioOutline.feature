@ASU-outline
Feature: Industry Participants - ASU Women in Computer Science Group
    The ASU Women's group needs to track number of participants from industry attending their meetings

  Scenario Outline: Go through different scenarios
    Given we require a minimum of 2 industry partners attending meetings
    When we have <partners> industry partners attend the meetings
    Then we can <action>

    Examples:
    |partners | action                  |
    | 1       | disband                 |
    | 2       | continue having meetings|
    | 3       | celebrate               |
