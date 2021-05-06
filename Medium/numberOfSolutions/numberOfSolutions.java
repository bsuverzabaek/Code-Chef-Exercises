//run as java -ea numberOfSolutions
import java.util.Scanner;

public class numberOfSolutions{
	public static void main(String[] args){
		int T,upper,d,m,N;
		long ans,MOD;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		MOD = 1000000007;

		while(T>0){
			upper = scan.nextInt();
			d = scan.nextInt();
			m = scan.nextInt();
			N = scan.nextInt();

			assert(upper>=1 && upper<=1000000000) : "upper must be 1 <= upper <= 10^9";
			assert(d>=0 && d<=1000000000) : "d must be 0 <= d <= 10^9";
			assert(m>=0 && m<N) : "m must be 0 <= m < N";
			assert(N>=1 && N<=40) : "N must be 1 <= N <= 40";

			long[] A = new long[N];

			for(int i=0;i<N;i++){
				if(i==0 && d==0){
					A[i] = 1;
				}else if(i==0 || i==1){
					A[i] = i;
				}else{
					A[i] = powMod(i,d,N);
				}
			}

			ans = 0;

			for(int i=0;i<N;i++){
				for(int j=0;j<N;j++){
					for(int k=0;k<N;k++){
						if((A[i]+A[j]+A[k])%N==m){
							ans = (ans + (((noSol(i,upper,N)*noSol(j,upper,N))%MOD)*noSol(k,upper,N))%MOD)%MOD;
						}
					}
				}
			}

			System.out.println(ans);

			T--;
		}
	}

	public static long powMod(int x,int n,int m){
		if(n==0){
			return 1;
		}else{
			long p = powMod(x,n/2,m);

			if((n&1)!=0){
				return (((p*p)%m)*x)%m;
			}else{
				return (p*p)%m;
			}
		}
	}

	public static long noSol(int x,int u,int N){
		if(u%N>=x){
			return u/N+1;
		}else{
			return u/N;
		}
	}
}