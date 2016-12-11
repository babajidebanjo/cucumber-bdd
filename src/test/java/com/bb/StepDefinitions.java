package com.bb;

import cucumber.api.java8.En;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StepDefinitions implements En {
    private Integer firstNumber;
    private Integer secondNumber;
    private Integer result;


    public StepDefinitions(OperationStrategy operations) {
        Given("^FirstNumber (\\d+) and SecondNumber (\\d+)$", (Integer firstNumber, Integer secondNumber) -> {
            this.firstNumber = firstNumber;
            this.secondNumber = secondNumber;
        });

        When("^I (.*) them$", (String operator) -> {
            Operation operation = operations.getOperation(operator);

            result = operation.execute(firstNumber, secondNumber);
        });

        Then("^I should get (\\d+)$", (Integer result) -> assertThat(this.result, is(result)));


    }
}
