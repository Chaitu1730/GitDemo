
public class PalindromePractice {

	public static void main(String[] args) {

		int n=434;
		int r,temp,sum=0;
		
		temp = n;
		while(n>0) {
			r = n%10;
			sum = (sum*10)+r;
			n = n/10;
		}
		
		if (temp==sum) {
			System.out.println("Number is a Palindrome");
		}else {
			System.out.println("Number is not a Palindrome");
		}
			
	}

}
