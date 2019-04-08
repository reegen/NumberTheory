package com.amicablenumbers.generator;

// public class AmicableNumbersGenerator {

public class AmicableNumbersGenerator {
	public static void main(String args[]) {
		for (int i = 2; i <= 10000; i++) {
			for (int j = i + 1; j <= 10000; j++) {
				if (facSum(i) == j && facSum(j) == i) {
					System.out.println(i + " and " + j + " are Amicable!");
				}
			}
		}
	}

	public static int facSum(int a) {
		int c = 0;
		for (int s = 1; s <= a / 2; s++) {
			if (a % s == 0) {
				c += s;
			}
		}
		return c;
	}
}