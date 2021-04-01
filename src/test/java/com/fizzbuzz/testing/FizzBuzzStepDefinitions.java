package com.fizzbuzz.testing;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class FizzBuzzStepDefinitions {

    FizzBuzz fizzBuzz;
    String result;
    @Given("Create a FizzBuzz game")
    public void createAFizzBuzzGame() {
        fizzBuzz = new FizzBuzz();
    }

    @When("I play with number {int}")
    public void iPlayWithNumber(int number) {
        result = fizzBuzz.play(number);
    }

    @Then("I expect Fizz")
    public void iExpectFizz() {
        Assert.assertEquals("Fizz", result);
    }
}
