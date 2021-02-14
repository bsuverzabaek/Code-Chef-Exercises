//run as java -ea fastFood
import java.util.Scanner;

public class fastFood{
	public static void main(String[] args){
		int T,N,sumN,sumB,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";
			sumN += N;

			if(T==1){
				assert(sumN<=1000000) : "Sum of N must be <= 10^6";
			}

			int[] A = new int[N];
			int[] B = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=10000) : "A["+i+"] must be 1 <= A[i] <= 10^4";
			}

			sumB = 0;

			for(int i=0;i<N;i++){
				B[i] = scan.nextInt();
				assert(B[i]>=1 && B[i]<=10000) : "B["+i+"] must be 1 <= A[i] <= 10^4";
				sumB += B[i];
			}

			ans = sumB;

			for(int i=0;i<N;i++){
				sumB += A[i]-B[i];
				ans = max(ans,sumB);
			}

			System.out.println(ans);

			T--;
		}
	}

	public static int max(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
}