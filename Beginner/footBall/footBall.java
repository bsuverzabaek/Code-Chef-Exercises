//run as java -ea footBall
import java.util.Scanner;

public class footBall{
	public static void main(String[] args){
		int T,N,sum,max;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=150) : "N must be 1 <= N <= 150";

			int[] A = new int[N];
			int[] B = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=0 && A[i]<=50) : "A["+i+"] must be 0 <= A[i] <= 50";
			}

			for(int i=0;i<N;i++){
				B[i] = scan.nextInt();
				assert(B[i]>=0 && B[i]<=50) : "B["+i+"] must be 0 <= B[i] <= 50";
			}

			sum = 0;
			max = 0;

			for(int i=0;i<N;i++){
				sum = (A[i]*20-B[i]*10);

				if(max<sum){
					max = sum;
				}
			}

			System.out.println(max);

			T--;
		}
	}
}