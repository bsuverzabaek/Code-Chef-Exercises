//run as java -ea chefGift
import java.util.Scanner;

public class chefGift{
	public static void main(String[] args){
		int T,N;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=10) : "N must be 1 <= N <= 10";

			int[] A = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=-9 && A[i]<=9) : "A["+i+"] must be -9 <= A[i] <= 9";
			}

			long[] sol1 = new long[N];
			long[] sol2 = new long[N];

			sol1[0] = A[0];
			sol2[0] = A[0];

			for(int i=1;i<N;i++){
				if(A[i]<0){
					sol1[i] = min(sol1[i-1]+A[i],sol2[i-1]*A[i]);
					sol2[i] = max(sol2[i-1]-A[i],sol1[i-1]*A[i]);
				}else{
					sol1[i] = min(sol1[i-1]-A[i],sol1[i-1]*A[i]);
					sol2[i] = max(sol2[i-1]+A[i],sol2[i-1]*A[i]);
				}
			}

			System.out.println(sol1[N-1]);

			T--;
		}
	}

	public static long min(long a,long b){
		return (a<b?a:b);
	}

	public static long max(long a,long b){
		return (a>b?a:b);
	}
}