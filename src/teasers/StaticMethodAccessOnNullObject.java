package teasers;
/**
 * Will the code throw an Exception?
 * Think about it again.
 * And btw, that annotation changes nothing.
 * 
 * We should always access static methods by Class name. But, I wrote it this way to clear if we need to check null if we want to access in this way.
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
