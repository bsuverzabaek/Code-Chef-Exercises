//run as java -ea maxRemain
import java.util.Scanner;
import java.util.Arrays;

public class maxRemain{
	public static void main(String[] args){
		int N,i;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		assert(N>=2 && N<=100000) : "N must be 2 <= N <= 10^5";

		int[] A = new int[N];

		for(i=0;i<N;i++){
			A[i] = scan.nextInt();
			assert(A[i]>=1 && A[i]<=1000000000) : "A["+i+"] must be 1 <= A[i] <= 10^9";
		}

		Arrays.sort(A);

		for(i=0;i<N-1;i++){
			if(A[i]!=A[i+1]){
				break;
			}
		}

		if(i==N-1){
			System.out.println(0);
		}else{
			for(i=N-2;i>=0;i--){
				if(A[i]<A[N-1]){
					System.out.println(A[i]);
					break;
				}
			}
		}
	}
}