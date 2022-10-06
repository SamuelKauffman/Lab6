import java.util.Scanner;
public class Lab6_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Number of classes held: ");
		double Classes = scan.nextDouble();
		System.out.println("Number of classes attended: ");
		double Attendance = scan.nextDouble();
		double A = Attendance / Classes;
		
		if (A >= .75) {
			System.out.println("You are allowed to sit in your exam.");
		}
		else {
			System.out.println("You are not allowed to sit in your exam.");
		}
	}

}
