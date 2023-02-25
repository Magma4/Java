import java.util.Scanner;

public class Calculator_new {
	public static void main(String[] args) {
		try (// create a scanner to obtain inputs from the command window
				Scanner input = new Scanner(System.in)) {
			int number1;
			int number2;
			int sum;
			int multiply;
			int divide;
			int subtract;

			System.out.println("Please enter first integer: ");
			number1 = input.nextInt();

			System.out.println("Please enter second integer: ");
			number2 = input.nextInt();

			sum = number1 + number2;
			multiply = number1 * number2;
			subtract = number1 - number2;
			divide = number1 / number2;

			System.out.println("The sum is " + sum);
			System.out.println("The product is " + multiply);
			System.out.println("The difference is " + subtract);
			System.out.println("The quotient is " + divide);
		}

	}

}
