
public class FactorialPractice {

	public static void main(String[] args) {
		int n1 = 5;
		System.out.println(factorial(n1));
		
	}

	private static long factorial(int n1) {
		if(n1 == 1) {
			return 1;
		}else {
			return n1 * factorial(n1 - 1);
		}
	}

}
