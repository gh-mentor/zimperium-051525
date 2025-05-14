Improving the OrderProcessor Class

- Ensure that the OrderProcessor class is structured in a way that makes it easier to maintain, enhance, and test all possible branches and exceptions. Refactor the code to achieve this objective.

- To improve the code coverage and ensure that all scenarios are tested, you can use Copilot to implement the following changes and additions to the provided code:

1. Add More Granular Error Handling
Currently, the error handling is generic. Adding more specific exception types can help test different failure scenarios.

2. Refactor Deeply Nested Code
The nested if conditions in the processOrder method can be refactored into smaller helper functions. This makes the code easier to test and improves readability.

3. Add Logging or Debugging Statements
Adding logging or debugging statements can help ensure that all branches of the code are executed during testing.

4. Write Unit Tests for All Public Methods
Use the DocTest framework to write tests for all public methods, including edge cases like empty orders, invalid quantities, and null customers.

5. Add Mocking for Dependencies
If there are external dependencies (e.g., processPayment), mock them to isolate the logic in processOrder.


