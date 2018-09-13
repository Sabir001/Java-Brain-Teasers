package teasers;

/**
 * What will the be the output?
 * Will there be any output at all?
 * @author Sabir
 *
 */
public class LoopCheckWithIntegerMaxValue {
	public static void main(String[] args) {
	      int highestLimit = Integer.MAX_VALUE;
	      int startPosition = highestLimit - 100;
	      int count = 0;
	      for (int i = startPosition; i <= highestLimit; i++) {
	        count++;
	      }
	      System.out.println(count);
	   }
}
