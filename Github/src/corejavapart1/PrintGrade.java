package corejavapart1;
import java.util.Scanner;
public class PrintGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the marks:");
		int physics = sc.nextInt();
		int chemistry = sc.nextInt();
		int maths = sc.nextInt();
		int total = (physics+chemistry+maths)/3;
		System.out.println("TOTAL marks are" +"" +total);
		if(total>80 && total<100) {
			System.out.println("Grade A");
		}
		else if(total>70 && total<80) {
			System.out.println("Grade B");
		}
		else {
			System.out.println("Grade C");
		}
		
	}

}
