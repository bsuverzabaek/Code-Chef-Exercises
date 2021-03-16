//run as java -ea moveCoins
import java.util.Scanner;
import java.util.Arrays;

public class moveCoins{
	public static void main(String[] args){
		int T,N,K,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=1 && N<=1000) : "N must be 1 <= N <= 1000";
			assert(K>=1 && K<=1000) : "K must be 1 <= K <= 1000";

			int[] X = new int[N+1];
			X[0] = 0;

			ans = 0;

			for(int i=1;i<=N;i++){
				X[i] = scan.nextInt();
				assert(X[i]>=1 && X[i]<=1000) : "X["+i+"] must be 1 <= X[i] <= 1000";
			}

			Arrays.sort(X);

			for(int i=N;i>=1;i--){
				ans += (X[i]-X[i-1]-1)*((N-i)/K+1);
			}

			System.out.println(ans);

			T--;
		}
	}
}