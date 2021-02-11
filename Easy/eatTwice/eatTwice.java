//run as java -ea eatTwice
import java.util.Scanner;

public class eatTwice{
	public static void main(String[] args){
		int T,N,M;
		int j,m1,m2;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		int sumN = 0;
		int sumM = 0;

		while(T>0){
			N = scan.nextInt();
			M = scan.nextInt();

			assert(N>=2 && N<=100000) : "N must be 2 <= N <= 10^5";
			assert(M>=2 && M<=100000) : "M must be 2 <= M <= 10^5";

			sumN += N;
			sumM += M;

			if(T==1){
				assert(sumN<=1000000) : "Sum of N must not exceed 10^6";
				assert(sumM<=1000000) : "Sum of M must not exceed 10^6";
			}

			int[] D = new int[N];
			int[] V = new int[N];

			for(int i=0;i<N;i++){
				D[i] = scan.nextInt();
				V[i] = scan.nextInt();

				assert(D[i]>=1 && D[i]<=M) : "D["+i+"] must be 1 <= D[i] <= M";
				assert(V[i]>=1 && V[i]<=1000000000) : "D["+i+"] must be 1 <= V[i] <= 10^9";
			}

			m1 = 0;
			m2 = 0;
			j = 0;

			for(int i=0;i<N;i++){
				if(V[i]>m1){
					m1 = V[i];
					j = i;
				}
			}

			V[j] = 0;

			for(int i=0;i<N;i++){
				if(V[i]>m2 && D[i]!=D[j]){
					m2 = V[i];
				}
			}

			System.out.println(m1+m2);

			T--;
		}
	}
}