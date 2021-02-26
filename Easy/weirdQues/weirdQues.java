//run as java -ea weirdQues
import java.util.Scanner;

public class weirdQues{
	public static void main(String[] args){
		int T,sumN,N,x,count;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=1000) : "T must be 1 <= T <= 1000";

		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=2 && N<=1000000) : "N must be 2 <= N <= 10^6";
			sumN += N;

			if(T==1){
				assert(sumN<=3000000) : "Sum of N must be <= 3*10^6";
			}

			long[] A = new long[N+1];

			for(int i=0;i<N+1;i++){
				A[i] = 0;
			}

			for(int i=0;i<N;i++){
				x = scan.nextInt();
				assert(x>=1 && x<=1000000) : "Each input must be 1 <= x <= 10^6";
				A[x]++;
			}

			count = 0;

			for(int i=1;i<=N;i++){
				for(int j=1;j<=N;j++){
					if(A[i]<j){
						break;
					}else{
						if(A[j]>=i){
							count++;
						}else{
							continue;
						}
					}
				}
			}

			System.out.println(count);

			T--;
		}
	}
}