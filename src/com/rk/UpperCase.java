package com.rk;

public class UpperCase {

	public static void main(String[] args) {
		
		String input = "rahul sachin vinod anil";

        String[] words = input.split(" ");

        StringBuilder result = new StringBuilder();

        for (String word : words) {

            if (word.length() > 0) {


                char firstChar = Character.toUpperCase(word.charAt(0));

                String restOfWord = word.substring(1).toLowerCase();

                String capitalizedWord = firstChar + restOfWord;

                result.append(capitalizedWord).append(" ");

            }

        }


        String capitalizedString = result.toString().trim();

        System.out.println(capitalizedString);

    }


}


