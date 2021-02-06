//run as java -ea walkAxis
import java.util.Scanner;

public class walkAxis{
	public static void main(String[] args){
		int T;
		long N,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			N = scan.nextLong();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			ans = 0;
			ans = N+(N*(N+1)/2);

			System.out.println(ans);

			T--;
		}
	}
}