package com.math.generic;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class MyMathHelper {
	public static Set<Integer> getNPrimeNumbers(int noOfPrimes) {
		int noOfFactors;
		Set<Integer> primeFactors = new HashSet<>();

		for (int num = 1; num <= noOfPrimes; num++) {

			noOfFactors = 0;
			for (int i = 1; i <= num; i++) {

				if (num % i == 0) {
					noOfFactors++;
				}
				if (noOfFactors > 2)
					break;
			}
			if (noOfFactors == 2)
				primeFactors.add(num);
		}

		return primeFactors;
	}

	public static void getPrimeFactors(int num) {
		Set s = getNPrimeNumbers(num);
		Iterator i = s.iterator();
		int currentFactor;

		while (i.hasNext()) {
			currentFactor = (int) i.next();
			while(num%currentFactor == 0){
				System.out.print(currentFactor+"\t");
				num = num /currentFactor ;
			}
			
		}
	}
}
