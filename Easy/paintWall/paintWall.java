//run as java -ea paintWall
import java.util.Scanner;

public class paintWall{
	public static void main(String[] args){
		int T,N,M,sumN,sumM,count,max;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		sumN = 0;
		sumM = 0;

		while(T>0){
			N = scan.nextInt();
			M = scan.nextInt();

			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";
			assert(M>=1 && M<=100000) : "M must be 1 <= M <= 10^5";

			sumN += N;
			sumM += M;

			if(T==1){
				assert(sumN<=500000) : "Sum of N must be <= 5*10^5";
				assert(sumM<=500000) : "Sum of M must be <= 5*10^5";
			}

			int[] H = new int[N];
			int[] C = new int[N];
			int[] F = new int[M+1];

			for(int i=0;i<N;i++){
				H[i] = scan.nextInt();
				assert(H[i]>=1 && H[i]<=1000000000) : "H["+i+"] must be 1 <= H[i] <= 10^9";
			}

			for(int i=0;i<N;i++){
				C[i] = scan.nextInt();
				assert(C[i]>=1 && C[i]<=M) : "C["+i+"] must be 1 <= C[i] <= M";
			}

			for(int i=0;i<M+1;i++){
				F[i] = 0;
			}

			count = 0;
			max = H[N-1];
			F[C[N-1]]++;

			for(int i=N-1;i>=1;i--){
				if(H[i-1]>max){
					max = H[i-1];
					F[C[i-1]]++;
				}
			}

			for(int i=0;i<M+1;i++){
				if(F[i]>0){
					count++;
				}
			}

			System.out.println(count);

			T--;
		}
	}
}