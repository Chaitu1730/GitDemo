
public class PrimePractice {

	public static void main(String[] args) {

		int i,n,flag,count=100;
		
		for(n=3;n<=count;n++) {
			flag = 0;
			for(i=2;i<n;i++) {
				if(n%i==0) {
					flag=1;
					break;
				}
			}
			
			if(flag==0) {
				System.out.println(n);
			}
			
		}
			
	}

}
