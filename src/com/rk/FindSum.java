package com.rk;


public class FindSum {

	public static void main(String[] args) {
		int sum=0;
		
		String str="20;30;40;80";
		
		String []mystr=str.split(";");
		
		for(String s:mystr) {
			int i=Integer.parseInt(s);
			    sum=sum+i;
		}
		System.out.println(sum);
	}
}

