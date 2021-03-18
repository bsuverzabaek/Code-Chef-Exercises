//run as java -ea usefulNum
import java.util.Scanner;

public class usefulNum{
	public static void main(String[] args){
		int T,N,tot,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			int[] A = new int[100001];
			int[] count = new int[100001];
			int[] factors = new int[100001];

			for(int i=0;i<100001;i++){
				count[i] = 0;
				factors[i] = 0;
			}

			for(int i=1;i<=N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=100000) : "A["+i+"] must be 1 <= A[i] <= 10^5";
				count[A[i]]++;
			}

			ans = 0;

			for(int i=2;i<100001;i++){
				if(factors[i]==0){
					for(int j=i;j<100001;j+=i){
						factors[j]++;
					}
				}

				tot = 0;

				for(int j=i;j<100001;j+=i){
					tot += count[j];
				}

				ans = max(ans,tot*factors[i]);
			}

			System.out.println(ans);

			T--;
		}
	}

	public static int max(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
}