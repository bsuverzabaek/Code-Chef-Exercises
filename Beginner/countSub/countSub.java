//run as java -ea countSub
import java.util.Scanner;

public class countSub{
	public static void main(String[] args){
		int T,N,subLen,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=5) : "T must be 1 <= T <= 5";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			int[] A = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000000000) : "A["+i+"] must be 1 <= A[i] <= 10^9";
			}

			subLen = 0;
			ans = N;

			for(int i=1;i<N;i++){
				if(A[i]>=A[i-1]){
					subLen++;
				}else{
					ans += (subLen*(subLen+1))/2;
					subLen = 0;
				}
			}

			ans += (subLen*(subLen+1))/2;
			System.out.println(ans);

			T--;
		}
	}
}