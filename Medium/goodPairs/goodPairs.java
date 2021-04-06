//run as java -ea goodPairs
import java.util.Scanner;

public class goodPairs{
	public static void main(String[] args){
		int T,N,sumN,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=20) : "T must be 1 <= T <= 20";

		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=1000000) : "N must be 1 <= N <= 10^6";

			sumN += N;

			if(T==1){
				assert(sumN>=1 && sumN<=1000000) : "Sum of N must be <= 10^6";
			}

			int[] count = new int[1000001];
			int[] dp = new int[1000001];
			int[] A = new int[N];

			for(int i=0;i<1000001;i++){
				count[i] = 0;
				dp[i] = 0;
			}

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=0 && A[i]<=1000000) : "A["+i+"] must be 0 <= A[i] <= 10^6";
				dp[A[i]]++;
				count[A[i]]++;
			}

			for(int i=0;i<21;i++){
				for(int j=1;j<1000001;j++){
					if((j&(1<<i))!=0){
						dp[j] += dp[j^(1<<i)];
					}
				}
			}

			ans = 0;

			for(int i=0;i<N;i++){
				ans += count[A[i]]*(dp[A[i]]-count[A[i]])+count[A[i]]*(count[A[i]]-1)/2;
				count[A[i]] = 0;
			}

			System.out.println(ans);

			T--;
		}
	}
}