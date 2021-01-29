//run as java -ea exEncode
import java.util.Scanner;

public class exEncode{
	public static void main(String[] args){
		int T,N,x;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		for(int t=1;t<=T;t++){
			N = scan.nextInt();
			assert(N>=1 && N<=10000) : "N must be 1 <= N <= 10^4";

			int[] A = new int[N];
			int[] B = new int[N];

			for(int i=0;i<N;i++){
				x = scan.nextInt();
				A[i] = (x<<16)>>16;
				B[i] = (x-A[i])>>16;
			}

			System.out.println("Case "+ t + ":");

			for(int i=0;i<N;i++){
				System.out.print(A[i] + " ");
			}

			System.out.println();

			for(int i=0;i<N;i++){
				System.out.print(B[i] + " ");
			}

			System.out.println();
		}
	}
}