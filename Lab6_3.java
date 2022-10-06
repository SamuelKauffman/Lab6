import java.util.Scanner;
public class Lab6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Your length is: ");
		double A = scan.nextDouble();
		System.out.println("Your width is: ");
		double B = scan.nextDouble();
		if (A==B) {
			System.out.println("This is a square.");
		}
		else {
			System.out.println("This is a rectangle.");
		}
	}

}
