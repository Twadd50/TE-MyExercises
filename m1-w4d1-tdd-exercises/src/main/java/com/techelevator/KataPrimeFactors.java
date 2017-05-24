package com.techelevator;

import java.util.ArrayList;
import java.util.List;

public class KataPrimeFactors {
	public int[] factorize(int number) {
		List<Integer> primeFactors = new ArrayList<Integer>();
		while(number > 1) {
			if(number % 2 == 0) {								//dividing by 2 takes care of half the numbers 
				primeFactors.add(2);
				number = number / 2;
			} else if(number % 3 == 0) {
				primeFactors.add(3);
				number = number / 3;
			} else {
				for(int factor = 4; factor <= number / 5; factor = factor + 2) {
					if(number % factor == 0) {
						primeFactors.add(factor);
						number = number / factor;
						break;
					}
				}
			}
		}
		int[] results = new int[primeFactors.size()];
		for(int i = 0; i < results.length; i++) {
			results[i] = primeFactors.get(i);
		}
		return results;
		}
}

