
public class SwapNumbersPractice {

	public static void main(String[] args) {
		int n1=10, n2=50;
		
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		
		System.out.println(n1);
		System.out.println(n2);
	}

}
