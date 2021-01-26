//run as java -ea chefSum
import java.util.Scanner;

public class chefSum{
	public static void main(String[] args){
		int T,N,K,flag;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=2 && N<=10000) : "N must be 2 <= N <= 10^4";
			assert(K>=1 && K<=1000000000) : "K must be 1 <= K <= 10^9";

			int[] A = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000000000) : "A["+i+"] must be 1 <= A[i] <= 10^9";
			}

			flag = 0;

			outer:
				for(int i=0;i<N-1;i++){
					for(int j=i+1;j<N;j++){
						if(A[i]+A[j]==K){
							flag = 1;
							break outer;
						}
					}
				}

			if(flag==1){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

			T--;
		}
	}
}