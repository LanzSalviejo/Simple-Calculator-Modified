public class Calculator {
	private double number1;
	private double number2;
	private static int equations;
	
	public Calculator(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}//Calculator
	
	public double getNumber1() {
		return number1;
	}//getNumber1
	
	public double getNumber2() {
		return number2;
	}//getNumber2
	
	public double getEquations() {
		return equations;
	}//getEquations
	
	public double multiply(double n1, double n2) {
		equations++;
		return n1 * n2;
	}//multiply
	
	public double divide(double n1, double n2) {
		equations++;
		try {
			return n1 / n2;
		} catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
			return 0; // returns default value
		}//trycatch
	}//divide
	
	public double add(double n1, double n2) {
		equations++;
		return n1 + n2;
	}//add
	
	public double subtract(double n1, double n2) {
		equations++;
		return n1 - n2;
	}//subtract
	
	// Calculates power using the pow method in Java's math class API
	public double power(double n1, double n2) {
		equations++;
		return Math.pow(n1, n2);
	}//power
	
	public double modulus(double n1, double n2) {
		equations++;
		return n1 % n2;
	}//modulus
}
