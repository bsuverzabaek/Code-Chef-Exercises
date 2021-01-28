//run as java -ea reduceOne
import java.util.Scanner;

public class reduceOne{
	public static void main(String[] args){
		int T,N;
		long a;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 100000";

		long[] A = new long[1000001];

		a = 1;
		A[0] = 1;

		for(int i=1;i<1000001;i++){
			a = (a*(i+1)) % 1000000007;
			A[i] = a - 1;
		}

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=1000000) : "N must be 1 <= N <= 1000000";

			System.out.println(A[N]);

			T--;
		}
	}
}