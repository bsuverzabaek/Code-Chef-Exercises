//run as java -ea chefSecret
import java.util.Scanner;

public class chefSecret{
	public static void main(String[] args){
		int T,N,X,c;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			X = scan.nextInt();

			assert(N>=1 && N<=1000) : "N must be 1 <= N <= 1000";
			assert(X>=1 && X<=1000000) : "X must be 1 <= X <= 1000000";

			int[] A = new int[N];
			c = 0;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000000) : "A["+i+"] must be 1 <= A[i] <= 1000000";

				if(A[i]>=X){
					c++;
				}
			}

			if(c==0){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}

			T--;
		}
	}
}