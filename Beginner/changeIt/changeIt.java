//run as java -ea changeIt
import java.util.Scanner;

public class changeIt{
	public static void main(String[] args){
		int T,N,x,c;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";

			int[] A = new int[101];
			c = 0;

			for(int i=0;i<101;i++){
				A[i] = 0;
			}

			for(int i=1;i<=N;i++){
				x = scan.nextInt();
				assert(x>=1 && x<=100) : "A["+i+"] must be 1 <= A[i] <= 100";
				A[x]++;

				if(A[x]>c){
					c = A[x];
				}
			}

			System.out.println(N-c);

			T--;
		}
	}
}