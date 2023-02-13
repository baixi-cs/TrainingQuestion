package com.cogent.hw3;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class HW3 {
	
//	DS1.3. Find Bigger number among two
	public int findBiggerNum(int num1, int num2) {
		return num1 > num2? num1: num2;
	}
//	DS1.4. Swap two number 
	public void swap2Num(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("q1.4:num1 = "+num1);
		System.out.println("q1.4:num2 = "+num2);
		
	}
	
//	DS1.5. Swap two numbers without using extra variable 
	public void swap2NumWithoutExtraVarible(int num1, int num2) {
		num1 = num1 + num2;
		num2 = num1 - num2;
		num1 = num1 - num2;
		System.out.println("q1.5:num1 = "+num1);
		System.out.println("q1.5:num2 = "+num2);
		
	}
	
	
//	DS1.6. Check number is even or odd using ternary operatsor
	public boolean checkEven(int num1) {
		return num1 % 2 == 0 ? true : false; 	
	}
//	DS1.7. Find Bigger number among three numbes
	public int findBiggest3Num(int num1, int num2, int num3) {
		int max;
		if ((num1 >= num2) && (num1 >= num3)){
			max = num1;
		}
		else if((num1 >= num2) && (num1 >= num3)) {
			max = num2;
		}
		else {
			max = num3;
		}
		return max;
	}
	
	
//	DS1.8. Find a character is vowel or consonant
	public boolean checkVowel(char c) {
		if( (c == 'a') || (c == 'e') || (c == 'i') || (c == 'o') || (c == 'u')) {
			return true;
		}else if( (c == 'A') || (c == 'E') || (c == 'I') || (c == 'O') || (c == 'U')) {
			return true;
		}else {
			return false;
		}
	}
	
//
//	Added 2 more Questions:
//
//	Q1: Write a method that accepts an array and return the second min and max number.
//	public int findMin(int[] arr) {
//		int min = arr[0];
//		for(int i = 1; i < arr.length; i++) {
//			if (arr[i] < min ) {
//				min = arr[i];
//			}
//		}
//		return min;
//		
//	}
//	public int findMax(int[] arr) {
//		int max = arr[0];
//		for(int i = 1; i < arr.length; i++) {
//			if (arr[i] > max) {
//				max = arr[i];
//			}
//		}
//		return max;
//	}
	public void sortArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					swap2Num(arr[i], arr[j]);
//					System.out.print(" "+arr[i]);
				}
			}
			
		}
		System.out.println();
		
	}
	public void findSecMinAndMax(int[] arr) {
		int secMax, secMin;
		sortArr(arr);
		int n = arr.length;
		secMax = arr[n-2];
		secMin = arr[1];
		
		System.out.println("sec min = "+secMin + "sec max = " +secMax);
	
	}
	
//
//	Q2: Write a method that accepts two string arguments and returns true if they are anagram and false if they are not. An anagram is when all the letters in one string exist in another but the order of letters does not matter.
//	Two question asked in walmart.

	public boolean checkAnagram(String s, String t) {
		if (s.length() != t.length()) {
	        return false;
	    }
	    char[] str1 = s.toCharArray();
	    char[] str2 = t.toCharArray();
	    Arrays.sort(str1);
	    Arrays.sort(str2);
	    return Arrays.equals(str1, str2);
	}
//	public List<Character> str2CharList(String s) {
//		// TODO Auto-generated method stub
//		List<Character> chars = new ArrayList<>();
//		
//		for (char ch : s.toCharArray()) {
//			chars.add(ch);
//           
//        }
//		return chars;
//	}

}
