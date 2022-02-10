package HashMapInJava;

import java.util.*;

// All Concept are Same but LinkedHashMap Keep the Insertion Order
public class HashMapDemo {
	public static void main(String[] args) {

		// Question for Implementation of Hashmap
//		Given a string s, return true if s is a good string, or false otherwise.
//		A string s is good if all the characters that appear in s have the same number 
//		of occurrences (i.e., the same frequency).

//		Input: s = "abacbc"
//		Output: true
//	    Explanation: The characters that appear in s are 'a', 'b', 
//	                 and 'c'. All characters occur 2 times in s.

//		String s = "abaabbccc";
//		Map<Character, Integer> mp = new HashMap<Character, Integer>();
		
		
//		for (int i = 0; i < s.length(); i++) 
//		{
		    //One Way
//			mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0) + 1);
		    //2nd Way
//		    if(map.containsKey(s)) map.put(s,map.get(s)+1);
//          else map.put(s,1);
//		}
//		int freq = mp.get(s.charAt(0));
//		for (Map.Entry<Character, Integer> e : mp.entrySet()) 
//		{
//			if (e.getValue() != freq)
//				System.out.println(false);
//		}
//		System.out.println(true);
		
		
		
		// Map example with Integer and ArrayList in which key is arr[i][1] and 
		// value is arr[i][0]
		
		HashMap<Integer,ArrayList<Integer>> map=new HashMap<Integer,ArrayList<Integer>>();
		int arr[][] = {{1,3},{1,4},{2,3},{2,4},{4,3}};
		for(int i=0;i<arr.length;i++)
		{
			if(map.get(arr[i][1]) == null)
			{
				map.put(arr[i][1], new ArrayList<Integer>());
				map.get(arr[i][1]).add(arr[i][0]);
			}
			else
				map.get(arr[i][1]).add(arr[i][0]);
		}
		for (Map.Entry<Integer,ArrayList<Integer>> e : map.entrySet()) 
		{
			System.out.println(e.getKey() + " " + e.getValue());
			for(int i=0;i<e.getValue().size();i++)
			{
				int x = e.getValue().get(i);
				System.out.println(x);
			}
		}
		
		
		// Leetcode question no 2103 Rings and Rods
		// Hashmap with Key = Integer , Value = HashSet<Character>
		
//		HashMap<Integer,HashSet<Character>> map=new HashMap<Integer,HashSet<Character>>();
//        for(int i=1;i< rings.length();i=i+2)
//        {
//            int rod = (int)rings.charAt(i) - '0';
//            if(map.get(rod) == null)
//			{
//				map.put(rod, new HashSet<Character>());
//				map.get(rod).add(rings.charAt(i-1));
//			}
//			else
//				map.get(rod).add(rings.charAt(i-1));
//        }
//        int res = 0;
//        for (Map.Entry<Integer,HashSet<Character>> e : map.entrySet()) 
//		{
//            if(e.getValue().size() == 3)
//                res++;
//		}
//        return res;
		

	}

}




