//run as angryCyborg
import java.util.Scanner;

public class angryCyborg{
	public static void main(String[] args){
		int T,N,Q,l,r,carry,sumN,sumQ;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 10^3";

		sumN = 0;
		sumQ = 0;

		while(T>0){
			N = scan.nextInt();
			Q = scan.nextInt();

			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";
			assert(Q>=1 && Q<=100000) : "N must be 1 <= Q <= 10^5";

			sumN += N;
			sumQ += Q;

			if(T==1){
				assert(sumN<=1000000) : "Sum of N must be <=10^6";
				assert(sumQ<=1000000) : "Sum of Q must be <=10^6";
			}

			int[] arr = new int[N+1];
			int[] CS = new int[N+1];
			int[] CE = new int[N+1];
			int[] ans = new int[N+1];

			for(int i=0;i<N+1;i++){
				arr[i] = 0;
				CS[i] = 0;
				CE[i] = 0;
				ans[i] = 0;
			}

			for(int i=0;i<Q;i++){
				l = scan.nextInt();
				r = scan.nextInt();
				
				assert(l>=1 && l<=r) : "l and r must be 1 <= l <= r <= N";
				assert(r>=l && r<=N) : "l and r must be 1 <= l <= r <= N";

				CS[l]++;
				CE[r]++;
				arr[l]++;

				if(r!=N){
					arr[r+1] += l-r-1;
				}
			}

			carry = 0;

			for(int i=1;i<N+1;i++){
				ans[i] = ans[i-1]+carry+arr[i];
				carry += CS[i]-CE[i];
			}

			for(int i=1;i<N+1;i++){
				System.out.print(ans[i] + " ");
			}

			System.out.println();

			T--;
		}
	}
}