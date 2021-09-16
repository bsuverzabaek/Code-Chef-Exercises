//run as java -ea evenSum
import java.util.Scanner;

public class evenSum{
	public static void main(String[] args){
		int T,N,sum;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			int[] A = new int[N];
			sum = 0;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000000000) : "A["+i+"] must be 1 <= A[i] <= 10^9";
				sum += A[i];
			}

			if(sum%2==0){
				System.out.println("1");
			}else{
				System.out.println("2");
			}

			T--;
		}
	}
}