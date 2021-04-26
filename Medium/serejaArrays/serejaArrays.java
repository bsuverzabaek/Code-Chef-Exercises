//run as java -ea serejaArrays
import java.util.Scanner;

public class serejaArrays{
	public static void main(String[] args){
		int T,k,n,MOD;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		MOD = 1000000007;

		while(T>0){
			n = scan.nextInt();
			k = scan.nextInt();

			assert(k>=1 && k<=n) : "k must be 1 <= k <= n";
			assert(n>=k && n<=100000) : "n must be k <= n <= 10^5";

			int[] a = new int[n+1];
			a[0] = 1;

			for(int i=1;i<=n;i++){
				if(i-k>=0){
					a[i] = a[i-1]+a[i-k];
				}else{
					a[i] = a[i-1];
				}

				if(a[i]>=MOD){
					a[i] %= MOD;
				}
			}

			System.out.println(a[n]);

			T--;
		}
	}
}