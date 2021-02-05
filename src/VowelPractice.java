
public class VowelPractice {

	public static void main(String[] args) {
		String str1 = "Hello";
		System.out.println(containsVowels(str1));

	}

	private static boolean containsVowels(String str1) {
		
		return str1.toLowerCase().matches(".*[aeiou].*");
	}

}
