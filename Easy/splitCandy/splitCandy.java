//run as java -ea splitCandy
import java.util.Scanner;

public class splitCandy{
	public static void main(String[] args){
		int T;
		long N,K;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextLong();
			K = scan.nextLong();

			assert(N>=0 && N<=8589934591L) : "N must be 0 <= N <= 2^33 - 1";
			assert(K>=0 && K<=8589934591L) : "K must be 0 <= K <= 2^33 - 1";

			if(K==0){
				System.out.println(0 + " " + N);
			}else{
				System.out.println(N/K + " " + N%K);
			}

			T--;
		}
	}
}