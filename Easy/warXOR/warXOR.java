//run as java -ea warXOR
import java.util.Scanner;

public class warXOR{
	public static void main(String[] args){
		int T,x;
		long N,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextLong();
			assert(N>=1 && N<=100000) : "N msut be 1 <= N <= 10^5";

			long[] A = new long[1000002];
			long[] C = new long[2];

			for(int i=0;i<1000002;i++){
				A[i] = 0;
			}

			for(int i=0;i<2;i++){
				C[i] = 0;
			}

			ans = 0;

			for(int i=0;i<N;i++){
				x = scan.nextInt();

				assert(x>=1 && x<=1000000) : "Each element must be 1 <= x <= 10^6";

				if(x%2==0){
					ans += C[0];
				}else{
					ans += C[1];
				}

				ans -= A[x];
				ans -= A[x^2];
				C[x%2]++;
				A[x]++;
			}

			System.out.println(ans);

			T--;
		}
	}
}