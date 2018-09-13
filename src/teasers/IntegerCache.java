package teasers;

/**
 * Guess the results
 * @author Sabir
 *
 */
public class IntegerCache {
	public static void main(String [] args) {
		Integer first1 = 1;
		Integer second1 = 1;
		Integer obj1 = new Integer(1);
		
		Integer first128 = 128;
		Integer second128 = 128;
		Integer obj128 = new Integer(128);
		
		System.out.println(first1 == second1);
		
		System.out.println(first1 == obj1);
		
		System.out.println(first128 == second128);
		
		System.out.println(first128 == obj128);
	}
}
