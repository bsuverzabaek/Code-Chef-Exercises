//run as java -ea roadsChefLand
import java.util.Scanner;

public class roadsChefLand{
	public static void main(String[] args){
		int T,N,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=200000) : "T must be 1 <= T <= 2*10^5";

		while(T>0){
			N = scan.nextInt();
			assert(N>=2 && N<=1000000000) : "N must be 2 <= N <= 10^9";

			if((N&(N-1))==0){
				System.out.println(-1);
			}else{
				ans = 0;

				for(int i=1;i<=N;i<<=1){
					ans += ((N-i)/(i<<1))*i;
				}

				for(int i=2;i<N;i<<=1){
					ans += i;
				}

				System.out.println(ans);
			}

			T--;
		}
	}
}