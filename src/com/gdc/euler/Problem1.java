package com.gdc.euler;
/**
 * Project Euler - Problem 1
 * Problem1.java
 * Purpose: Calculates the multiples of 3 or 5
 * 
 * @author Fatos Ismali
 * @version 1.1 08/06/2011
 *
 */

public class Problem1 {
	private int sum = 0;
	private int multiplesOfThree;
	private int multiplesOfFive; 
	
	public Problem1(int multiplesOfThree, int multiplesOfFive){
		this.multiplesOfThree = multiplesOfThree;
		this.multiplesOfFive = multiplesOfFive;
	}
	
	/*
	 *  The main method for the Problem1 program
	 *  It calls the method calculateSum() and prints the amount 
	 *  of time required for the computation.
	 *  
	 *  @param no arguments used
	 */
	public static void main(String[] args){
	    Problem1 prob1 = new Problem1(3,5);
		
	    long start = System.currentTimeMillis(); 
	    
	    prob1.calculateSum();
	    
	    long elapsedTime = System.currentTimeMillis() - start;
	    
	    System.out.println("sum = " + prob1.sum + " solved in: " + elapsedTime + " miliseconds");
	}
	
	
	/*
	 *  Calculates the sum of using a brute-force approach
	 *  with heuristics to optimize and make the code more efficient
	 *  by reducing the set of numbers to only those that
	 *  are multiples of 3 or 5.
	 *  
	 *  @param no arguments used
	 */
	public void calculateSum(){
	    for(;multiplesOfThree<1000;){ // enumerate multiples of 3
	        if((multiplesOfThree % 5) == 0){}else{ // do not include multiples of 5
	             sum = sum + multiplesOfThree;
	        }
	        multiplesOfThree = multiplesOfThree + 3;
	    }
	    for(;multiplesOfFive<1000;){ // enumerate multiples of 5
	        sum = sum + multiplesOfFive;
	        multiplesOfFive = multiplesOfFive + 5;
	    }
	}
}
