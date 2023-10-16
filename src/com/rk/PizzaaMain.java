package com.rk;

import java.util.Scanner;

public class PizzaaMain {

	public static void main(String[] args) {
		
		Pizzaa p1 = new Pizzaa("Small",20,3);
	    Pizzaa p2 = new Pizzaa("Small",20,3);
	    
	    if(p1.equals(p2))
	    	System.out.println("Yes Identical");
	    else
	    	System.out.println("Not identical");

	}

}
