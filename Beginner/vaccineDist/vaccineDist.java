//run as java -ea vaccineDist
import java.util.Scanner;
import java.lang.Math;

public class vaccineDist{
	public static void main(String[] args){
		int T,N,D,risk,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			D = scan.nextInt();

			assert(N>=1 && N<=10000) : "N must be 1 <= N <= 10^4";
			assert(D>=1 && D<=100000) : "D must be 1 <= D <= 10^5";

			int[] A = new int[N];
			risk = 0;
			ans = 0;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=100) : "A["+i+"] must be 1 <= A[i] <= 100";

				if(A[i]>=80 || A[i]<=9){
					risk++;
				}
			}

			ans += Math.ceil((double)risk/D) + Math.ceil((double)(N-risk)/D);
			System.out.println(ans);

			T--;
		}
	}
}