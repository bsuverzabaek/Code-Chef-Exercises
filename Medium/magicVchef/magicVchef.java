//run as java -ea magicVchef
import java.util.Scanner;

public class magicVchef{
	public static void main(String[] args){
		int T;
		long N,K;
		double prob;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=200000) : "T must be 1 <= T <= 2*10^5";

		while(T>0){
			N = scan.nextLong();
			K = scan.nextLong();

			assert(N>=1 && N<=1000000000000000000L) : "N must be 1 <= N <= 10^18";
			assert(K>=0 && K<=1000000000) : "K must be 0 <= K <= 10^9";

			if(K>=0 && N>2){
				if(K==1 && (N&3)==2){
					N = (N>>1)+1;
				}else{
					while(K>0 && N>1){
						N = (N+1)>>1;
						K--;
					}
				}
			}

			prob = 1.0/(double) N;

			System.out.printf("%.8f",prob);
			System.out.println();

			T--;
		}
	}
}