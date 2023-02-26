package CodeSet2;


import java.util.HashMap;
import java.util.Map;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
//		1. Remove All occurrences of given character from String?(Assume Accordingly)
		CodeSet224 cs = new CodeSet224();
		System.out.println("q1 Remove character s: " + cs.removeChar1("stringsa sdfdfaas", 's'));

		
		
//		2. How to swap 2 numbers without using 3rd variable?
		cs.swap2NumsWithoutExtra(5, 19);
//		3. How to remove whitespaces from a string?
		
		System.out.println("q3 remove whitespaces: " + cs.removeChar1("str ing  sa sdfd faa   s", ' '));
//		4. Check if two arrays contains same elements?
		
		int[] arr1 = {1,3,5,7,9};
		int[] arr2 = {2,4,6,8,10};
		int[] arr3 = {1,3,5,7,9};
		System.out.println("q4 two arrays contains same elements: " + cs.checkDupEle(arr1,arr2));
		System.out.println("q4 two arrays contains same elements: " + cs.checkDupEle(arr1,arr3));
//		5. Find 3rd largest element in an integer array?
		
		System.out.println("q5 3rd largest element: " + cs.find3ele(arr1));
		System.out.println("q5 3rd largest element: " + cs.find3ele(arr2));
//		6. How to sort HashMap by using values?
		
		//put the data to map
		HashMap <String, Integer> hmap = 
				new HashMap<String, Integer>();
		
		hmap.put("tom", 1);
		hmap.put("eric", 6);
		hmap.put("ava", 3);
		hmap.put("nathan", 15);
		hmap.put("fred", 9);
		//get result
		
		Map <String, Integer> resmap = cs.valSortHashMap(hmap);
		
		
		for(Map.Entry<String, Integer> itemEle: resmap.entrySet()) {
			System.out.println("q6 sort HashMap by using values key: " +itemEle.getKey()+ ", val: "+itemEle.getValue() );	
		}

	//
//		Question from JPMC.
//		7.  Write a java code to check balanced parentheses in an expression using stack.i) {[]}) – Invalid,
	//ii) {()}[] – Valid
		String s1 = "{()}[]";
		String s2 = "(){()[])}";
		boolean isValid1 = cs.checkValid(s1);
		boolean isValid2 = cs.checkValid(s2);
		System.out.println("q7 string is: " +s1 + ", check balanced parentheses :" + isValid1);
		System.out.println("q7 string is: " +s2 + ", check balanced parentheses :" + isValid2);
		

	}

}
