import java.util.Scanner;
public class Lab6_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word = scan.nextLine();
		int length = word.length();
		if (length % 2 == 0) {
			System.out.println("The length of the word ie even.");
		}
		else {
			System.out.println("The length of the word is odd.");
		}
			
		
		}

}
