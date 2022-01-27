package JavaClass;

import java.util.Arrays;

public class MissingElementInAnArray {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 6, 7, 8 };
		Arrays.sort(arr);
		for (int i = 1; i <= arr.length - 1; i++) {
			if (i != arr[i - 1])
			{
				System.out.println("MissingElementInAnArray:- " +i);
				break;
			}

		}

	}
}
	
		
/*int[] arr = {1,2,3,4,7,6,8};
Arrays.sort(arr);
int sum = 0;
for(int i=0;i<arr.length;i++)
{			
System.out.println("sum " + sum);
sum = sum + arr[i];// 0+1=1
System.out.println("arra[i] " + arr[i]);
}
System.out.println(sum);
int sum1 = 0;
for(int j=1;j<=8;j++)
{
sum1 = sum1+j;
}
System.out.println(sum1);
int sum2;
sum2= sum1-sum;		
System.out.println("MissingElementInAnArray:- " +sum2);	
}}*/
		