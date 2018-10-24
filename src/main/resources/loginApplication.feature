Feature: Login to the health care application
  make an appointment for a check up

  Scenario: Login to the health care application make an appointment for the check up
    Given Login to the application using credentials 'John Doe' and 'ThisIsNotAPassword'
    When Add the details and make an appointment
    Then Check if we got booking confirmations and click Go to Homepage button