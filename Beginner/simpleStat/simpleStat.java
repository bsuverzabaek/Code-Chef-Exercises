//run as java -ea simpleStat
import java.util.Scanner;
import java.util.Arrays;

public class simpleStat{
	public static void main(String[] args){
		int T,N,K,sum;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=1 && N<=10000) : "N must be 1 <= N <= 10^4";
			assert(2*K>=0 && 2*K<N) : "K must be 0 <= 2K < N";

			int[] A = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=-1000000 && A[i]<=1000000) : "A["+i+"] must be -10^6 <= A[i] <= 10^6";
			}

			Arrays.sort(A);
			sum = 0;

			for(int i=K;i<N-K;i++){
				sum += A[i];
			}

			System.out.printf("%.6f",sum/(N-K*2.0));
			System.out.println();

			T--;
		}
	}
}