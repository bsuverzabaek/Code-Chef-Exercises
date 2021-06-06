//run as java -ea chefJudges
import java.util.Scanner;
import java.util.Arrays;

public class chefJudges{
	public static void main(String[] args){
		int T,N,sum1,sum2;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=2 && N<=100) : "N must be 2 <= N <= 100";

			int[] A = new int[N];
			int[] B = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000) : "A["+i+"] must be 1 <= A[i] <= 1000";
			}

			for(int i=0;i<N;i++){
				B[i] = scan.nextInt();
				assert(B[i]>=1 && B[i]<=1000) : "B["+i+"] must be 1 <= B[i] <= 1000";
			}

			Arrays.sort(A);
			Arrays.sort(B);

			A[N-1] = 0;
			B[N-1] = 0;

			sum1 = 0;
			sum2 = 0;

			for(int i=0;i<N;i++){
				sum1 += A[i];
				sum2 += B[i];
			}

			if(sum1==sum2){
				System.out.println("Draw");
			}else if(sum2<sum1){
				System.out.println("Bob");
			}else{
				System.out.println("Alice");
			}

			T--;
		}
	}
}