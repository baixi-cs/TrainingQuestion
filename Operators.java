package com.cogent;

public class Operators {

	public static void main(String[] args) {
		eight_op();
	}
		
		// TODO Auto-generated method s{tub
	public static void eight_op() {
		int num1 = 10;
		num1++;
		System.out.println("num1++:"+ num1 );
		
		int num2 = 20;
		System.out.println("num1*b= "+ num1*num2);	
		
		float numX = 1.0f;
		float numY = 2.0f;
		float numZ = numX < numY ?numX : numY;
		System.out.println("the min float num is: "+ numZ);
		
		num2 += num1;
		System.out.println("the sum of num1 and num2 is : "+ num2);
		
		if (num1 % 2 == 0) {
			System.out.println(num1 + " is even ");
		}
		else {
			System.out.println(num1 + " is odd ");
		}
		
		char a = 'a';
		char b = 'b';
		System.out.println(a > b);
		
		if ((num1 > num2) && (numX > numY)){
			System.out.println("The first bigger than the second one");
		}
		else {
			System.out.println("Not all the first one not bigger than the second one");
		}
			
		System.out.println(a < b | num1 % 2 == 0);
		
	

	}

}
