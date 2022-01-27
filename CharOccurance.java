package JavaClass;

public class CharOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check number of occurrences of a char (eg 'e') in a String
		
					//String str = "welcome to chennai";

					// declare and initialize a variable count to store the number of occurrences
					
					// convert the string into char array
						
					//get the length of the array
						
					// traverse from 0 till the array length 
						
						// Check the char array has the particular char in it 
					
						// if is has increment the count
							 
						
						// print the count out of the loop
							
					
		String str = "welcome to chennai";
		int count = 0;
		char[] char1 = str.toCharArray();
		int length = char1.length;
		for(int i =0;i<length;i++)
		{
			if (char1[i] == 'e')
			
			{
				count++;
				
			}
		}
			System.out.println(count);
				

	}

}
