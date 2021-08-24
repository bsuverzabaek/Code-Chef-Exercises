//run as java -ea chefDetective
import java.util.Scanner;

public class chefDetective{
	public static void main(String[] args){
		int N;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

		int[] R = new int[N];
		int[] B = new int[100001];

		for(int i=0;i<100001;i++){
			B[i] = 0;
		}

		for(int i=0;i<N;i++){
			R[i] = scan.nextInt();
			assert(R[i]>=0 && R[i]<=N) : "R["+i+"] must be 0 <= R[i] <= N";
			B[R[i]] = 1;
		}

		for(int i=0;i<=N;i++){
			if(B[i]==0){
				System.out.print(i + " ");
			}
		}

		System.out.println();
	}
}