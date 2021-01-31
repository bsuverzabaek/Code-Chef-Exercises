//run as java -ea nuclearReact
import java.util.Scanner;

public class nuclearReact{
	public static void main(String[] args){
		int A,N,K;
		Scanner scan = new Scanner(System.in);

		A = scan.nextInt();
		N = scan.nextInt();
		K = scan.nextInt();

		assert(A>=0 && A<=1000000000) : "A must be 0 <= A <= 10^9";
		assert(N>=0 && N<=100) : "N must be 0 <= N <= 100";
		assert(K>=0 && K<=100) : "K must be 0 <= K <= 100";

		for(int i=0;i<K;i++){
			System.out.print(A%(N+1) + " ");
			A /= (N+1);
		}

		System.out.println();
	}
}