//run as java -ea beauArray
import java.util.Scanner;

public class beauArray{
	public static void main(String[] args){
		int T,N,X,sumN,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100000) : "T must be 1 <= T <= 10^5";

		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=100000) : "N must be 1 <= N <= 10^5";
			sumN += N;

			if(T==1){
				assert(sumN>=1 && sumN<=1000000) : "Sum on N must be 1 <= sumN <= 10^6";
			}

			int[] A = new int[4];

			for(int i=0;i<4;i++){
				A[i] = 0;
			}

			for(int i=0;i<N;i++){
				X = scan.nextInt();
				assert(X>=0 && X<=1000000000) : "All A[i] must be 0 <= A[i] <= 10^9";
				A[X%4] += 1;
			}

			if((A[1]+2*A[2]+3*A[3])%4==0){
				ans = min(A[1],A[3]);

				A[1] -= ans;
				A[3] -= ans;
				
				ans += A[2]/2;
				A[2] %= 2;

				if(A[2]!=0){
					ans += 2;
					A[2] = 0;

					if(A[3]!=0){
						A[3] -= 2;
					}

					if(A[1]!=0){
						A[1] -= 2;
					}
				}

				if(A[1]!=0){
					ans += (A[1]/4)*3;
				}

				if(A[3]!=0){
					ans += (A[3]/4)*3;
				}

				System.out.println(ans);
			}else{
				System.out.println(-1);
			}

			T--;
		}
	}

	public static int min(int a,int b){
		if(a<b){
			return a;
		}else{
			return b;
		}
	}
}