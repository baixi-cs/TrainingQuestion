package com.cogent.hw;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Coding303 {
//	   1WAP to Search an Element in an Array
	
	public int findEle(int[] arr, int tar) {
		for(int i =0; i < arr.length; i++) {
			if(arr[i] == tar) {
				return i;
			}
		}
		return -1;
	}
//       2WAP to Find the Largest Element in an Array
	public int findMaxEle(int[] arr) {
		int max = arr[0];
		for(int i =1; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
	
//       3WAP to sort array
	public void babSortArr(int[] arr) { 
		for(int i =0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}	
			}
		}
	}
	
	
	public int partition(int[] arr, int left, int right) { 
		int pivotNum = arr[right];
		int i = left -1;
		for(int j =left; j < right; j++) {
			if(arr[j] < pivotNum) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		int temp = arr[i+1];
		arr[i+1] = arr[right];
		arr[right] = temp;
//		System.out.print(i + 1);
		return i + 1;
	}
	
	public void quickSortArr(int[] arr,int left, int right ) { 
		if (left < right) {
			int pivotIdx = partition(arr, left, right);
			quickSortArr(arr, left, pivotIdx -1);
			quickSortArr(arr, pivotIdx + 1, right);
		}
		
	}
	
	
//       4WAP to Sort the Elements of an Array in Descending Order
		public void descSortArr(int[] arr) {
			for(int i = 0; i < arr.length -1; i++) {
				int maxIdx = i;
				for(int j = i+1; j < arr.length; j++) {
					if(arr[j] > arr[maxIdx]) {
						maxIdx = j;
					}
				}
				int temp = arr[i];
				arr[i] = arr[maxIdx];
				arr[maxIdx] = temp;
			}
		}
			
//       5WAP to Sort the Elements of an Array in Ascending Order
		public void merge(int[] arr, int left, int mid, int right) { 
			int i = left;
			int j = mid + 1;
			int k = 0;
			int[] temp = new int[right -left +1];
			while (i <= mid && j<= right) {
				if (arr[i] < arr[j]) {
					temp[k] = arr[i];
					k += 1;
					i += 1;
				}else {
					temp[k] = arr[j];
					k += 1;
					j += 1;	
				}
					
			}
			while (i<= mid) {
				temp[k] = arr[i];
				i += 1;
				k++;
			}
			while(j<=right) {
				temp[k] = arr[j];
				k++;
				j++;
			}
			for(int p = 0; p < temp.length; p++) {
				arr[left + p] = temp[p];
			}
		}
		
		public void mergeSortArr(int[] arr,int left, int right ) { 
			if (left < right) {
				int mid = (left+right)/2;
				mergeSortArr(arr, left, mid);
				mergeSortArr(arr, mid + 1, right);
				merge(arr, left, mid, right);
			}
			
		}
		
//       6WAP to Remove Duplicate Elements From an Array
		public void rmvDupArr(int[] arr) {
			HashSet <Integer> hs = new HashSet <Integer> ();
			for(int i = 0; i < arr.length -1; i++) {
				hs.add(arr[i]);
			}
			int[] res = new int[hs.size()];
			int i = 0;
			for(Integer ele :hs) {
				res[i++] = ele;
			}
			for(int e : res) {
				System.out.print(e + "  ");		
			}System.out.println();
		}
		
//       7WAP to Merge Two Arrays
		public int[] merge2Arr(int[] arr1, int[] arr2) {
			int [] temp = new int[arr1.length +arr2.length];
			for(int i = 0; i < arr1.length; i++) {
				temp[i] = arr1[i];
			}
			for(int i = 0; i < arr2.length; i++) {
				temp[arr1.length + i] = arr2[i];
			}
			return temp;
			
		}
		
//       8WAP to Check if Two Arrays Are Equal or Not
		
//       9WAP to Remove All Occurrences of an Element in an Array
		public int[] rmvEle (int[] arr, int tar) {
			int cnt = 0; 
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] != tar){
					cnt++;
				}
			}
			int[] temp = new int[cnt];
			int j = 0;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] != tar) {
					temp[j] = arr[i];
					j++;
				}
			}
			return temp;
			
		}
//       10WAP to Find Common Array Elements
		public void findCommEle (int[] arr) {
			HashMap <Integer,Integer> hm = new HashMap<Integer,Integer> ();
			for(int c : arr) {
				if(hm.containsKey(c)) {
					hm.put(c, hm.get(c)+1);
				}
				else {
					hm.put(c, 1);
				}
			}
			
			for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
				if (entry.getValue() > 1) {
					System.out.print(entry.getKey());
				}	
			} 	
		}
		public void find2ArrCommEle (int[] arr1, int[] arr2) {
			if (arr1.length > arr2.length) {
				for(int i = 0; i < arr1.length; i++) {
					for(int j = 0; j < arr2.length; j++) {
						if (arr1[i] == arr2[j]) {
							System.out.print(arr1[i]+ " ");
							break;
						}
					}	
				}
			}
			
		}
		public HashSet <Integer>find2ArrCommEleSet (int[] arr1, int[] arr2) {
			HashSet <Integer> hset1 = new HashSet<Integer> ();
			for(int i: arr1) {
				hset1.add(i);
			}
			HashSet <Integer> commSet = new HashSet<Integer> ();
			for(int i: arr2) {
				if (hset1.contains(i)) {
					commSet.add(i);
				}
			}
			return commSet;
			
		}
		
//       11WAP to Copy All the Elements of One Array to Another Array
		public int[] copyEle (int[] arr) {
			int[] newArr = new int[arr.length] ;
			for(int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			return newArr;
		
		}
//       12WAP For Array Rotation
		public void rotateEleLeft (int[] arr, int n) {
			for (int i= 0; i < n; i++) {
				int temp = arr[0];
				for(int j = 0; j < arr.length -1; j++) {
					arr[j] = arr[j+1];
				}
				arr[arr.length -1] = temp;
			}
			System.out.println("q12  Array Rotation: ");
			for(int i: arr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

		public void rotateEleRight (int[] arr, int n) {
			for (int i= 0; i < n; i++) {
				int temp = arr[arr.length -1];
				for(int j = arr.length -1; j > 0; j--) {
					arr[j] = arr[j-1];
				}
				arr[0] = temp;
			}
			System.out.println("q12  Array Rotation: ");
			for(int i: arr) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

}
		
