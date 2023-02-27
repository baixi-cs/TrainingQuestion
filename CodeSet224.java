package CodeSet2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;


public class CodeSet224 {
	

//	1. Remove All occurrences of given character from String?(Assume Accordingly)

	public String removeChar1(String s, char ele) {
		if (s.length() == 0 || s == null) {
			return null;
		}
		char[] charArr = s.toCharArray();//OnS1
		int idx = 0;
		for(char ch : charArr) { 
			if(ch != ele) {
				charArr[idx++] = ch;
			}
		}
//		return charArr;
		return new String(charArr, 0, idx);
	}

	
	
//	2. How to swap 2 numbers without using 3rd variable?
	public void swap2NumsWithoutExtra(int x, int y) {
		x = x + y; //5 + 19 =24
		y = x - y; //24 - 19 = 5
		x = x - y; //24 - 5 = 19
		System.out.println("q2 swap 2 numbers without using 3rd variable x: " + x + " , y: " + y);
	}
	
//	3. How to remove whitespaces from a string?
	

//	4. Check if two arrays contains same elements?
	public boolean checkDupEle(int[] arr1, int[] arr2) {
		if (arr1.length != arr2.length) {
			return false;
		}
		return Arrays.equals(arr1, arr2);	
		
	}
	
//	5. Find 3rd largest element in an integer array?
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	public int find3ele(int[] arr) {
		for(int i= 0; i < arr.length; i++) {
			for (int j = i+1; j< arr.length;j++) {
				if (arr[i] < arr[j]) {
					swap(arr, i, j);
				}
			}
		}
		for(int i : arr) { 
			System.out.print(i+", ");
		}
		System.out.println();
		return arr[2];
		
	}

//	6. How to sort HashMap by using values?
	public HashMap<String, Integer> valSortHashMap(HashMap<String, Integer> hmap) {
		// TODO Auto-generated method stub
		List<Map.Entry<String, Integer> > lmap = 
				new LinkedList <Map.Entry<String,Integer> >(hmap.entrySet());
		
		//sort the list
		Collections.sort(
				lmap, 
				(i1, i2)->i1.getValue().compareTo(i2.getValue()));
			
		
//		put data from sorted list to hashmap
		HashMap <String, Integer> storemp = new LinkedHashMap<String, Integer> ();
		for(Map.Entry<String, Integer> itemEle : lmap ) {
			storemp.put(itemEle.getKey(), itemEle.getValue());
		}
		return storemp;
		
	}
	
//
//	Question from JPMC.
//	7.  Write a java code to check balanced parentheses in an expression using stack.i) {[]}) – Invalid,
//ii) {()}[] – Valid

	public boolean checkValid(String s) {
		char[] arr = s.toCharArray();//
		Stack<Character> stack = new Stack<Character>(); 
		for(char c: arr) { //(){()[])}
			if (c == '(' || c == '{' ||c == '[') {
				stack.push(c);// )
			}
			else {
				if(stack.isEmpty() ||
                			c == ')' && stack.pop() != '(' ||
                			c == ']' && stack.pop() != '[' ||
                			c == '}' && stack.pop() != '{') { 
						return false;
                			}
				}
			}
		return stack.isEmpty();
	}
	


}


