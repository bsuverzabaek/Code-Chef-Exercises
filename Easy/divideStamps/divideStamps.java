//run as java -ea divideStamps
import java.util.Scanner;

public class divideStamps{
	public static void main(String[] args){
		int N,sum;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		assert(N>=1 && N<=100000) : "N must be 1 <= N <= 100000";

		int[] C = new int[N];
		sum = 0;

		for(int i=0;i<N;i++){
			C[i] = scan.nextInt();
			assert(C[i]>=1 && C[i]<=1000000000) : "C["+i+"] must be 1 <= C[i] <= 10^9";

			sum += C[i];
		}

		if(sum==N*(N+1)/2){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}