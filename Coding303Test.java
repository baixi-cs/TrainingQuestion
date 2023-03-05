package com.cogent.hw;

import java.util.Arrays;
import java.util.HashSet;

public class Coding303Test {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
//		   1WAP to Search an Element in an Array
		int [] arr = {5,9,1,11,17,3,7};
		Coding303 ct = new Coding303();
		int res1 = ct.findEle(arr, 0);
		System.out.println("q1 search ele in array with idx = " +res1);
		int res2 = ct.findEle(arr, 5);
		System.out.println("q1 search ele in array with idx = " +res2);
		System.out.println();
		
//	        2WAP to Find the Largest Element in an Array
		int max_ele = ct.findMaxEle(arr);
		System.out.println("q2 max ele in array with idx = " + max_ele);
		System.out.println();
		
		
//	        3WAP to Sort an Array
		ct.quickSortArr(arr, 0, arr.length-1);
		System.out.print("after q3 ascend sort: ");
//		for(int i: arr) {
//			System.out.print(i + "  ");
//		}
//		System.out.println();
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
		
//	        4WAP to Sort the Elements of an Array in Descending Order
		int [] arr2 = {12,2,8,6,16,4,0};
		ct.descSortArr(arr2);
		System.out.print("after q4 descend sort: ");
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		
//		
//	        5WAP to Sort the Elements of an Array in Ascending Order
		ct.mergeSortArr(arr2, 0, arr2.length -1);
		System.out.print("after q5 merge sort: ");
		System.out.println(Arrays.toString(arr2));
		System.out.println();
		
		
//	        6WAP to Remove Duplicate Elements From an Array
		int [] arr3 = {2,2,8,6,2,6,4,6,2,6,2,2,2};
		System.out.println("Before Remove Duplicate Elements: " +Arrays.toString(arr3));
		System.out.print("after q6 Remove Duplicate Elements: ");
		ct.rmvDupArr(arr3);
		System.out.println();
		
//	        7WAP to Merge Two Arrays
		int[] mergeArr = ct.merge2Arr(arr, arr2);
		System.out.println("Before Merge Two Arrays: " +Arrays.toString(arr)+" ,"+Arrays.toString(arr2));
		System.out.print("after q7 Merge Two Arrays: " );
		System.out.println(Arrays.toString(mergeArr));
		System.out.println();
		
//	        8WAP to Check if Two Arrays Are Equal or Not
		int[] arr5 = {12,2,8,6,16,4,0};
		int[] arr6 = {12,2,8,6,16,4,0};
		boolean isEqual = Arrays.equals(arr, arr2);
		boolean isEqual2 = Arrays.equals(arr5, arr6);
		System.out.println("q8 Check if Two Arrays Are Equal: " + isEqual);
		System.out.println("q8 Check if Two Arrays Are Equal: " + isEqual2);
		System.out.println();
		
//	        9WAP to Remove All Occurrences of an Element in an Array
		int[] rmvEle = ct.rmvEle(arr3, 2);
		System.out.println("Before remove the specific ele: " +Arrays.toString(arr3));
		System.out.print("after q9 remove the specific ele:");
		System.out.println(Arrays.toString(rmvEle));
		System.out.println();
		
//	        10WAP to Find Common Array Elements
		
		System.out.println("Before Find Common Array Elements: " +Arrays.toString(arr3));
		System.out.print("after q10 Find Common Array Elements:" );
		ct.findCommEle(arr3);
		System.out.println();
		
	
		System.out.println("Before Find Common Array Elements2: " +Arrays.toString(arr3) +" ,"+Arrays.toString(arr2));
		System.out.print("after q10 Find Common Array Elements2:" );
		ct.find2ArrCommEle(arr3, arr2);
		
		
		HashSet <Integer> resSet = ct.find2ArrCommEleSet(arr3, arr2);
		System.out.println("set: "+ resSet);
		System.out.println();
		
		
//	        11WAP to Copy All the Elements of One Array to Another Array
		
		int[] copy= ct.copyEle(arr6);
		System.out.println("q11 Copy All the Elements of One Array: "+ Arrays.toString(copy));
		System.out.println();
		
//	        12WAP For Array Rotation
		int[] arr7 = {12,2,8,6,16,4,0};
		ct.rotateEleLeft(arr7, 3);
		System.out.println();
		
		int [] arr9 = {5,9,1,11,17,3,7};
		ct.rotateEleRight(arr9, 3);
		System.out.println();

	}

}
