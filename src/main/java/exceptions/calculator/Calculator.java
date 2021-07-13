package exceptions.calculator;

public class Calculator {

	public static int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public static int product(int a, int b) {
		int product = a * b;
		return product;
	}

	public static double subtract(int a, int b) {
		int subtract = a - b;
		return subtract;
	}

	public static double divide(double a, double b) throws SecondNumberTooBigException, CannotUseZeroException {
		double divide = a / b;

		if (a == 0 || b == 0) {
			throw new CannotUseZeroException();
		} else if (a < b) {
			throw new SecondNumberTooBigException();
		} else
			return divide;
	}

}
