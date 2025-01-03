Feature: Test Automation Rest Api

  @api
  Scenario: Test Get List data
    Given prepare url for "GET_LIST_USER"
    And hit api for get list users
    Then Validation status code is equal 200
    Then Validation response body get list users
    Then Validation response json with JSONSchema "get_list_users_normal.json"