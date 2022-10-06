import java.util.Scanner;
public class Lab6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Side A is: ");
		double A = scan.nextDouble();
		System.out.println("Side B is: ");
		double B = scan.nextDouble();
		System.out.println("Side C is: ");
		double C = scan.nextDouble();
		double D = (Math.pow(A, 2)+Math.pow(B, 2));
		if (C == D) {
			System.out.println("This is a pythagorean triple.");
		}
		else {
			System.out.println("This is not a pythagorean triple.");
		}
			
	}

}
