//run as java -ea changBit
import java.util.Scanner;

public class changBit{
	public static void main(String[] args){
		int T,N,d;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			int[] A = new int[N];
			d = 0;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=0 && A[i]<=1000000000) : "A["+i+"] must be 0 <= A[i] <= 10^9";
				d |= A[i];
			}

			System.out.println(d);

			T--;
		}
	}
}