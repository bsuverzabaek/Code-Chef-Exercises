//run as java -ea cutBoard
import java.util.Scanner;

public class cutBoard{
	public static void main(String[] args){
		int T,N,M;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=64) : "T must be 1 <= T <= 64";

		while(T>0){
			N = scan.nextInt();
			M = scan.nextInt();

			assert(N>=1 && N<=8) : "N must be 1 <= N <= 8";
			assert(M>=1 && M<=8) : "M must be 1 <= M <= 8";

			System.out.println((N-1)*(M-1));

			T--;
		}
	}
}