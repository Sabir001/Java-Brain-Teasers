package teasers;

/**
 * What will the program print? Is it a bug? Or a limitation?
 * @author Sabir
 *
 */
public class AbsMethodCheck {

	public static void main(String[] args) {
		int minNumber = Integer.MIN_VALUE;
		
		int absNumber = absValue(minNumber);
		
		System.out.println(absNumber);
	}

	private static int absValue(int number) {
		if(number < 0) {
			return -1 * number;
		}
		return number;
	}
	

}
