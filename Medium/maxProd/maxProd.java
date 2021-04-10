//run as java -ea maxProd
import java.util.Scanner;

public class maxProd{
	public static void main(String[] args){
		int T,N,K,sum,r,q;
		long ans,mod=1000000007;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=1 && N<=1000000000) : "N must be 1 <= N <= 10^9";
			assert(K>=1 && K<=10000) : "K must be 1 <= K <= 10^4";

			sum = (K*(K+1))/2;
			ans = 1;

			int[] A = new int[K];

			if(N<sum){
				ans = -1;
			}else if(N==sum){
				ans = 0;
			}else{
				r = N-sum;
				q = r/K;

				for(int i=1;i<=K;i++){
					A[i-1] = i;
				}

				for(int i=0;i<K;i++){
					A[i] += q;
				}

				r -= q*K;
				int j = K-1;

				while(r!=0){
					A[j--]++;
					r--;
				}

				for(int i=0;i<K;i++){
					ans = (((ans*(A[i]-1))%mod)*A[i])%mod;
				}
			}

			System.out.println(ans);

			T--;
		}
	}
}