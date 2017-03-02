import java.util.Scanner;

/**
 * Sums two numeric values in a type-sensitive way.
 * 
 * @author Stephany Belendez
 *
 */

public class ProjectZero {

	public static void main(String[] args) 
	{

		Scanner cin = new Scanner(System.in);
		System.out.print("Enter two numbers: ");
		
		if(cin.hasNextInt(2))
		//determines if number read in can be read as a binary number (radix(or base) 2)
		{
			cin.useRadix(2);
			//Overrides and sets initial radix(base) of the number read in to specified radix. 
			int first = cin.nextInt();
			//number read in is scanned as a binary(base 2) but base 10 value of the number is assigned to "first"
			
			if(cin.hasNextInt(2))
			{
				int second = cin.nextInt();
				sumOfBins(first,second);
				//sends both base 10 numbers to function: sumOfBins
			}
			else if (cin.hasNextInt(10)) 
			//Checks if the next number is of radix 10(base 10),basically a valid integer numerical value
			{
				cin.useRadix(10);
				int second = cin.nextInt();
				bigFunction(first, second);
				
			} 
			else if (cin.hasNextDouble())
			{
				double second = cin.nextDouble();
				bigFunction(first,second);
			} 
			else
			{
				System.out.println("Please try again and enter numbers.");
			}
		}	
		
		else if (cin.hasNextInt()) 
		{
			int first = cin.nextInt();
			
			if(cin.hasNextInt(2))
			{
				cin.useRadix(2);
				int second = cin.nextInt();
				sumOfBins(first,second);
				//bigFunction(first,second);
			}
			else if (cin.hasNextInt()) 
			{
				int second = cin.nextInt();
				bigFunction(first, second);
				
			} 
			else if (cin.hasNextDouble())
			{
				double second = cin.nextDouble();
				bigFunction(first,second);
			} 
			
			else 
			{
				System.out.println("Please try again and enter numbers.");
			}

		} 
		
		else if (cin.hasNextDouble()) 
		{
			double first = cin.nextDouble();
			
			if(cin.hasNextInt(2))
			{
				cin.useRadix(2);
				int second = cin.nextInt();
				bigFunction(first,second);
			}
			if (cin.hasNextDouble()) 
			{
				double second = cin.nextDouble();
				bigFunction(first,second);
			}  
			else 
			{
				System.out.println("Please try again and enter numbers.");
			}

		} 
		
		else 
		{
			System.out.println("Please try again and enter numbers.");
		}

			
		cin.close();	
	}
	
	/**
	 * Function receives the copy of two integer element types, 
	 * evaluates their sum and prints it to screen	
	 */
	
	public static void bigFunction(int a, int b) 
	{
		int sum = a+b;
		System.out.println(" The sum of " + a + " + "+ b + " = "+sum);
	}
	
	/**
	 * Function receives the copy of two double element types, 
	 * evaluates their sum and prints it to screen
	 */
	public static void bigFunction(double a, double b) 
	{
		double sum = a+b;
		System.out.println(" The sum of " + a + " + "+ b + " = "+sum);
	}
	
	/**
	 * Function receives the copy of two integer element types, 
	 * evaluates their sum and prints it in binary to screen
	 */
	public static void sumOfBins(int a, int b) 
	{
		int sum = a+b;
		String binSum = Integer.toBinaryString(sum);//converts the sum integer value 
											        //to a binary string in base 2
		System.out.println(" The sum of " + a + " + "+ b + " = "+binSum+ " in Binary");
	}
	
}