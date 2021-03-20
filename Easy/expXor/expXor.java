//run as java -ea expXor
import java.util.Scanner;

public class expXor{
	public static void main(String[] args){
		int T,N,sumN;
		double ans,prob;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			sumN += N;

			if(T==1){
				assert(sumN<=400000) : "Sum of N must be <= 4*10^5";
			}

			int[] B = new int[N+1];
			double[] P = new double[N+1];

			for(int i=1;i<=N;i++){
				B[i] = scan.nextInt();
				assert(B[i]>=0 && B[i]<=1000000000) : "B["+i+"] must be 1 <= B[i] <= 10^9";
			}

			for(int i=1;i<=N;i++){
				P[i] = scan.nextDouble();
				assert(P[i]>=0 && P[i]<=1) : "P["+i+"] must be 1 <= P[i] <= 10^9";
			}

			ans = 0;

			for(int i=0;i<30;i++){
				prob = 0;

				for(int j=1;j<=N;j++){
					if((B[j] & (1<<i))!=0){
						prob = prob*(1-P[j])+(1-prob)*P[j];
					}
				}

				ans += prob*(1<<i);
			}

			System.out.format("%.15f\n",ans);

			T--;
		}
	}
}