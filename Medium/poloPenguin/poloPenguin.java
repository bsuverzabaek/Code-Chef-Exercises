//run as java -ea poloPenguin
import java.util.Scanner;

public class poloPenguin{
	public static void main(String[] args){
		int T,N,sumN;
		long prev,temp,ans,ones,p;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 100000";

		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 100000";

			sumN += N;

			if(T==1){
				assert(sumN<=100000) : "Sum of N must be <=100000";
			}

			long[] A = new long[N];
			prev = 0;

			for(int i=0;i<N;i++){
				temp = scan.nextLong();
				assert(temp>=0 && temp<=1000000000) : "A["+i+"] must be 0 <= A[i] <= 10^9";
				A[i] = prev^temp;
				prev = A[i];
			}

			ans = 0;

			for(int i=0;i<32;i++){
				p = 1;
				p <<= i;
				ones = 0;

				for(int j=0;j<N;j++){
					if((p&A[j])!=0){
						ones++;
					}
				}

				ans += (ones)*(N+1-ones)*p;
			}

			System.out.println(ans);

			T--;
		}
	}
}