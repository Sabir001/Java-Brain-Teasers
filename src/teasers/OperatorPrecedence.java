package teasers;

/**
 * Predict the outcome of the code. And why the behavior is like it?
 * @author Sabir
 *
 */
public class OperatorPrecedence {

	public static void main(String[] args) {
		String numfirst = 3 + 4 + " = 7";
		
		String numLast = "34 = " + 3 + 4;
		
		String someMultiplicationAndDivisionAlso = 20154 + " = 20154 = " + 2 + 0 + 3 * 5 + 4 / 1;
		
		System.out.println(numfirst);
		
		System.out.println(numLast);
		
		System.out.println(someMultiplicationAndDivisionAlso);
	}

}
