import java.util.Scanner;
import java.util.Arrays;
import java.lang.Math;

public class maxDiff{
	public static void main(String[] args) {
		int T,N,K,sum,S1,S2;
		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>100){
				System.out.println("T must be 1 <= T <= 100");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				N = scan.nextInt();
				K = scan.nextInt();

				if(K<=0 || K>=N){
					System.out.println("K must be 1 <= K < N");
				}else if(N<=K || N>100){
					System.out.println("N must be K < N <= 100");
				}else{
					break;
				}
			}

			int[] W = new int[N];

			for(int i=0;i<N;i++){
				while(true){
					W[i] = scan.nextInt();

					if(W[i]<=0 || W[i]>100000){
						System.out.println("W["+i+"] must be 1 <= W[i] <= 10^5");
					}else{
						break;
					}
				}
			}

			Arrays.sort(W);

			sum = 0;
			S1 = 0;
			S2 = 0;

			for(int i=0;i<N;i++){
				sum += W[i];
			}

			for(int i=0;i<K;i++){
				S1 += W[i];
			}

			for(int i=N-1;i>=N-K;i--){
				S2 += W[i];
			}

			System.out.println(max(Math.abs(S1-(sum-S1)),Math.abs(S2-(sum-S2))));

			T--;
		}
	}

	public static int max(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
}