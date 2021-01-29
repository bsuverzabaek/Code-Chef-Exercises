//run as java -ea rupsaGame
import java.util.Scanner;

public class rupsaGame{
	public static void main(String[] args){
		int T,N;
		long P,Q,R,S;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 100000";

			P = scan.nextLong();
			assert(P>=1 && P<=1000000000) : "Integers must be 1 <= P <= 10^9";

			Q = 2 * P;
			R = 0;
			S = 2;

			for(int i=1;i<=N;i++){
				P = scan.nextLong();
				assert(P>=1 && P<=1000000000) : "Integers must be 1 <= P <= 10^9";

				R *= 2;
				R += Q*P;
				R %= 1000000007;

				Q += S*P;
				Q %= 1000000007;

				S *= 2;
				S %= 1000000007;
			}

			System.out.println(R);

			T--;
		}
	}
}