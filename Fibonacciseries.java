package JavaClass;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int range = 8;
		int f1 =0;
		int f2 =1;
			System.out.println(f1);
			for (int i =1; i<range;++i) {
				int sum = f1 +f2;
				f1 = f2;
				f2 =sum;
				System.out.println(sum);
				
}
}
}
