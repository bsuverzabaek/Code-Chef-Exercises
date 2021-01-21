//run as java -ea lazyJem
import java.util.Scanner;

public class lazyJem{
	public static void main(String[] args){
		int T;
		long N,B,M,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextLong();
			B = scan.nextLong();
			M = scan.nextLong();

			assert(N>=1 && N<=100000000) : "N must be 1 <= N <= 10^8";
			assert(B>=1 && B<=100000000) : "B must be 1 <= B <= 10^8";
			assert(M>=1 && M<=100000000) : "M must be 1 <= M <= 10^8";

			ans = 0;

			while(N>0){
				long prob = (N+1)/2;
				ans += prob * M;
				N -= prob;

				if(N!=0){
					ans += B;
				}

				M *= 2;
			}

			System.out.println(ans);

			T--;
		}
	}
}