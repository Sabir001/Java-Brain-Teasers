package teasers;

import java.util.Arrays;
import java.util.List;

/**
 * Even adding to a list can create a headache. 
 * Predict the problem.
 * @author Sabir
 *
 */
public class AddToList {
	public static void main(String [] args) {
		List<Integer> myList = Arrays.asList(7, 10, 4);

		myList.forEach(num -> System.out.println(num));
		
		myList.add(4);
		
		myList.forEach(num -> System.out.println(num));
	}
}
