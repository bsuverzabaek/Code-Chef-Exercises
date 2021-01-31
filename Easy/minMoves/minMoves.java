//run as java -ea minMoves
import java.util.Scanner;

public class minMoves{
	public static void main(String[] args){
		int T,N,min,count;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";

			int[] W = new int[N];
			min = 10000;
			count = 0;

			for(int i=0;i<N;i++){
				W[i] = scan.nextInt();
				assert(W[i]>=0 && W[i]<=10000) : "W["+i+"] must be 0 <= W[i] <= 10^4";

				if(W[i]<min){
					min = W[i];
				}

				count += W[i];
			}

			System.out.println(count-(N*min));

			T--;
		}
	}
}