//run as java -ea kFibo
import java.util.Scanner;

public class kFibo{
	public static void main(String[] args){
		int N,K,s;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		K = scan.nextInt();
		assert((N>=1 && N<=200000) && (K>=1 && K<=200000)) : "N and K must be 1 <= N,K <= 2*10^5";

		if(N<=K){
			System.out.println("1");
		}else{
			int[] A = new int[N];
			s = 0;

			for(int i=0;i<K;i++){
				A[i] = 1;
				s += A[i];
				s %= 1000000007;
			} 

			for(int i=K;i<N;i++){
				s %= 1000000007;
				A[i] = s;
				s += A[i];
				s -= A[i-K];
				s %= 1000000007;
			}

			System.out.println(A[N-1]);
		}
	}
}