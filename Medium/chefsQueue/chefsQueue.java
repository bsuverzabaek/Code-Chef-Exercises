//run as java -ea chefsQueue
import java.util.Scanner;

public class chefsQueue{
	public static void main(String[] args){
		int N,K,x,j,str;
		long MOD,ans;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		K = scan.nextInt();

		assert(N>=1 && N<=1000000) : "N must be 1 <= N <= 1000000";
		assert(K>=2 && K<=100000) : "K must be 2 <= K <= 100000";

		int[] A = new int[N+1];
		int[] B = new int[N+1];

		str = 0;
		ans = 1;
		MOD = 1000000007;

		for(int i=1;i<=N;i++){
			x = scan.nextInt();
			assert(x>=1 && x<=1000000) : "A["+i+"] must be 1 <= A[i] <= 1000000";

			for(j=str;j>0;j--){
				if(x<A[j]){
					ans *= (i-B[j]+1)%MOD;
				}else{
					break;
				}
			}

			A[j+1] = x;
			B[j+1] = i;
			str = j+1;
		}

		System.out.println(ans%MOD);
	}
}