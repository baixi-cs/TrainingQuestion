package com.cogent.hw3;

import java.util.List;

public class HW3Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Find Solutions for following Questions and  ,Be ready with working of the solution you created.
//
//
//		DS1.3. Find Bigger number among two 
		HW3 hw3 = new HW3();
		
		int num1 = 20; 
		int num2 = 35;
		int num3 = 10;
		
		
		
		int biggerNum = hw3.findBiggerNum(num1, num2);
		System.out.println("q1.3: biggerNum = "+biggerNum);
		
//		DS1.4. Swap two number 
		hw3.swap2Num(num1, num2);
		
//		DS1.5. Swap two numbers without using extra variable 
		hw3.swap2NumWithoutExtraVarible(num1, num2);
//		DS1.6. Check number is even or odd using ternary operatsor
		boolean isEven = hw3.checkEven(num1);
		System.out.println("q1.6: num1 = "+ num1 +"is even = "+isEven);
		isEven = hw3.checkEven(num2);
		System.out.println("q1.6: num1 = "+ num2 +"is even = "+isEven);
//		DS1.7. Find Bigger number among three numbes
		int biggestNum = hw3.findBiggest3Num(num1, num2, num3);
		System.out.println("q1.7: Bigger number among three numbes =  "+ biggestNum);
		
//		DS1.8. Find a character is vowel or consonant
		boolean isVowel1 = hw3.checkVowel('c');
		boolean isVowel2 = hw3.checkVowel('Y');
		boolean isVowel3 = hw3.checkVowel('I');
		System.out.println("q1.8: character is vowel or consonant =  "+ isVowel1+isVowel2+isVowel3);
		
//
//		Added 2 more Questions:
//
//		Q1: Write a method that accepts an array and return the second min and max number.
		int [] arr = {4,8,12,5,0};
		
//		int min = hw3.findMin(arr);
//		int max = hw3.findMax(arr);
//		System.out.println("q2.1 second min and max number =  "+ min+max);
		hw3.findSecMinAndMax(arr);
//
//		Q2: Write a method that accepts two string arguments and returns true if they are anagram and false if they are not. An anagram is when all the letters in one string exist in another but the order of letters does not matter.
//		Two question asked in walmart.
		String s1 = "listen";
		String s2 = "lient";
//		List<Character> s1Arr = hw3.str2CharList(s1);
//		List<Character> s2Arr = hw3.str2CharList(s2);
		boolean isAnagram = hw3.checkAnagram(s1, s2);
		System.out.println("q2.2 two string are anagram =  "+ isAnagram);
				
//
//
//
//		Note: Upload Solution to Git Hub,Update Once Done.
//		Also be ready to explain working of the code.
		



	}

}
