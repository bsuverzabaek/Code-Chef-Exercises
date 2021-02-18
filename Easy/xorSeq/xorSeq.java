//run as java -ea xorSeq
import java.util.Scanner;

public class xorSeq{
	public static void main(String[] args){
		int N,Q,idx;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		Q = scan.nextInt();

		assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";
		assert(Q>=1 && Q<=100000) : "Q must be 1 <= Q <= 10^5";

		int[] f = new int[100100];
		int[] s = new int[100100];

		for(int i=1;i<=N;i++){
			f[i] = scan.nextInt();
			assert(f[i]>=0 && f[i]<=1000000000) : "All f[i] must be 0 <= f[i] <= 10^9";
			f[N+1] ^= f[i];
		}

		for(int i=1;i<=N+1;i++){
			s[i] = s[i-1]^f[i];
		}

		while(Q>0){
			idx = scan.nextInt();
			assert(idx>=1 && idx<=1000000000) : "k must be 1 <= k <= 10^9";

			idx = ((idx-1)%(N+1))+1;
			System.out.println(s[idx]);

			Q--;
		}
	}
}