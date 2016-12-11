Feature: Calculator Test

  Scenario Outline: Calculator Test
    Given FirstNumber <first> and SecondNumber <second>
    When I <operation> them
    Then I should get <result>

    Examples:
      | first | second | operation | result |
      | 10    | 30     | add       | 40     |
      | 20    | 40     | add       | 60     |
      | 100   | 50     | subtract  | 50     |
      | 200   | 80     | subtract  | 120    |
      | 10    | 10     | multiply  | 100    |
      | 20    | 20     | multiply  | 400    |
      | 50    | 10     | divide    | 5      |
      | 60    | 30     | divide    | 2      |