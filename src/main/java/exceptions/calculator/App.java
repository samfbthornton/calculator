package exceptions.calculator;

public class App {

	public static void main(String[] args) {
//		System.out.println(Calculator.sum(1, 2));
//		System.out.println(Calculator.product(11, 2));
//		System.out.println(Calculator.subtract(18, 2));

		try {
			System.out.println(Calculator.divide(4, 10));
		} catch (CannotUseZeroException cuze) {
			System.out.println("Please Do Not Use Zero");
		} catch (SecondNumberTooBigException sntbe) {
			System.out.println("Please make first number larger than second number");
		}
	}
}