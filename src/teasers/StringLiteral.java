package teasers;

/**
 * Guess the output of this program. Also try to find out the reasons.
 * @author Sabir
 *
 */
public class StringLiteral {
	public static void main(String [] args) {
		String str1  = "string";
		String str2 = "string";
		String strobj1 = new String("string");
		
		String partStr1 = "str";
		String partStr2 = "ing";
		
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));
		
		System.out.println(str2 == strobj1);
		System.out.println(str2.equals(strobj1));
		
		System.out.println(str1 == (partStr1 + partStr2));
		System.out.println(str1.equals(partStr1 + partStr2));
		
		String parts = (partStr1 + partStr2).intern();
		
		System.out.println(str1 == parts);
		System.out.println(str1.equals(parts));
		
	}
}
