//run as java -ea tooMany
import java.util.Scanner;

public class tooMany{
	public static void main(String[] args){
		int T;
		long N,M,K,rem;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			N = scan.nextLong();
			M = scan.nextLong();
			K = scan.nextLong();

			assert(N>=2 && N<=1000000000) : "N must be 2 <= N <= 10^9";
			assert(M>=2 && M<=1000000000) : "M must be 2 <= M <= 10^9";
			assert(K>=2 && K<=1000000000) : "K must be 2 <= K <= 10^9";

			if(M>N){
				System.out.println(-1);
			}else{
				rem = N%M;

				if(rem%K==0){
					System.out.println(rem/K);
				}else{
					System.out.println(-1);
				}
			}

			T--;
		}
	}
}