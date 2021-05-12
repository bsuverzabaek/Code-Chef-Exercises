//run as java -ea divSubset
import java.util.Scanner;

public class divSubset{
	public static void main(String[] args){
		int T,N,sumN,O,P,L;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			sumN += N;

			if(T==1){
				assert(sumN>=1 && sumN<=100000) : "Sum of N must be 1 <= sum <= 10^5";
			}

			int A[] = new int[N+1];
			long B[] = new long[N+1];
			int M[] = new int[N];

			for(int i=0;i<N;i++){
				M[i] = -1;
			}

			M[0] = 0;
			A[0] = 0;
			B[0] = 0;

			for(int i=1;i<=N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000000000) : "All elements must be 1 <= A[i] <= 10^9";
				B[i] = B[i-1]+(long)A[i];
			}

			O = 0;
			P = 0;

			for(int i=1;i<=N;i++){
				L = (int)B[i]%N;

				if(M[L]==-1){
					M[L] = i;
				}else{
					O = i;
					P = M[L];
					break;
				}
			}

			System.out.println(O-P);

			for(int i=P+1;i<=O;i++){
				System.out.print(i);

				if(i!=O){
					System.out.print(" ");
				}

				System.out.println();
			}

			T--;
		}
	}
}