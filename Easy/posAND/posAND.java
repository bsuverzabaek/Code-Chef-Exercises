//run as java -ea posAND
import java.util.Scanner;

public class posAND{
	public static void main(String[] args){
		int T,N,sumN,z;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";

			if(T==1){
				assert(sumN<=1000000) : "Sum of N must be <= 10^6";
			}

			if(N==1){
				System.out.println(1);
			}else if((N&-N)==N){
				System.out.println(-1);
			}else{
				int[] ans = new int[100000];
				
				ans[0] = 2;
				ans[1] = 3;
				ans[2] = 1;

				z = 3;

				for(int i=4;i<=N;i++){
					ans[z] = i;
					z++;
				}

				for(int i=3;i<N;i++){
					if((ans[i]&ans[i-1])==0){
						int t = ans[i+1];
						ans[i+1] = ans[i];
						ans[i] = t;
					}
				}

				for(int i=0;i<N;i++){
					System.out.print(ans[i] + " ");
				}

				System.out.println();
			}

			T--;
		}
	}
}