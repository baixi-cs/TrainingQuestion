package com.cogent.interfacedemo;
import java.util.Random;
import java.util.Arrays;

public class HW3Coding {

	//1. Find All substring of string in java Program
	public void findSubStr(String s) {
		int len = s.length();
		for (int i= 0; i < len ; i++) {
			for (int j = i+1; j <= len; j++) {
				System.out.println("Q1 sub str: " +s.substring(i,j));
			}
			
		}
	}
	
	
	public String findSubStr2(String s) {
		int len = s.length();
		String subStr = "";
		for (int i= 0; i < len ; i++) {
			for (int j = i+1; j <= len; j++) {
				subStr = subStr + s.substring(i,j);
			}	
		}
		return subStr;
		
	}
	
	
	//2. Print reverse string in java Program
	public String reverseStr(String s) {
		int len = s.length();
		String reverseStr = "";
		for (int i= len-1; i >= 0 ; i--) {
			reverseStr += s.charAt(i);
		}
		return reverseStr;
	}
	
	
	//3. Check Given No is palindrome or Not in java Program
	public boolean isPalindrome(String s) {
		for (int i= 0; i < s.length() /2 ; i++) {
			if  (s.charAt(i) != s.charAt(s.length() -1 -i)) {
				return false;
			}
		}
		return true;
	}
	
	//4. How to add two matrix in java Program
	public int[][] add2Matrix(int[][] m1, int[][] m2){
		int rows = m1.length;
		int cols = m1[0].length;
		int[][] res = new int[rows][cols];
		for (int i= 0; i < rows; i++) {
			for (int j= 0; j < cols; j++) {
				res[i][j] = m1[i][j]+ m2[i][j];
			}
		}
		return res;
	}
	
	public void printMatrix(int[][] res) {
		 for (int i= 0; i < res.length ; i++) {
				for (int j= 0; j < res[0].length; j++) {
					System.out.print( " " + res[i][j]+ " ");
				}
				System.out.println();
		}
	}

	//5. How to multiply two matrix in java Program
	public void multiply2Matrix(int[][] m1, int[][] m2){
		int rows1 = m1.length; //2
		int cols1 = m1[0].length; //3
		int rows2 = m2.length; //3
		int cols2 = m2[0].length; //2
		
		int[][] res = new int[rows1][cols2];
		
		for (int i= 0; i < rows1; i++) {
			for (int j= 0; j < cols2; j++) {
				for (int k= 0; k < rows2; k++) {
					res[i][j] += m1[i][k]+ m2[k][j];
				}
			}
		}
		printMatrix(res);
	}
	
	
	//6. How to replace string with another string in java Program
	public String replaceStr (String orig, String searchStr,  String rep) {
		String newStr = orig.replace(searchStr, rep);
		return newStr;
	}
	
	//7. How to Generate random number in java Program
	public int randNum(int low, int high) {
		Random r = new Random();
		int randNum = r.nextInt(high -low +1)+ low;
		return randNum;
	}
	
	//8. Binary search Program in java
	public int binarySearch(int[] arr, int target) {
		Arrays.sort(arr);
		System.out.println("after sort: " );
		for(int i: arr) {
			System.out.print( i + " " );
		}
		System.out.println();
		int left = 0;
		int right = arr.length -1;
		while(left <= right) {
			int mid = (right - left)/2 + left;
			if (arr[mid] == target) {
				return mid;
			}else if(arr[mid] > target) {
				right = mid - 1;
			}
			else {
				left = mid + 1;
			}
					
		}
		return -1;
	}
	
	//9. How to create Method Overriding program in java
	
	public void overridingMethod() {
		class Parent{
			public void show() {
				System.out.println("this is parent show method " );
			}
		}
		class Child extends Parent{
			public void show() {
				System.out.println("Q9 child show method , this is an overidding method" );
			}
		}
		Child c = new Child();
		c.show();
	}


}
