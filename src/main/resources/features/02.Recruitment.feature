Feature: Recruitment User

  Scenario: Rescruitment function
    When User click menu recruitment
    Then User on menu recruitment

  Scenario: Search candidates by job title
    When User select to search candidates by job title
    And User click button search
    Then User showing candidates by job title selected

  Scenario: Add candidates
    When User click button add
    And User input fullname
    And User select vacancy
    And User input email
    And User input contact number
    And User upload resume
    And User input keywords
    And User input date of application
    And User input notes
    And User checklist consent to keep data
    And User click button save
    Then User showing application stage data






