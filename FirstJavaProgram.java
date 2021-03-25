import java.util.Scanner;


public class FirstJavaProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner input = new Scanner(System.in);
		System.out.print("Enter price: ");
		double price = readDouble(input);
		System.out.println("Price with VAT is: " + 1.24 * price);
		}
		private static double readDouble(Scanner input) {
		 return Double.parseDouble(input.nextLine().replace('.', ','));
		 }	
	}


