package com.cogent.hw;

import java.util.Collections;
import java.util.Vector;

public class Coding310 {
	
//   1.WAP to Print a 2D Array
	public void getPrint(int[][] mat) {
		// TODO Auto-generated method stub
		int rows = mat.length;
		int cols = mat[0].length;
		
		for(int i= 0; i < rows; i++) {
			for(int j= 0; j <cols; j++) {
				System.out.print("\t"+ mat[i][j]+ "\t");
			}
			System.out.println();
		}
		
	}
	
//   2.WAP to Add Two Matrices
	public int[][] add2Mat(int[][] mat1, int[][] mat2) {
		// TODO Auto-generated method stub
		int rows = mat1.length;
		int cols = mat1[0].length;
		
		int[][] res = new int[rows][cols];
		for(int i= 0; i < rows; i++) {
			for(int j= 0; j <cols; j++) {
				res[i][j] = mat1[i][j]+ mat2[i][j];
			}
		}
		return res;
	}
	
//   3.WAP to Sort the 2D Array Across Columns
	public void sortMat(int[][] mat){
		int rows = mat.length;
		int cols = mat[0].length;
		Vector <Integer> v = new Vector <>();
		
		for(int i= 0; i<cols; i++) {
			for(int j= 0; j<rows; j++) {
				v.add(mat[j][i]);
			}
			Collections.sort(v);
			for(int j= 0; j<rows; j++) {
				mat[j][i] = v.get(j);
			}
			v.removeAll(v);	
		}
		getPrint(mat);
	}
	
//   4.WAP to Check Whether Two Matrices Are Equal or Not
	public boolean checkEqual(int[][] mat1, int[][] mat2) {
		int rows = mat1.length;
		int cols = mat1[0].length;
		
		for(int i= 0; i < rows; i++) {
			for(int j= 0; j <cols; j++) {
				if(mat1[i][j] != mat2[i][j]) {
					return false;
				}
			}
		}
		return true;
		
	}
	
	
//   5.WAP to Find the Transpose
	public void  transportMat(int[][] mat) {
		int rows = mat.length;
		int cols = mat[0].length;
		
		int[][] transMat = new int[cols][rows];
		
		for(int i= 0; i < rows; i++) {
			for(int j= 0; j <cols; j++) {
				transMat[j][i] =mat[i][j];		
			}
		}
		getPrint(transMat);
	}
	
//   6.WAP to Find the Determinant
	public double getDet(int[][] mat, int n) {
		double det = 0;
		if ( n == 1) {
			det = mat[0][0];
		}
		else if(n == 2){
			det =  mat[0][0]*mat[1][1]-mat[0][1]*mat[1][0];
		}
		else {
			det = 0;
			for(int i= 0; i < n; i++) {
				int[][] subArr = new int[n-1][n-1];
				for(int j= 1; j <n; j++) {
					int cnt = 0;
					for(int k= 0; k <n; k++) {
						if(k!= i) {
							subArr[j-1][cnt++] = mat[j][k];
						}
					}			
				}
				double temp = mat[0][i]*getDet(subArr, n-1);
				if(((i+1+1)%2)!=0) {
					temp =(-1)*temp;
				}
				det += temp;
			}
		}
		return det;
	}
	
//   7.WAP to Find the Normal and Trace
	
	public double getNorm(int[][] mat) {
		double norm =0;
		int rows = mat.length;
		int cols = mat[0].length;
		
		for(int i= 0; i<cols; i++) {
			for(int j= 0; j<rows; j++) {
				if(i == j) {
					norm += mat[i][j]*mat[i][j];
				}
			}
		}
		return Math.sqrt(norm);
	}

	public int getTrace(int[][] mat) {
		int trace =0;
		int rows = mat.length;
		int cols = mat[0].length;
			
		for(int i= 0; i<cols; i++) {
			for(int j= 0; j<rows; j++) {
				if(i == j) {
					trace += mat[i][j];
				}
			}
		}
		return trace;
	}
//   8.WAP to Print Boundary Elements of a Matrix
	public void printBoundary(int[][] mat) {
		// TODO Auto-generated method stub
		int rows = mat.length;
		int cols = mat[0].length;
		
		for(int i= 0; i < rows; i++) {
			for(int j= 0; j <cols; j++) {
				if(i == 0 || j == 0 || i == rows-1 || j == rows -1) {
					System.out.print("\t"+ mat[i][j]+ "\t");	
				}
			}
			System.out.println();
		}
	}
	

//   9.WAP to Rotate Matrix Elements
	public void reverse(int[] row) {
		// TODO Auto-generated method stub
		int lo = 0;
		int hi = row.length-1;
		while (lo < hi) {
			int temp = row[lo];
			row[lo] = row[hi];
			row[hi] = temp;
			lo += 1;
			hi -= 1;
		}			
	}
	
	public void rotateMat(int[][] mat, int n) {
		// TODO Auto-generated method stub
		for(int i= 0; i<n; i++) {
			for(int j= i; j<n; j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		for (int[] row: mat) {
			reverse(row);
		}
		getPrint(mat);
	}
	
	
//   10.WAP to Compute the Sum of Diagonals of a Matrix
	public int diagSum(int[][] mat, int n) {
		int prip =0;
		for(int i= 0; i<n; i++) {
			for(int j= 0; j<n; j++) {
				if(i==j)
					prip += mat[i][j];
			}
		}
		return prip;
	}
	public int diagSumSecd(int[][] mat, int n) {
		int secd =0;
			
		for(int i= 0; i<n; i++) {
			for(int j= 0; j<n; j++) {
				if(i+j == n-1)
					secd += mat[i][j];
			}
		}
		return secd;
	}
//   11.WAP to Interchange Elements of First and Last in a Matrix Across Rows
	
	public void swapRows(int[][] mat) {
		// TODO Auto-generated method stub
		int rows = mat.length;
		int cols = mat[0].length;
		for(int c = 0; c <cols; c++) {
			int temp = mat[0][c];
			mat[0][c] = mat[rows-1][c];
			mat[rows-1][c] = temp;
		}
		getPrint(mat);
	}

	
//   12.WAP to Interchange Elements of First and Last in a Matrix Across Columns
	public void swapCols(int[][] mat) {
		// TODO Auto-generated method stub
		int rows = mat.length;
		int cols = mat[0].length;
		for(int r = 0; r <rows; r++) {
			int temp = mat[r][0];
			mat[r][0] = mat[r][cols-1];
			mat[r][cols-1] = temp;
		}
		getPrint(mat);
	}
}
