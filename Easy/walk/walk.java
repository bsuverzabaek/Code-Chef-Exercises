//run as java -ea walk
import java.util.Scanner;

public class walk{
	public static void main(String[] args){
		int T,N,max;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			int[] W = new int[N];
			max = 0;

			for(int i=0;i<N;i++){
				W[i] = scan.nextInt();
				assert(W[i]>=1 && W[i]<=1000000) : "W["+i+"] must be 1 <= W[i] <= 10^6";

				if(W[i]>max){
					max = W[i];
				}
			}

			for(int i=0;i<N;i++){
				if(i+W[i]>max){
					max = i+W[i];
				}
			}

			System.out.println(max);

			T--;
		}
	}
}