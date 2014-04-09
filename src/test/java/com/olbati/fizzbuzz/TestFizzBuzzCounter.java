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

}