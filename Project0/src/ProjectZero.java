import java.util.Scanner;

public class ProjectZero {

	public static void main(String[] args) 
{

		Scanner cin = new Scanner(System.in);
		System.out.print("Enter two numbers: ");

		if(cin.hasNextInt(2))
		{
			int first = cin.nextInt();//reads in integer 1001
			String binNum = Integer.toString(first); //converts int read in to a string 1001 to "1001"
			//1001 - converts number to base 10 ex/1001001 = 1001 and returns that string not "1001
			//corrected: using incorrect base, should be using base 2 not base 10 as previously used
			
			int convBinNum = Integer.parseInt(binNum,2);//reads 1001 and converts it to 9 in base 10
			
			if (cin.hasNextInt()) 
			{
				int second = cin.nextInt();
				bigFunction(convBinNum, second);
			}
		}
		
		/*
			
		else if (cin.hasNextInt()) {
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

			*/
		cin.close();
		
}
	public static void bigFunction(int a, int b) {
		int sum = a+b;
		System.out.println(" The sum of " + a + " + "+ b + " = "+sum);
	}
	
	public static void bigFunction(double a, double b) {
		double sum = a+b;
		System.out.println(" The sum of " + a + " + "+ b + " = "+sum);
	}
	
}

