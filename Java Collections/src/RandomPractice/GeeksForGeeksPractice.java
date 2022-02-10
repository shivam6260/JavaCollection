package RandomPractice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GeeksForGeeksPractice {
	public static void main(String[] args) throws IOException {
		System.out.println(5);
		
		//Write a Java Program to Swap first and last character of words in a Sentence as mentioned in the example?
//		Input : geeks for geeks
//		Output :seekg rof seekg
		
		
		// 1st Approach
//		String str = "geeks for geeks";
//		char arr[] = str.toCharArray();
//		int index = 0;
//		for(int i=0;i<arr.length;i++)
//		{
//			if(arr[i] == ' ' && i != arr.length-1)
//			{
//				char temp = arr[index];
//				arr[index] = arr[i-1];
//				arr[i-1] = temp;
//				index = i+1;
//			}
//			if(i == arr.length-1)
//			{
//				char temp = arr[index];
//				arr[index] = arr[arr.length-1];
//				arr[arr.length-1] = temp;
//			}
//		}
//		String res = new String(arr);
//		System.out.println(res);
		
		
		// 2nd Approach
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        String input = br.readLine();
//        String output="";
//        String[] inputArr = input.split(" ");
//        int n;
//        for(String s:inputArr)
//        {
//            n=s.length();
//            char[] ca = s.toCharArray();
//            char t;
//            t=ca[0];
//            ca[0]=ca[n-1];
//            ca[n-1]=t;
//            output=output+" "+new String(ca);
//        }
//        System.out.println(output);
	}
}
