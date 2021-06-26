//run as java -ea chefPriceControl
import java.util.Scanner;

public class chefPriceControl{
	public static void main(String[] args){
		int T,N,K,sum;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=1 && N<=10000) : "N must be 1 <= N <= 10000";
			assert(K>=1 && K<=1000) : "K must be 1 <= K <= 1000";

			int[] P = new int[N];
			sum = 0;

			for(int i=0;i<N;i++){
				P[i] = scan.nextInt();
				assert(P[i]>=1 && P[i]<=1000) : "P["+i+"] must be 1 <= P[i] <= 1000";

				if(P[i]>K){
					sum += P[i]-K;
				}
			}

			System.out.println(sum);
			
			T--;
		}
	}
}