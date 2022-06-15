package com.test.calculator.calculator;

import java.util.Random;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args ){
    	long startTime = System.currentTimeMillis();
    	
    	Scanner input = new Scanner(System.in);

       	for (int i = 0; i < 20; i++) {
        	int int1 = getRandomNumberInRange(4, 9);
        	int int2 = getRandomNumberInRange(3, 9);
        	
        	System.out.print(int1 + " x " + int2 + " = ");
        	int answer1 = input.nextInt();
        	
         	if (int1 * int2 != answer1) {
	    		System.out.println("Wrong answer. Correct answer is " + int1 * int2);
	    		break;
	    	}
    	}
    	input.close();
		long endTime = System.currentTimeMillis();
		long timeElapsed = endTime - startTime;
		
    	System.out.println("Time Elapsed In MilliSeconds: " + timeElapsed);
    	
    	if (timeElapsed < 8000) {
    		System.out.println("Passed");
    	}
    	else {
    		System.out.println("Failed");
    	}
    	
    	
    }
    
	public static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		
		return r.nextInt((max - min) + 1) + min;
	}
}
