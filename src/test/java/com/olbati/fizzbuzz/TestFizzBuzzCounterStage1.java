package com.olbati.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestFizzBuzzCounterStage1 {

    @Test
    public void givenIndex1_shouldReturn1() {

	FizzBuzzCounterStage1 counter = new FizzBuzzCounterStage1();
	String[] result = counter.count();

	assertThat(result[1]).isEqualTo("1");

    }

    @Test
    public void givenIndex2_shouldReturn2() {

	FizzBuzzCounterStage1 counter = new FizzBuzzCounterStage1();
	String[] result = counter.count();

	assertThat(result[2]).isEqualTo("2");

    }

    @Test
    public void givenIndex3_shouldReturnFizz() {

	FizzBuzzCounterStage1 counter = new FizzBuzzCounterStage1();
	String[] result = counter.count();

	assertThat(result[3]).isEqualTo("Fizz");

    }

    @Test
    public void givenIndex4_shouldReturn4() {

	FizzBuzzCounterStage1 counter = new FizzBuzzCounterStage1();
	String[] result = counter.count();

	assertThat(result[4]).isEqualTo("4");

    }

    @Test
    public void givenIndex5_shouldReturnBuzz() {

	FizzBuzzCounterStage1 counter = new FizzBuzzCounterStage1();
	String[] result = counter.count();

	assertThat(result[5]).isEqualTo("Buzz");

    }

    @Test
    public void givenIndex32_shouldReturn32() {

	FizzBuzzCounterStage1 counter = new FizzBuzzCounterStage1();
	String[] result = counter.count();

	assertThat(result[32]).isEqualTo("32");

    }

    @Test
    public void givenIndex10_shouldReturnBuzz() {

	FizzBuzzCounterStage1 counter = new FizzBuzzCounterStage1();
	String[] result = counter.count();

	assertThat(result[10]).isEqualTo("Buzz");

    }

    @Test
    public void givenIndex6_shouldReturnFizz() {

	FizzBuzzCounterStage1 counter = new FizzBuzzCounterStage1();
	String[] result = counter.count();

	assertThat(result[6]).isEqualTo("Fizz");

    }

    @Test
    public void givenIndex15_shouldReturnFizzBuzz() {

	FizzBuzzCounterStage1 counter = new FizzBuzzCounterStage1();
	String[] result = counter.count();

	assertThat(result[15]).isEqualTo("FizzBuzz");

    }

}
