//run as java -ea magicElements
import java.util.Scanner;

public class magicElements{
	public static void main(String[] args){
		int T,N,K,sum,sumN,count;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 100000";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();
			sumN = 0;

			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 100000";
			assert(K>=1 && K<=1000000000) : "K must be 1 <= K <= 10^9";

			int[] A = new int[N];
			sum = 0;
			sumN += N;
			count = 0;

			if(T==1){
				assert(sumN>=1 && sumN<=100000) : "Sum of N over all test cases must be 1 <= sumN <= 100000";
			}

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=10000) : "A["+i+"] must be 1 <= A[i] <= 10000";
				sum += A[i];
			}

			for(int i=0;i<N;i++){
				sum -= A[i];

				if(A[i]+K>sum){
					count++;
					sum += A[i];
				}else{
					sum += A[i];
				}
			}

			System.out.println(count);

			T--;
		}
	}
}