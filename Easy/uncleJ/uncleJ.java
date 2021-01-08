import java.util.Scanner;
import java.util.Arrays;

public class uncleJ{
	public static void main(String[] args) {
		int T;
		int N;
		int K;
		int temp = 0;

		Scanner scan = new Scanner(System.in);

		while(true){
			T = scan.nextInt();

			if(T<=0 || T>1000){
				System.out.println("T must be 1 <= T <= 1000");
			}else{
				break;
			}
		}

		while(T>0){

			while(true){
				N = scan.nextInt();

				if(N<=0 || N>100){
					System.out.println("N must be 1 <= N <= 100");
				}else{
					break;
				}
			}

			int[] A = new int[N];

			for(int i=0;i<N;i++){
				while(true){
					A[i] = scan.nextInt();

					if(A[i]<=0 || A[i]>1000000000){
						System.out.println("A["+i+"] must be 1 <= A[i] <= 10^9");
					}else{
						break;
					}
				}
			}

			while(true){
				K = scan.nextInt();

				if(K<=0 || K>N){
					System.out.println("K must be 1 <= K <= N");
				}else{
					break;
				}
			}

			for(int i=0;i<N;i++){
				if(K==i+1){
					temp = A[i];
				}
			}

			Arrays.sort(A);

			for(int i=0;i<N;i++){
				if(A[i]==temp){
					System.out.println(i+1);
				}
			}

			T--;
		}
	}
}