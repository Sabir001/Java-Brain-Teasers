package teasers;

import java.util.Scanner;
/**
 * Will this class work as intended? If not, what is the problem?
 * @author Sabir
 *
 */
public class ScannerClose {
	public static void main(String[] args) {
		addMethod();
		multiplyMethod();
	}

	private static void multiplyMethod() {
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0;

		System.out.println("Enter first number for multiplication:" + System.lineSeparator());
		if(sc.hasNext()) {
			number1 = sc.nextInt();
		}

		System.out.println("Enter second number for multiplication:" + System.lineSeparator());
		if(sc.hasNext()) {
			number2 = sc.nextInt();
		}
		
		System.out.println((number1 + number2));
		
		if(sc != null) {
			sc.close();
		}
	}

	private static void addMethod() {
		Scanner sc = new Scanner(System.in);
		int number1 = 0, number2 = 0;
		
		System.out.println("Enter first number for addition:" + System.lineSeparator());
		if(sc.hasNext()) {
			number1 = sc.nextInt();
		}
		
		System.out.println("Enter second number for addition:" + System.lineSeparator());
		if(sc.hasNext()) {
			number2 = sc.nextInt();
		}
		
		System.out.println((number1 * number2));
		
		if(sc != null) {
			sc.close();
		}
	}
}
