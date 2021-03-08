//run as java -ea oneMore
import java.util.Scanner;

public class oneMore{
	public static void main(String[] args){
		int T,N,M;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			M = scan.nextInt();

			assert(N>=1 && N<=1000) : "N must be 1 <= N <= 1000";
			assert(M>=1 && M<=1000) : "M must be 1 <= M <= 1000";

			System.out.println(N*(M-1)+M*(N-1));

			T--;
		}
	}
}