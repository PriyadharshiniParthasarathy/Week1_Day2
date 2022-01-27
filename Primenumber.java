package JavaClass;

public class Primenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 13;
		boolean flag = false;
		
		//divisible by 13 & 1 is called as prime number & reminder should be 0.
		
		for(int i=2;i<input;i++)
		{
			if(input%i==0) {
				flag = true;
			break;
		}
		}
			if(!flag) 
				// Converting the false to True by using of (!flag) 
				//Condition checking the Flag value-> false is not equal to true
				
			{
				System.out.println(input+ " is a Prime Number ");
			}
			else
			{
				System.out.println(input+ " is not a Prime Number ");
			}

	}

}

	
