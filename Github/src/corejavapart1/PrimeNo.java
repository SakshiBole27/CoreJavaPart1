package corejavapart1;
import java.util.Scanner;
public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number:");
		int num = sc.nextInt();
		int count=0,i,j;
		if(num==1||num==0) {
			System.out.println("neither prime nor composite");
			}
		else {
		for(i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==2)
	}

}
