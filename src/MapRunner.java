import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		
		String str = "This is an awesome occasion. This has never happened before";
		
		Map<Character, Integer> occurances = new HashMap<>();
		char[] characters = str.toCharArray();
		
		/*for(Character character : characters) {
			if(occurances.containsKey(character)) {
				occurances.put(character, occurances.get(character)+1);
			}
			else {
				occurances.put(character, 1);		
			}		
		}*/
		
		for(Character character : characters) {
			Integer integer = occurances.get(character);
			if(integer == null) {
				occurances.put(character, 1);
			}
			else {
				occurances.put(character, integer + 1);		
			}		
		}
		System.out.println(occurances);
		
//-----------------------------------------------------------------------------------------
		
		Map<String, Integer> strOccurances = new HashMap<>();
		String[] words = str.split(" ");
		
		/*for(String word : words) {
			Integer integer1 = strOccurances.get(word);
			if(integer1 == null) {
				strOccurances.put(word, 1);
			}else {
				strOccurances.put(word, integer1+1);
			}
		}*/
		
		for(String word : words) {
			if(strOccurances.containsKey(word)) {
				strOccurances.put(word, strOccurances.get(word) + 1);
			}else {
				strOccurances.put(word, 1);
			}
		}
		
		System.out.println(strOccurances);
		
		
		
		
		
		
	}

}
