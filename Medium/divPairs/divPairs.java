//run as java -ea divPairs
import java.util.Scanner;

public class divPairs{
	public static void main(String[] args){
		int T,N,M;
		long ans,a,b;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 100000";

		while(T>0){
			N = scan.nextInt();
			M = scan.nextInt();

			assert(N>=1 && N<=1000000000) : "N must be 1 <= N <= 10^9";
			assert(M>=2 && M<=1000000000) : "M must be 2 <= M <= 10^9";

			a = N/M;
			b = N%M;

			ans = a*a*(M-1);
			ans += a*(a-1);

			if(M%2==0){
				ans -= a;
			}

			ans /= 2;
			ans += a*b;

			if(b>M/2){
				ans += b-M/2;
			}

			System.out.println(ans);

			T--;
		}
	}
}