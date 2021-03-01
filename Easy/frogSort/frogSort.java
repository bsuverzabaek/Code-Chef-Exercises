//run as java -ea frogSort
import java.util.Scanner;

public class frogSort{
	public static void main(String[] args){
		int T,N,pos,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=20000) : "T must be 1 <= T <= 2*10^4";

		while(T>0){
			N = scan.nextInt();
			assert(N>=2 && N<=4) : "N must be 2 <= N <= 4";

			int[] W = new int[N];
			int[] L = new int[N];
			int[] X = new int[N];

			for(int i=0;i<N;i++){
				W[i] = scan.nextInt();
				assert(W[i]>=1 && W[i]<=N) : "W["+i+"] must be 1 <= W[i] <= N";
			}

			for(int i=0;i<N;i++){
				L[i] = scan.nextInt();
				assert(L[i]>=1 && L[i]<=5) : "L["+i+"] must be 1 <= L[i] <= N";
				X[i] = i;
			}

			ans = 0;

			for(int i=1;i<=N;i++){
				pos = -1;

				for(int j=0;j<N;j++){
					if(W[j]==i){
						pos = X[j];
					}
				}

				for(int j=0;j<N;j++){
					while(W[j]>i && X[j]<=pos){
						X[j] += L[j];
						ans++;
					}
				}
			}

			System.out.println(ans);

			T--;
		}
	}
}