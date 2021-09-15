package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str = "stops";
		String strA = "potss";
		
		int lenstr = str.length();
		int lenstrA = strA.length();
		
		if (lenstr == lenstrA)
		{
			char[] chstr = str.toCharArray();
			char[] chstrA = strA.toCharArray();
			
				Arrays.sort(chstr);
				Arrays.sort(chstrA);
		
				if (Arrays.equals(chstr, chstrA))
					System.out.println(strA+ " is an Anagram of " +str);
				else
					System.out.println(strA+ " is not an Anagram of " +str);
					
		}
		else
			System.out.println("'" +strA+ "' is not an Anagram of '" +str+ "' as the string length doesnt match.");
			
		
	}

}
