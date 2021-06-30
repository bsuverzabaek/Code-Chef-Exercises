//run as java -ea chefChocolate
import java.util.Scanner;

public class chefChocolate{
	public static void main(String[] args){
		int T,n,m;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			n = scan.nextInt();
			m = scan.nextInt();

			assert(n>=1 && n<=1000000000) : "n must be 1 <= n <= 10^9";
			assert(m>=1 && m<=1000000000) : "m must be 1 <= m <= 10^9";

			if((n*m)%2==0){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

			T--;
		}
	}
}