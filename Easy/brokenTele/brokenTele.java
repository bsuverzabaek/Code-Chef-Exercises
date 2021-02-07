//run as java -ea brokenTele
import java.util.Scanner;

public class brokenTele{
	public static void main(String[] args){
		int T,N,count;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=5) : "T must be 1 <= T <= 5";

		while(T>0){
			N = scan.nextInt();
			assert(N>=2 && N<=100000) : "N must be 1 <= N <= 10^5";

			int[] A = new int[N];
			count = 0;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000000000) : "A["+i+"] must be 1 <= A[i] <= 10^9";
			}

			for(int i=1;i<N-1;i++){
				if(A[i]!=A[i-1] || A[i]!=A[i+1]){
					count++;
				}

				if(i==1 && A[i-1]!=A[i]){
					count++;
				}

				if(i==N-2 && A[i+1]!=A[i]){
					count++;
				}
			}

			System.out.println(count);

			T--;
		}
	}
}