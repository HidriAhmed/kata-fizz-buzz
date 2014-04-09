package com.olbati.fizzbuzz;

public class FizzBuzzCounter {

	public String[] count() {
		String[] result = new String[101];

		for (Integer i = 0; i <= 100; i++) {
			if (i == 3) {
				result[i] = "Fizz";
			} else if ((i % 5) == 0) {
				result[i] = "Buzz";
			} else {
				result[i] = i.toString();
			}
		}

		return result;
	}
}
