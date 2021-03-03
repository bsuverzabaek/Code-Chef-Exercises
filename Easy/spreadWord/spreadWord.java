//run as java -ea spreadWord
import java.util.Scanner;

public class spreadWord{
	public static void main(String[] args){
		int T,N,sumN,a,b;
		long sum;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=2 && N<=100000) : "N must be 2 <= N <= 10^5";
			sumN += N;

			if(T==1){
				assert(sumN<=1000000) : "Sum of N must be <=10^6";
			}

			long[] A = new long[N];
			long[] B = new long[N];
			long[] C = new long[N];

			sum = 0;

			for(int i=0;i<N;i++){
				A[i] = scan.nextLong();
				assert(A[i]>=0 && A[i]<=N) : "A["+i+"] must be 0 <= A[i] <= N";
				sum += A[i];
				B[i] = sum;
			}

			assert(A[0]>=1) : "A[0] must be 1 <= A[0]";

			a = 0;
			b = 0;
			C[0] = B[0];

			while(C[a]<=N-b-1){
				b += B[b];
				C[a+1] = B[b];
				a++;
			}

			if(b<N-1){
				a++;
			}

			System.out.println(a);

			T--;
		}
	}
}