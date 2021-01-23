//run as java -ea aBooks
import java.util.Scanner;

public class aBooks{
	public static void main(String[] args) {
		int T,N;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";

			int[] A = new int[N];
			int[] B = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000000) : "A["+i+"] must be 1 <= A[i] <= 1000000";
				B[i] = 0;
			}

			for(int i=N-2;i>=0;i--){
				if(A[i]==A[i+1]){
					B[i] = B[i+1];
				}else{
					B[i] = N-1-i;
				}
			}

			for(int i=0;i<N;i++){
				System.out.print(B[i] + " ");
			}
			System.out.println();

			T--;
		}
	}
}