package ds;

/**
 ** Java Program to implement Manacher Algorithm
 **/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

/** Class Manacher **/
public class Manacher
{
	/** function to preprocess string **/
	public String preProcess(String str)
	{
		int len = str.length();
		if (len == 0) 
			return "^$";
		String s = "^";
		for (int i = 0; i < len; i++)
			s += "#" + str.charAt(i);         
		s += "#$";
		return s;
	}
	/** function to get largest palindromic substring **/
	public String getLongestPalindrome(String str)
	{
		/** preprocess string **/
		char[] s = preProcess(str).toCharArray();
		System.out.println(s);
		int N = s.length;
		int[] p = new int[N + 1];
		int id = 0, mx = 0;
		for (int i = 1; i < N - 1; i++) 
		{
			System.out.println("i: "+i+" "+p[i]+" : "+mx+" : "+id);
			p[i] = mx > i ? Math.min(p[2 * id - i], mx - i) : 0;
			while (s[i + 1 + p[i]] == s[i - 1 - p[i]]) 
				p[i]++;
			if (i + p[i] > mx) 
			{
				mx = i + p[i];
				id = i;
			}
			//System.out.println(p[i]+" : "+mx+" : "+id);
		}
		/** length of largest palindrome **/
		int maxLen = 0;
		/** position of center of largest palindrome **/
		int centerIndex = 0;
		for (int i = 1; i < N - 1; i++) 
		{
			if (p[i] > maxLen) 
			{
				maxLen = p[i];
				centerIndex = i;
			}
		}
		/** starting index of palindrome **/
		int pos = (centerIndex - 1 - maxLen)/2;
		return str.substring(pos , pos + maxLen);        
	}
	/** Main Function **/
	public static void main(String[] args) throws IOException
	{    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Manacher Algorithm Test\n");
		System.out.println("\nEnter String");
		String text = br.readLine();

		Manacher m = new Manacher(); 
		String longestPalindrome = m.getLongestPalindrome(text); 
		System.out.println("\nLongest Palindrome : "+ longestPalindrome);    
	}    
}