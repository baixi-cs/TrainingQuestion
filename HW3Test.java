package com.cogent.interfacedemo;

public class HW3Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HW3 hw3 = new HW3();
		String s = "hello word";
		String s2 = "racecar";
		
//		1. Find All substring of string in java Program
		hw3.findSubStr(s);
//		String subStr = hw3.findSubStr2(s);
//		System.out.println(subStr);
		
		
//		2. Print reverse string in java Program
		String reverseStr = hw3.reverseStr(s);
		System.out.println("Q2 reverse str: " + reverseStr);
		
		
//		3. Check Given No is palindrome or Not in java Program
		boolean isPalindrome = hw3.isPalindrome(s2);
		System.out.println("Q3 str: " + s2 + " isPalindrome = "+ isPalindrome);
		
		boolean isPalindrome2 = hw3.isPalindrome(s);
		System.out.println("Q3 str: " + s + " isPalindrome = "+ isPalindrome2);
		
		
//		4. How to add two matrix in java Program
		int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] b = {{10, 11, 12}, {13, 14, 15}, {16, 17, 18}};
        int[][] res = hw3.add2Matrix(a, b);
        System.out.println("Q4 add two matrix: ");
        hw3.printMatrix(res);
       
       
//		5. How to multiply two matrix in java Program
//        int[][] c = {{1,2}, {3,4}, {5,6}};
        
        System.out.println("Q5 multiply two matrix: ");
        hw3.multiply2Matrix(a, b);
        
     
//		6. How to replace string with another string in java Program
        String originStr = "i am an original string for question six.";
        String searchStr = "origin";
        String newString = hw3.replaceStr(originStr, searchStr, "REPLACE");
       
        System.out.println("Q6 New string: " + newString);
     

//		7. How to Generate random number in java Program
        int randNum = hw3.randNum(300, 1200);
        System.out.println("Q7 random number: " + randNum);
        
        
//		8. Binary search Program in java
        int[] arr = {234, -21, 89, 533, 92, 7, -88, 239};
        
        int idx = hw3.binarySearch(arr, 7);
        System.out.println("Q8 binary search 7: " + idx);
        int idx2 = hw3.binarySearch(arr, -5);
        System.out.println("Q8 binary search -5: " + idx2);
        
        
//		9. How to create Method Overriding program in java
        hw3.overridingMethod();
        
		
		
		
	}
	
}
