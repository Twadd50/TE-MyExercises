package com.techelevator;

public class KataFizzBuzz {

	public String FizzBuzz(int number) {
		String Fizz 		= "Fizz";
		String Buzz 		= "Buzz";
		String FizzBuzz		= "FizzBuzz";
		// TODO Auto-generated method stub \\\\

		if ((number % 3 == 0 && number % 5 == 0)) {
			return FizzBuzz;
		}
		if (number % 3 == 0) {
			return Fizz;
		}
		if(number % 5 == 0)  {
			return Buzz;
		}
		else return Integer.toString(number);
			
	}

}
