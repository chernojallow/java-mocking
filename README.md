# Java Problem Set: Mocking

## Rationale

Because the number of paths though production code increases exponentially with the complexity of the application, it is necessary to mock dependencies in order to test them in isolation.

While libraries like Mockito perform much of this functionality for us, developers must understand how these tools work "under the hood" in order to use them effectively.

This exercise gives students practice creating mocks without the help of automated code generation.

## Objectives

- Demonstrate knowledge of the [difference between](https://martinfowler.com/articles/mocksArentStubs.html) mocks, fakes, and spies.
- Manually create spies
- Write code that utilizes constructor injection
- Write tests that utilize spies and DI

## Background

Your assignment is to refactor the class under test to use dependency injection for handling dependencies. Then use mocks to isolate tests for the class under test.

Each package has a class under test and it's dependencies. So each package can be viewed as a separate exercise.

## Assignment

1. Choose the appropriate type of test double to allow for pure, transparent-box unit testing of the class under test
1. Write a manual test-double which mimics the behavior of the class's dependencies
1. Inject your test-double in your tests
1. Write an additonal test using Mockito instead of manually mocking

## Resources

- To complete this assignment, you will need to understand the difference between types of test double. [This article](https://martinfowler.com/articles/mocksArentStubs.html) will provide the requisite knowledge.

## Additional Resources

- [Mockito Tutorial](http://site.mockito.org/)
- [Mockito Documentation](https://static.javadoc.io/org.mockito/mockito-core/2.13.0/org/mockito/Mockito.html#1)
