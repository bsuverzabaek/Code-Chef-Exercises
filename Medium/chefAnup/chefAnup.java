//run as java -ea chefAnup
import java.util.Scanner;

public class chefAnup{
	public static void main(String[] args){
		int T,N,K,i;
		long L,q;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();
			L = scan.nextLong();

			assert(N>=1 && N<=1000) : "N must be 1 <= N <= 10^3";
			assert(K>=2 && K<=1000) : "N must be 1 <= K <= 10^3";
			assert(L>=1 && L<=1000000000000000000L) : "L must be 1 <= L <= 10^18";

			int[] a = new int[N];

			q = L-1;
			i = 0;

			while(q>0){
				a[i++] = (int)q%K;
				q /= K;
			}

			while(i<N){
				a[i++] = 0;
			}

			for(i=N-1;i>=0;i--){
				System.out.print(a[i]+1 + " ");
			}

			System.out.println();

			T--;
		}
	}
}