package com.cogent.hw;

public class Coding310Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coding310 ct = new Coding310();
		int [][] arr2d = {{9,10,10,12},{11,12,13,14},{1,2,3,4},{5,6,7,8}};
		int [][] matrix = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
		int rows = matrix.length;
		
		//   1.WAP to Print a 2D Array
		System.out.println("Q1  Print a 2D Array as following:");
		ct.getPrint(arr2d);
		System.out.println("\t*******************");
		ct.getPrint(matrix);
		System.out.println("\n");
		
		//   2.WAP to Add Two Matrices
		int [][]addRes = ct.add2Mat(arr2d, matrix);
		System.out.println("Q2  Add Two Matrices as following:");
		ct.getPrint(addRes);
		System.out.println("\n");
		
		//   3.WAP to Sort the 2D Array Across Columns
		System.out.println("Q3  Sort the 2D Array Across Columns as following:");
		ct.sortMat(matrix);
		System.out.println("\t*******************");
		ct.sortMat(arr2d);
		System.out.println("\n");
		
		//   4.WAP to Check Whether Two Matrices Are Equal or Not
		boolean  isEqual = ct.checkEqual(arr2d, matrix);
		System.out.println("Q4  Two Matrices Are Equal: " + isEqual);
		System.out.println("\n");
		
		//   5.WAP to Find the Transpose
		ct.getPrint(matrix);
		System.out.println("Q5  Find the Transpose as following:");
		ct.transportMat(matrix);
		System.out.println("\n");

		
		//   6.WAP to Find the Determinant
		double det = ct.getDet(matrix, rows);
		System.out.println("Q6  Find the Determinant: " + det);
		System.out.println("\n");

		//   7.WAP to Find the Normal and Trace
		double normNum = ct.getNorm(matrix);
		int traceNum = ct.getTrace(matrix);
		System.out.println("Q7  Find the  Normal: " + normNum + ", and Trace: "+ traceNum);
		System.out.println("\n");
		
		//   8.WAP to Print Boundary Elements of a Matrix
		System.out.println("Q8  Print Boundary Elements of a Matrix as following:");
		ct.printBoundary(matrix);
		System.out.println("\n");
		
		//   9.WAP to Rotate Matrix Elements
		System.out.println("Q9  Rotate Matrix Elements:");
		ct.rotateMat(matrix, rows);
		System.out.println("\n");
		
		//   10.WAP to Compute the Sum of Diagonals of a Matrix
		int principalDiag = ct.diagSum(matrix, rows);
		int secondaryDiag = ct.diagSumSecd(matrix, rows);
		System.out.println("Q10  Sum of principa diagonals: "+principalDiag +", secondary diagonal: "+ secondaryDiag);
		System.out.println("\n");
		
		//   11.WAP to Interchange Elements of First and Last in a Matrix Across Rows
		ct.getPrint(arr2d);
		System.out.println("Q11 Swap f/l Rows as below:");
		ct.swapRows(arr2d);
		System.out.println("\n");
		
		
		//   12.WAP to Interchange Elements of First and Last in a Matrix Across Columns
		ct.getPrint(arr2d);
		System.out.println("Q12 Swap f/l cols as below:");
		ct.swapCols(arr2d);
		System.out.println("\n");
	}

	

}
