//run as java -ea useLess
import java.util.Scanner;
import java.lang.Math;

public class useLess{
	public static void main(String[] args){
		int T;
		long P,Q,N,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			P = scan.nextLong();
			Q = scan.nextLong();
			N = scan.nextLong();

			assert((P/Q)>=-100 && (P/Q)<=100) : "K must be -100 <= K <= 100";
			assert((P/Q)!=1) : "K must not be 1";
			assert(Q>=1 && Q<=10000) : "Q must be 1 <= Q <= 10^4";
			assert(N>=1 && N<=1000000) : "N must be 1 <= N <= 10^6";

			ans = ((N-1)*Q)/(2*Math.abs(P-Q))+1;
			System.out.println(ans);

			T--;
		}
	}
}