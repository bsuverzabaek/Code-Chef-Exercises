//run as java -ea andOp
import java.util.Scanner;

public class andOp{
	public static void main(String[] args){
		int N;
		long max,temp;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		assert(N>=2 && N<=300000) : "N must be 2 <= N <= 3*10^5";

		long[] A = new long[300001];

		for(int i=0;i<N;i++){
			A[i] = scan.nextLong();
			assert(A[i]>=0 && A[i]<=1000000000) : "A["+i+"] must be 0 <= A[i] <= 10^9";
		}

		max = (A[0]&A[1]);

		for(int i=0;i<N;i++){
			if(max>A[i]){
				continue;
			}

			for(int j=i+1;j<=N;j++){
				temp = (A[i]&A[j]);

				if(temp>max){
					max = temp;
				}
			}
		}

		System.out.println(max);
	}
}