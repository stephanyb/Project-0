import java.util.Scanner;

public class ProjectZero {

	public static void main(String[] args) {

		Scanner cin = new Scanner(System.in);
		System.out.print("Enter two numbers: ");

		if (cin.hasNextInt()) {
			int first = cin.nextInt();
			
			if (cin.hasNextInt()) {
				int second = cin.nextInt();
				bigFunction(first, second);
				
			} else if (cin.hasNextDouble()) {
				double second = cin.nextDouble();
				bigFunction(first,second);
			} else {
				System.out.println("Please try again and enter numbers.");
			}

		} else if (cin.hasNextDouble()) {
			double first = cin.nextDouble();
			
			if (cin.hasNextDouble()) {
				double second = cin.nextDouble();
				bigFunction(first,second);
			} else {
				System.out.println("Please try again and enter numbers.");
			}

		} else {
			System.out.println("Please try again and enter numbers.");
		}

		cin.close();	
	}
	public static void bigFunction(int a, int b) {
		int sum = a+b;
		System.out.println(" " + a + b + sum);
	}
	
	public static void bigFunction(double a, double b) {
		double sum = a+b;
		System.out.println(" " + a + b + sum);
	}
	
}

