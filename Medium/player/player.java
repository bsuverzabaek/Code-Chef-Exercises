//run as java -ea player
import java.util.Scanner;

public class player{
	public static void main(String[] args){
		int T,N;
		double ans,nTemp;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=3000) : "N must be 1 <= N <= 3000";

			ans = 0;
			nTemp = N;

			for(int i=1;i<=N;i++){
				ans += nTemp/i;
			}

			System.out.printf("%.1f",ans);
			System.out.println();

			T--;
		}
	}
}