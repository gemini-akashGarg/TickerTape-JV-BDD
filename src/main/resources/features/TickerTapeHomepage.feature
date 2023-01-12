Feature: TickerTapeHomepage

  Scenario Outline:Launch Tickertape and search for Wipro
    Given Search Stock in the search box <Stock>
    Then Verify If its Stock Type
    Then Click on It
    Then if pop up appear close it
    Then Show the analytic for one day
    Then Show the analytic for one Week
    Then Show the analytic for one Month
    Then Show the analytic for one year
    Then Show the analytic for five year

    Examples:
      | Stock |
      | Wipro |

  Scenario Outline:Launch Tickertape and search for TCS
    Given Search Stock in the search box <Stock>
    Then Verify If its Stock Type
    Then Click on It
    Then if pop up appear close it
    Then Show the analytic for one day
    Then Show the analytic for one Week
    Then Show the analytic for one Month
    Then Show the analytic for one year
    Then Show the analytic for five year

    Examples:
      | Stock |
      | TCS   |