//run as java -ea devuArray
import java.util.Scanner;

public class devuArray{
	public static void main(String[] args){
		int N,Q,t,min,max;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		Q = scan.nextInt();

		assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";
		assert(Q>=1 && Q<=100000) : "Q must be 1 <= Q <= 10^5";

		int[] A = new int[N];

		for(int i=0;i<N;i++){
			A[i] = scan.nextInt();
		}

		min = A[0];
		max = A[0];

		for(int i=0;i<N;i++){
			if(A[i]>max){
				max = A[i];
			}

			if(A[i]<min){
				min = A[i];
			}
		}

		while(Q>0){
			t = scan.nextInt();
			assert(t>=0 && t<=1000000000) : "t must be 0 <= t <= 10^9";

			if((t>=min) && (t<=max)){
				System.out.println("Yes");
			}else{
				System.out.println("No");
			}

			Q--;
		}
	}
}