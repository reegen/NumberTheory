package com.partitions.generator;

import java.util.Scanner;

public class Partitions {

	public static void partition(int n) {
		partition(n, n, "");
	}

	public static void partition(int n, int max, String prefix) {
		if (n == 0) {
			System.out.println(prefix);
			// stdout.println(prefix);
			return;
		}

		for (int i = Math.min(max, n); i >= 1; i--) {
			partition(n - i, i, prefix + " " + i);
		}
	}

	public static void main(String[] args) {
		System.out.println("Unique Partitioning of a given number");
		System.out.println("Enter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// int n = Integer.parseInt(args[0]);
		partition(n);
	}

}
