/* Purpose:
 * 		Program that will act as a simple calculator and perform basic mathematical functions between two numbers and display the result
 * Programmer: Lanz Salviejo
 * Date: Jan 2024
 */

// Imports scanner function
import java.util.*;

public class SimpleCalculator {

	public static void main(String[] args) {
		// Welcomes user and describes program
		System.out.println("Welcome to the Simple Calculator!!!");
		System.out.println("\nThis program evaluates a simple mathematical expression");
		System.out.println("input by the user and outputs the result. When prompted,");
		System.out.println("The user should input a number, followed by an operator,");
		System.out.println("folowed by a second number. A space must seperate the");
		System.out.println("numbers and the mathematical operator.");
		System.out.println("Lets get started!");

		// Initializes scanner function
		Scanner input = new Scanner(System.in);

		// States the variables used for calculations
		double[] number = new double[2];
 		char operator;
		

		// Variable that asks user if they would like to input another expression
		char ans;

		do {
			// Program segment that takes the users input
			System.out.print("\nEnter a mathematical expression: ");
			number[0] = input.nextDouble();
			operator = input.next().charAt(0);
			number[1] = input.nextDouble();
			
			Calculator calculate = new Calculator(number[0], number[1]);
			
			// Program segment that converts the users input a proper mathematical equation
			switch (operator) {

			// Cases for multiplication, case * and x do not need to be specified as it will
			// automatically go down to case X
			case '*':
			case 'x':
			case 'X':
				System.out.println(calculate.multiply());
				break;
			// Case for division
			case '/':
				System.out.println(calculate.divide());
				break;
			// Case for addition
			case '+':
				System.out.println(calculate.add());
				break;
			// Case for subtraction
			case '-':
				System.out.println(calculate.subtract());
				break;
			// Case for power
			case '^':
				System.out.println(calculate.power());
				break;
			// Case for modulus
			case '%':
				System.out.println(calculate.modulus());
				break;
			// Default case if the operator entered is invalid
			default:
				System.out.println("\nERROR: This expression is invalid, please try again.");
			}//switch

			// Asks the user if they would like to input another calculation
			System.out.print("\nThe number of equations created is now: " + calculate.getEquations());
			System.out.print("\nEvaluate another expression? (y/n) ");
			ans = input.next().charAt(0);

		} while (Character.toLowerCase(ans) == 'y'); // Answering y will exit the loop

		// Closes the scanner
		input.close();

		// Prints out final message
		System.out.println("\nThank you for using the Simple Calculator!");
		System.out.println("Written by Lanz Salviejo, Spring 2024");
	} // main
	
} // SimpleCalculator
