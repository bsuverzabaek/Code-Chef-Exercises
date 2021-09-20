//run as java -ea chefEasy
import java.util.Scanner;
import java.util.Arrays;

public class chefEasy{
	public static void main(String[] args){
		int T,N,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			int[] A = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000000000) : "A["+i+"] must be 1 <= A[i] <= 10^9";
			}

			Arrays.sort(A);
			ans = 0;

			for(int i=0;i<N;i++){
				if(i%2==0){
					ans += A[i];
				}
			}

			System.out.println(ans);

			T--;
		}
	}
}