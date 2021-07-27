//run as java -ea sedSequences
import java.util.Scanner;

public class sedSequences{
	public static void main(String[] args){
		int T,N,K,sum;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";
			assert(K>=1 && K<=100000) : "K must be 1 <= K <= 10^5";

			int[] A = new int[N];
			sum = 0;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=100000) : "A["+i+"] must be 1 <= A[i] <= 10^5";
				sum += A[i];
			}

			if(sum%K==0){
				System.out.println(0);
			}else{
				System.out.println(1);
			}

			T--;
		}
	}
}