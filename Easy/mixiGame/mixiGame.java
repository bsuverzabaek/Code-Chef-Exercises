//run as java -ea mixiGame
import java.util.Scanner;
import java.lang.Math;

public class mixiGame{
	public static void main(String[] args){
		int T,N,K,sum;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=50) : "T must be 1 <= T <= 50";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();

			assert(N>=1 && N<=30000) : "N must be 1 <= N <= 30000";
			assert(K>=0 && K<=30000) : "K must be 1 <= K <= 30000";

			int[] A = new int[N];
			sum = 0;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]==0 || A[i]==1) : "A["+i+"] must be either 0 or 1";

				if(A[i]!=0){
					if(i%2!=0 && sum>0){
						sum--;
					}else if(i%2!=0){
						sum++;
					}else if(sum<0){
						sum--;
					}else{
						sum++;
					}
				}
			}

			if(Math.abs(sum)<K){
				System.out.println(2);
			}else{
				System.out.println(1);
			}

			T--;
		}
	}
}