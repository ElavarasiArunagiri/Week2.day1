package week2.day1.assignments;

public class Palindrome {

	public static void main(String[] args) {
		String str = "Madam";
		String rev = "";

		System.out.println("The given string to check for palindrom: " +str);
		for (int i = str.length()- 1; i >= 0; i--) {
			rev = rev+ str.charAt(i);
			
		}
		System.out.println("The string after reversing: " +rev);
		if (str.equalsIgnoreCase(rev)) {
			System.out.println(" it is a palindrome");
		} else
			System.out.println("it is not a palindrome");

	}

}