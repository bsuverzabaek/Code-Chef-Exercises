//run as java -ea chefSteps
import java.util.Scanner;

public class chefSteps{
	public static void main(String[] args){
		int T,N,K;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=1 && N<=1000) : "N must be 1 <= N <= 1000";
			assert(K>=1 && K<=1000000000) : "K must be 1 <= K <= 10^9";

			int[] D = new int[N];

			for(int i=0;i<N;i++){
				D[i] = scan.nextInt();
				assert(D[i]>=1 && D[i]<=1000000000) : "D["+i+"] must be 1 <= D[i] <= 10^9";

				if(D[i]%K==0){
					System.out.print("1");
				}else{
					System.out.print("0");
				}
			}

			System.out.println();
			
			T--;
		}
	}
}