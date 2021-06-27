//run as java -ea devuGrapes
import java.util.Scanner;

public class devuGrapes{
	public static void main(String[] args){
		int T,N,K,a,count,rem;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";
			assert(K>=1 && K<=1000000000) : "K must be 1 <= K <= 10^9";

			count = 0;
			rem = 0;

			for(int i=0;i<N;i++){
				a = scan.nextInt();
				assert(a>=1 && a<=1000000000) : "Number of grapes must be 1 <= g <= 10^9";

				if(a/K==0){
					count += (K-a);
				}else{
					rem = a%K;			
				}

				if(rem<=K/2){
					count += rem;
				}else{
					count += (K-rem);
				}
			}

			System.out.println(count);

			T--;
		}
	}
}