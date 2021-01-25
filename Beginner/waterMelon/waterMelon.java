//run as java -ea waterMelon
import java.util.Scanner;
import java.lang.Math;

public class waterMelon{
	public static void main(String[] args){
		int T,N,sum;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=10) : "N must be 1 <= N <= 10";

			int[] A = new int[N];
			sum = 0;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(Math.abs(A[i])<=100) : "Absolute value of A["+i+"] must be <= 100";

				sum += A[i];
			}

			if(sum>=0){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}

			T--;
		}
	}
}