package practice;

public class PrimeNumber {
	public static void main(String[] args) {
		int n=4;
		//int count=0;
		
		/*for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count++;
			}
		}
		if(count==2)
			System.out.println("no is prime");
		else
			System.out.println("not prime");*/
		
		//---------to print series of prime no--------
		for(int i=1;i<=100;i++){
			int count=0;
			for(int j=1;j<=i;j++) {
				if(i%j==0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.print(i+" ");
			}
		}
		
	}

}
