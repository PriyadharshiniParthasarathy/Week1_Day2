package JavaClass;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		a) Declare A String value as"madam"
//	 
//	 * b) Declare another String rev value as ""
//	 * c) Iterate over the String in reverse order
//	 * d) Add the char into rev
//	 * e) Compare the original String with the reversed String, if it is same then print palinDrome 
//	 
//	 * Hint: Use .equals or .equalsIgnoreCase when you compare a String 
//		
		String word = "madam";
		String rev = " ";
		int length = word.length();
		
		for(int i=length-1;i>=0;i--)
			{
			rev = rev + word.charAt(i);
			System.out.println("Given string is a palindrome " +word.charAt(i));
		}
		
			
			if (rev.equals(word));
			{
				System.out.println("Given string is a palindrome " +rev);
				System.out.println("Given string is a palindrome " +word);
			}

	}

}
