//run as java -ea maxK
import java.util.Scanner;
import java.util.Arrays;

public class maxK{
	public static void main(String[] args){
		int N,K,size;
		long sum;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		K = scan.nextInt();

		assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";
		assert(K>=1 && K<=min(N*(N+1)/2,100000)) : "K must be 1 <= K <= min(N*(N+1)/2,10^5)";

		long[] A = new long[N];
		long[] ans = new long[N*(N+1)/2];

		for(int i=0;i<N;i++){
			A[i] = scan.nextInt();
			assert(A[i]>=1 && A[i]<=1000000000) : "A["+i+"] must be 1 <= A[i] <= 10^9";
		}

		size = 0;

		for(int i=0;i<N;i++){
			sum = 0;
			for(int j=i;j<N;j++){
				sum += A[j];
				ans[size] = sum;
				size++;
			}
		}

		Arrays.sort(ans);

		for(int i=0;i<(N*(N+1)/2)/2;i++){
			long temp = ans[i];
			ans[i] = ans[(N*(N+1)/2)-i-1];
			ans[(N*(N+1)/2)-i-1] = temp;
		}

		for(int i=0;i<K;i++){
			System.out.print(ans[i] + " ");
		}

		System.out.println();
	}

	public static int min(int a,int b){
		if(a<b){
			return a;
		}else{
			return b;
		}
	}
}