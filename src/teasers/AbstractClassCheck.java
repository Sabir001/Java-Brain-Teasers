package teasers;

/**
 * Can we really instantiate Abstract class?
 * Or is it an illusion?
 * @author Sabir
 *
 */
public abstract class AbstractClassCheck {

	public static void main(String[] args) {
		AbstractClassCheck abs = new AbstractClassCheck() {};
		
		abs.print();
	}
	
	public void print() {
		System.out.println("Method called");
	}

}
