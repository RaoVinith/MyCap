package com.rk;

public class Pizza {

	int size;
	int price;
	String qnt;
	public Pizza(int size, int price, String qnt) {
		super();
		this.size = size;
		this.price = price;
		this.qnt = qnt;
	}
	public void displayPizza() {
		System.out.println("size: "+size);
		System.out.println("price: "+price);
		System.out.println("qnt: "+qnt);
		
	}
	
	public static void main(String[] args) {
		
		
	}
	
    
}
