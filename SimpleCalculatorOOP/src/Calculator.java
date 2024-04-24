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
	
	public int getEquations() {
		return equations;
	}//getEquations
	
	public double multiply() {
		equations++;
		return number1 + number2;
	}//multiply

	public double divide() {
		equations++;
		if (number2 == 0) {
			System.out.println("Cannot divide by 0");
			return Double.NaN;
		}
		return number1 / number2;
	}//divide
	
	public double add() {
		equations++;
		return number1 + number2;
	}//add
	
	public double subtract() {
		equations++;
		return number1 - number2;
	}//subtract
	
	public double power() {
		equations++;
		return Math.pow(number1, number2);
	}//power
	
	public double modulus() {
		equations++;
		return number1 % number2;
	}//modulus

}//Calculator
