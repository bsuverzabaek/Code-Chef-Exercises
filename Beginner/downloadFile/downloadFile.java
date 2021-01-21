//run as java -ea downloadFile
import java.util.Scanner;

public class downloadFile{
	public static void main(String[] args) {
		int TC,N,K,ans;
		Scanner scan = new Scanner(System.in);

		TC = scan.nextInt();
		assert(TC>=1 && TC<=1000) : "T must be 1 <= T <= 1000";

		while(TC>0){
			N = scan.nextInt();
			K = scan.nextInt();
			assert(N>=1 && N<=10) : "N must be 1 <= N <= 10";

			int[] T = new int[N];
			int[] D = new int[N];

			for(int i=0;i<N;i++){
				T[i] = scan.nextInt();
				D[i] = scan.nextInt();
				assert(T[i]>=1 && T[i]<=10) : "T["+i+"] must be 1 <= T[i] <= 10";
				assert(D[i]>=1 && D[i]<=10) : "T["+i+"] must be 1 <= T[i] <= 10";
			}

			int sum = 0;
			for(int i=0;i<N;i++){
				sum += T[i];
			}
			assert(K>=0 && K<=sum) : "K must be 0 <= K <= sum of T[i]";

			ans = 0;

			for(int i=0;i<N;i++){
				if(T[i]<K){
					K -= T[i];
				}else{
					ans += (T[i]-K)*D[i];
					K = 0;
				}
			}

			System.out.println(ans);

			TC--;
		}
	}
}