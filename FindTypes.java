package week2.day1.assignments;

public class FindTypes {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
				String str = "$$ Welcome to 2nd Class of Automation $$ ";

				int  letter = 0, space = 0, num = 0, specialChar = 0;
				char[] chrstr = str.toCharArray();
				for(int i=0; i<chrstr.length; i++)
				{	
					if(Character.isLetter(chrstr[i]))
						letter++;
					else if(Character.isSpace(chrstr[i]))
						space++;
					else if(Character.isDigit(chrstr[i]))
						num++;
					else
						specialChar++;
					
				}
				System.out.println("The count of character types in the string: '" +str+ "'");
				System.out.println("letter: " + letter);
				System.out.println("space: " + space);
				System.out.println("number: " + num);
				System.out.println("specialCharcter: " + specialChar);

		}

}
