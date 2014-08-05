package com.olbati.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestFizzBuzzCounterStage2 extends TestFizzBuzzCounterStage1 {

    @Test
    public void givenIndex13_shouldResturn_Fizz() {
	FizzBuzzCounterStage2 counter = new FizzBuzzCounterStage2();
	String[] result = counter.count();

	assertThat(result[13]).isEqualTo("Fizz");
    }

    @Test
    public void givenIndex52_shouldResturn_Buzz() {
	FizzBuzzCounterStage2 counter = new FizzBuzzCounterStage2();
	String[] result = counter.count();

	assertThat(result[52]).isEqualTo("Buzz");
    }

}
