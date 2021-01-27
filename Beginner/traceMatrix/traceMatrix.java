//run as java -ea traceMatrix
import java.util.Scanner;
public class traceMatrix{
	public static void main(String[] args){
		int T,N;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=2 && N<=100) : "N must be 2 <= N <= 100";

			int[][] A = new int[N][N];
			int[] trace = new int[2*N];

			for(int i=0;i<2*N;i++){
				trace[i] = 0;
			}

			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					A[i][j] = scan.nextInt();
					assert(A[i][j]>=1 && A[i][j]<=100) : "A["+i+"]["+j+"] must be 1 <= A[i][j] <= 100";
					trace[i-j+(N-1)] += A[i][j];
				}
			}

			System.out.println(max(trace,2*N));

			T--;
		}
	}

	public static int max(int[] trace,int N){
		int max = 0;

		for(int i=0;i<N;i++){
			if(trace[i]>max){
				max = trace[i];
			}
		}

		return max;
	}
}