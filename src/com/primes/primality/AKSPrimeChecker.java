package com.primes.primality;

// public class AKSPrimeChecker {

/* This is the main class which reads numbers from file and calls miller-rabin or AKS
 * The aim of this project is to implement a very widely studied problem of Mathematics 
 * – primality testing – as efficiently as possible. In saying so, our main focus is to 
 * successfully implement a breakthrough achieved in 2002 by Agrawal, Kayal and Saxena 
 * (AKS) who came up with the first published primality proving algorithm to be simulta-
 * ously general polynomial, deterministic and unconditional
 *
/***************************************************************************
 * Team 
 **************
 * Arijit Banerjee
 * Suchit Maindola
 * Srikanth Manikarnike
 *
 **************
 */
import java.math.BigInteger;

public class AKSPrimeChecker
{
	
    //main
    public static void main(String[] args)
    {
    	BigInteger num = new BigInteger("9941");
    	AKS bp = new AKS(num);
    	//AKS_Thread bp = new AKS_Thread(num);
    	System.out.println("9942 é primo?: " + new AKS_Thread(BigInteger.valueOf(9942)).isPrime()); 
    }
}



/***************************************************************************
 * Refernences
 *************
 * [1] - http://en.wikipedia.org/wiki/Miller%E2%80%93Rabin_primality_test
 * [2] - Agrawal, Kayal and Saxena. Primes is in p. Annals of Mathematics 
 * (2004), 781— 793.
 * [3] - http://en.literateprograms.org/Miller-Rabin_primality
 * _test_(Java)
 * [4] - Abdullah Hosain, Implementation of the AKS Primality Testing 
 * Algorithm, December 2007.
 */
