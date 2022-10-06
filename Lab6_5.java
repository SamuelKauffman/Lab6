import java.util.Scanner;
public class Lab6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your first variable: ");
		int A = scan.nextInt();
		System.out.println("Enter your second variable: ");
		int B = scan.nextInt();
		 System.out.println(A + ", " + B);
	        int tmp = A;
	        A = B;
	        B = tmp;
	        System.out.println("After Swapping: ");
	        System.out.println(A + ", " + B);
	}

}
