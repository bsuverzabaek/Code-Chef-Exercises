//run as java -ea chefWork
import java.util.Scanner;

public class chefWork{
	public static void main(String[] args){
		int T,N,K,count,sum;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=1 && N<=1000) : "N must be 1 <= N <= 10^3";
			assert(K>=1 && K<=1000) : "K must be 1 <= K <= 10^3";

			int[] W = new int[N];
			sum = 0;
			count = 1;

			for(int i=0;i<N;i++){
				W[i] = scan.nextInt();
				assert(W[i]>=1 && W[i]<=1000) : "W["+i+"] must be 1 <= W[i] <= 10^3";

				if(W[i]>K){
					count = -1;
					break;
				}else{
					if(sum+W[i]>K){
						count++;
						sum = W[i];
					}else{
						sum += W[i];
					}
				}
			}

			System.out.println(count);
			
			T--;
		}
	}
}