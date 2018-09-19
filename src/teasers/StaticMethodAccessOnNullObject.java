package teasers;
/**
 * Will the code throw an Exception?
 * Think about it again.
 * And btw, that annotation changes nothing.
 * @author Sabir
 *
 */
public class StaticMethodAccessOnNullObject {
	@SuppressWarnings("static-access")
	public static void main(String [] args) {
		StaticMethodAccessOnNullObject staticMethodAccessOnNullObject = null;
		staticMethodAccessOnNullObject.simpleMethod();
	}
	
	public static void simpleMethod() {
		System.out.println("Static method called");
	}
}
