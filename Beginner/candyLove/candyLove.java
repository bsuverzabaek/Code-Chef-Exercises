//run as java -ea candyLove
import java.util.Scanner;

public class candyLove{
	public static void main(String[] args) {
		int T,N,sum;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=1000) : "N must be 1 <= N <= 1000";

			int[] A = new int[N];
			sum = 0;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=100) : "A["+i+"] must be 1 <= A[i] <= 100";
				sum += A[i];
			}

			if(sum%2==0){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}

			T--;
		}
	}
}