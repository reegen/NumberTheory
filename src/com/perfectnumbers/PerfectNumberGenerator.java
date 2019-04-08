package com.perfectnumbers;

import java.util.*;
import java.math.BigDecimal;
import java.math.BigInteger;

// @author BotRejectsInc.

public class PerfectNumberGenerator {

	/** Creates a new instance of Main */
	public PerfectNumberGenerator() {
	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String[] args) {
		int n = 13;
		ArrayList<BigInteger> perfectSeries = findPerfects(n);
		for (BigInteger perfect : perfectSeries) {
			System.out.println(perfect);
		}
	}

	// Finds the first n perfects using LLT to obtain Mersenne primes
	private static ArrayList<BigInteger> findPerfects(int n) {
		ArrayList<BigInteger> perfects = new ArrayList<BigInteger>();
		perfects.add(new BigInteger("6"));

		int count = 1;
		int p = 1;
		while (count < n + 1) {
			if (isMersennePrime(p)) {
				count++;
				BigInteger mersenne = new BigInteger("2").pow(p).subtract(BigInteger.ONE);
				BigInteger factor = new BigInteger("2").pow(p - 1);
				BigInteger perfect = mersenne.multiply(factor);
				perfects.add(perfect);
			}
			p++;
		}

		return perfects;
	}

	// Determines whether a number is a Mersenne prime using LLT
	static boolean isMersennePrime(int p) {
		BigDecimal seriesSum = new BigDecimal(4);
		BigDecimal TWO = new BigDecimal(2);
		BigDecimal ZERO = new BigDecimal(0);

		BigDecimal mersenne = TWO.pow(p).subtract(new BigDecimal(1));
		// System.out.println("Testing " + mersenne + " with p = " + p + ": ");

		// System.out.println("0: " + seriesSum);

		for (int i = 1; i <= p - 2; i++) {
			seriesSum = seriesSum.multiply(seriesSum).subtract(TWO);
			seriesSum = seriesSum.remainder(mersenne);
			// System.out.println(i + ": " + seriesSum);
		}

		// System.out.println(seriesSum);
		if (seriesSum.compareTo(ZERO) == 0) {
			return true;
		}

		return false;
	}
}
