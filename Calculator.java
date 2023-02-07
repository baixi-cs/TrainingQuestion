package com.cogent;

public class Calculator {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int no1 = 5;
		int no2 = 6; 
		int no3 = 7;
		
		int result = getAdd(no1, no2, no3);
		System.out.println(result);
		
		

	}
	public static int getAdd(int x, int y, int z) {
		return x+y+z;
	}

}
