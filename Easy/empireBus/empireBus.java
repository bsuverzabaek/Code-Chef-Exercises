//run as java -ea empireBus
import java.util.Scanner;

public class empireBus{
	public static void main(String[] args){
		int T,N,sumN;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=2000000) : "N must be 1 <= N <= 2*10^6";
			sumN += N;

			if(T==1){
				assert(sumN<=2000000) : "Sum of N must be <= 2*10^6";
			}

			int[] A = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000000000) : "A["+i+"] must be 1 <= A[i] <= 10^9";
			}

			for(int i=1;i<N;i++){
				A[i] = min(A[i],A[i-1]+1);
			}

			for(int i=N-2;i>=0;i--){
				A[i] = min(A[i],A[i+1]+1);
			}

			for(int i=0;i<N;i++){
				System.out.print(A[i] + " ");
			}

			System.out.println();

			T--;
		}
	}

	public static int min(int a,int b){
		if(a<b){
			return a;
		}else{
			return b;
		}
	}
}