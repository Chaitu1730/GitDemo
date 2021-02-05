
public class ReverseStringPractice {

	public static void main(String[] args) {
		String str1 = "Chaitali 12345";
		System.out.println(reverse(str1));

	}

	private static String reverse(String str) {
		
		if(str == null) {
			throw new IllegalArgumentException("Null is not valid input"); 
		}
		
		StringBuilder reverseString = new StringBuilder();
		char[] chars = str.toCharArray();
		for(int i= chars.length-1 ; i >=0; i--) {
			reverseString.append(chars[i]);
		}
		
		return reverseString.toString();
	}

}
