package com.olbati.fizzbuzz;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class TestFizzBuzzCounter {

	@Test
	public void givenIndex1_shouldReturn1() {

		FizzBuzzCounter counter = new FizzBuzzCounter();
		String[] result = counter.count();

		assertThat(result[1]).isEqualTo("1");

	}

	@Test
	public void givenIndex2_shouldReturn2() {

		FizzBuzzCounter counter = new FizzBuzzCounter();
		String[] result = counter.count();

		assertThat(result[2]).isEqualTo("2");

	}

	@Test
	public void givenIndex3_shouldReturnFizz() {

		FizzBuzzCounter counter = new FizzBuzzCounter();
		String[] result = counter.count();

		assertThat(result[3]).isEqualTo("Fizz");

	}

	@Test
	public void givenIndex4_shouldReturn4() {

		FizzBuzzCounter counter = new FizzBuzzCounter();
		String[] result = counter.count();

		assertThat(result[4]).isEqualTo("4");

	}

	@Test
	public void givenIndex5_shouldReturnBuzz() {

		FizzBuzzCounter counter = new FizzBuzzCounter();
		String[] result = counter.count();

		assertThat(result[5]).isEqualTo("Buzz");

	}

	@Test
	public void givenIndex32_shouldReturn32() {

		FizzBuzzCounter counter = new FizzBuzzCounter();
		String[] result = counter.count();

		assertThat(result[32]).isEqualTo("32");

	}

	@Test
	public void givenIndex10_shouldReturnBuzz() {

		FizzBuzzCounter counter = new FizzBuzzCounter();
		String[] result = counter.count();

		assertThat(result[10]).isEqualTo("Buzz");

	}

	@Test
	public void givenIndex6_shouldReturnFizz() {

		FizzBuzzCounter counter = new FizzBuzzCounter();
		String[] result = counter.count();

		assertThat(result[6]).isEqualTo("Fizz");

	}

}
