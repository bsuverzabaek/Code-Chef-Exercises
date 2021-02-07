//run as java -ea ballCups
import java.util.Scanner;

public class ballCups{
	public static void main(String[] args){
		int T,N,C,Q,L,R;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <=10";

		while(T>0){
			N = scan.nextInt();
			C = scan.nextInt();
			Q = scan.nextInt();

			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";
			assert(C>=1 && C<=N) : "C must be 1 <= C <= N";
			assert(Q>=1 && Q<=10000) : "Q must be 1 <= Q <= 10^4";

			while(Q>0){
				L = scan.nextInt();
				R = scan.nextInt();
				assert(L>=1 && L<=R && R<=N) : "L and R must be 1 <= L <= R <= N";

				if(L<=C && C<=R){
					C = L+R-C;
				}

				Q--;
			}

			System.out.println(C);

			T--;
		}
	}
}