package com.rk;

public class Bank1 {

	public static void main(String[] args) {
		
		
		
		ICICIBank iciciBank = new ICICIBank();

		KotMBank kotMBank = new KotMBank();
		 
		
		
		System.out.println("Print SavingInterestRate:"+ iciciBank.getSavingInterestRate());

		System.out.println("Print FixedeInterestRate:"+iciciBank.getFixedInterestRate());

		System.out.println("Print SavingInterestRate:"+kotMBank.getSavingInterestRate());

		System.out.println("Print SavingInterestRate:"+kotMBank.getFixedInterestRate());

		GeneralBank gb1 = new ICICIBank();

		GeneralBank gb2 = new KotMBank();

		System.out.println(gb1.getSavingInterestRate());

		System.out.println(gb1.getFixedInterestRate());

		System.out.println(gb2.getSavingInterestRate());

		System.out.println(gb2.getFixedInterestRate());

	}

}
