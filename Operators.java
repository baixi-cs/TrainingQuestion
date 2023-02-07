package com.cogent;

public class Operators {

	public static void main(String[] args) {
		eight_op();
	}
		
		// TODO Auto-generated method s{tub
	public static void eight_op() {
		int num1 = 10; //Assignment operator
		num1++; ////Unary operator
		System.out.println("num1++:"+ num1 );
		
		int num2 = 20;
		System.out.println("num1*b= "+ num1*num2);	//Arithmetic operator
		
		float numX = 1.0f;
		float numY = 2.0f;
		float numZ = numX < numY ?numX : numY; //Ternary operator
		System.out.println("the min float num is: "+ numZ);
		
		num2 += num1;
		System.out.println("the sum of num1 and num2 is : "+ num2);
		
		if (num1 % 2 == 0) { //Relational Operator
			System.out.println(num1 + " is even ");
		}
		else {
			System.out.println(num1 + " is odd ");
		}
		
		char a = 'a';
		char b = 'b';
		System.out.println(a > b); //Relational Operator
		
		if ((num1 > num2) && (numX > numY)){//Logical Operator
			System.out.println("The first bigger than the second one");
		}
		else {
			System.out.println("Not all the first one not bigger than the second one");
		}
			
		System.out.println(a < b | num1 % 2 == 0);//Logical Operator
		
		int same = num1 ^ num2; // Bitwise operator
		
		System.out.println("same = " + same);
		
		System.out.println("---------");
		
		System.out.println("num1 = "+ num1);
		int right2 =  num1 >> 2; // Shift operator
		int left2 = num1 << 2; // Shift operator
		System.out.println("num1 shift  2 times to the right: " + right2);
		System.out.println("num1 shift  2 times to the left: " + left2);
		
		
	

		
	

	}

}
