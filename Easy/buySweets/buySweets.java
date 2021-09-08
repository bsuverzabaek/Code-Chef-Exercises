//run as java -ea buySweets
import java.util.Scanner;

public class buySweets{
	public static void main(String[] args){
		int T,N,X,sum,f;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=20) : "T must be 1 <= T <= 20";

		while(T>0){
			N = scan.nextInt();
			X = scan.nextInt();

			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";
			assert(X>=1 && X<=100) : "X must be 1 <= X <= 100";

			int[] A = new int[N];
			sum = 0;
			f = 0;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=100) : "A["+i+"] must be 1 <= A[i] <= 100";
				sum += A[i];
			}

			for(int i=0;i<N;i++){
				if((sum-A[i])/X==sum/X){
					System.out.println(-1);
					f = 1;
					break;
				}
			}

			if(f==0){
				System.out.println(sum/X);
			}


			T--;
		}
	}
}