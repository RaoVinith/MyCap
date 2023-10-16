package com.rk;

public class DigitsE1 {
	

	public static void main(String[] args) {
	

				int n = 12345;

		        String Str = Integer.toString(n);

		        int count = Str.length();

		        char[] digits = Str.toCharArray();


		        System.out.println("Digits of the number " + n + ":");

		        for (char digit : digits) {

		            System.out.print(digit + " ");

		        }

		        System.out.println("Number of digits in " + n + " is: " + count);

		    }

	}





