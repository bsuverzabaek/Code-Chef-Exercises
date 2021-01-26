//run as java -ea plusMul
import java.util.Scanner;

public class plusMul{
	public static void main(String[] args){
		int T,N,a,b;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=20) : "T must be 1 <= T <= 20";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=40000) : "N must be 1 <= N <= 40000";

			int[] A = new int[N];
			a = 0;
			b = 0;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=0 && A[i]<=1000000000) : "A["+i+"] must be 0 <= A[i] <= 10^9";

				if(A[i]==0){
					b++;
				}
				if(A[i]==2){
					a++;
				}
			}

			System.out.println(((b-1)*b/2+(a-1)*a)/2);

			T--;
		}
	}
}