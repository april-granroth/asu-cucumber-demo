@NAU-outline

Feature: Industry Participants - NAU Women in Computer Science Group
    The NAU Women's group needs to track number of participants from industry attending their meetings

  Scenario Outline: Go through different scenarios
    Given we require a minimum of 1 industry partners attending meetings
    When we have <partners> industry partners attend the meetings
    Then we can <action>

    Examples:
    |partners | action                  |
    | 0       | disband                 |
    | 1       | continue having meetings|
    | 2       | celebrate               |
