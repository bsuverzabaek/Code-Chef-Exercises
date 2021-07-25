//run as java -ea appyContest
import java.util.Scanner;

public class appyContest{
	public static void main(String[] args){
		int T,A,B;
		long K,N,count;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=15) : "T must be 1 <= T <= 15";

		while(T>0){
			N = scan.nextLong();
			A = scan.nextInt();
			B = scan.nextInt();
			K = scan.nextLong();

			assert(K>=1 && K<=N) : "K must be 1 <= K <= N";
			assert(N<=1000000000000000000L) : "N must be <= 10^18";
			assert(A>=1 && A<=1000000000) : "A must be 1 <= A <= 10^9";
			assert(B>=1 && B<=1000000000) : "B must be 1 <= B <= 10^9";

			if(A%B==0){
				count = N/B-N/A;
			}else if(B%A==0){
				count = N/A-N/B;
			}else{
				count = N/A+N/B-2*(N/(A*B));
			}

			if(count>=K){
				System.out.println("Win");
			}else{
				System.out.println("Lose");
			}

			T--;
		}
	}
}