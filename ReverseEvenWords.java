package JavaClass;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		* Declare the input as Follow
//  		String test = "I am a software tester"; //
//a) split the words and have it in an array//
//b) Traverse through each word (using loop)//
//c) find the odd index within the loop (use mod operator)//
//
//d)split the words and have it in an array//
//
//e)print the even position words in reverse order using another loop (nested loop)
//f) Convert words to character array if the position is even else print the word as it is(concatenate space at the end).
		String test = "I am a software tester"; 
		String[] name1 = test.split(" ");
		for(int i=0;i<name1.length;i++)
		
		 {
		if(i%2!=0)
		 {			
			char[] name2 = name1[i].toCharArray();		
			for(int j=name2.length-1;j>=0;j--) {
				System.out.print(name2[j]);
			}
			}
			else
		{
			System.out.print(" "+name1[i]+" "); //0
		}
		}
		
		

	}

}



