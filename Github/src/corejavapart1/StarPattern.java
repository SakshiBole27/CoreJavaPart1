package corejavapart1;

//import java.util.Scanner;

public class StarPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner sc = new Scanner(System.in);
		// System.out.println("provide no. of rows to print:");

		// int n = sc.nextInt();

		//System.out.println("Star pattern is");

//		for (int i = 0; i < n; i++) {
//			
//			for (int j = 0; j <= i; j++) {
//				
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		
		//TRIANGLE

//		int size = 3;
//		for (int i = 0; i < size; i++) {
//			
//			for (int j = 1; j < size - i; j++) {
//				System.out.print(" ");
//			}
//			for (int k = 0; k <= i; k++) {
//				System.out.print(" *");
//			}
//			System.out.println("");
//		}
//		
		
		//RIGHT SIDE
		int n=3;
		for(int i=0;i<n;i++) {
			for(int j=1;j<n-1;j++) {
			System.out.print(" ");
		}
		for(int k=0;k<=i;k++) {
			System.out.print(" *");
		}
		System.out.println("");
		}
	}

}
