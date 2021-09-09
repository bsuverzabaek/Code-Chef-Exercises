//run as java -ea primeGen
import java.util.Scanner;

public class primeGen{
	public static void main(String[] args){
		int t,m,n,flag;
		Scanner scan = new Scanner(System.in);

		t = scan.nextInt();
		assert(t>=1 && t<=10) : "t must be 1 <= t <= 10";

		while(t>0){
			m = scan.nextInt();
			n = scan.nextInt();

			assert(m>=1 && m<=n) : "m must be 1 <= m <= n";
			assert(n<=1000000000) : "n must be <= 10^9";
			assert(n-m<=100000) : "n-m must be <= 10^5";

			for(int i=m;i<=n;i++){
				if(i==1 || i==0){
					continue;
				}

				flag = 1;

				for(int j=2;j*j<=i;j++){
					if(i%j==0){
						flag = 0;
						break;
					}
				}

				if(flag==1){
					System.out.println(i);
				}
			}
			System.out.println();

			t--;
		}
	}
}