package JavaClass;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		 *Declare a String 
//			String text1 = "stops";
//		 *Declare another String
//			String text2 = "potss"; 
//		 * a) Check length of the strings are same then (Use A Condition)
//		 * b) Convert both Strings in to characters
//		 * c) Sort Both the arrays
//		 * d) Check both the arrays has same value
//		 * 
//		 */
		 

		String text1 = "stops";
		String text2 = "potss"; 
		int text1length =  text1.length();
		int text2length =  text1.length();
		if (text1length==text2length)
		{
			System.out.println("length of the strings are same");
			char[] text11 = text1.toCharArray();
			char[] text12 = text2.toCharArray();
			Arrays.sort(text11);
			Arrays.sort(text12);
			text11 = text12;
			System.out.println(text11);
			System.out.println(text12);
			System.out.println("The condition is satisfied");
			
			
		}
		
	}

}
