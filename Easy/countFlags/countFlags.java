//run as java -ea countFlags
import java.util.Scanner;

public class countFlags{
	public static void main(String[] args){
		int T;
		long N,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10000) : "T must be 1 <= T <= 10000";

		while(T>0){
			N = scan.nextLong();
			assert(N>=1 && N<=10000) : "N must be 1 <= N <= 10000";

			ans = 2*N*(N-1)*(N-1) + N*(N-1)*(N-2) + 2*N*(N-1)*(N-2)*(N-2);
			System.out.println(ans);

			T--;
		}
	}
}