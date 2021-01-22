//java -ea easyMath
import java.util.Scanner;

public class easyMath{
	public static void main(String[] args){
		int T,N,prod,sum,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			assert(N>=2 && N<=100) : "N must be 2 <= N <= 100";

			int[] A = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=10000) : "A["+i+"] must be 1 <= A[i] <= 10^4";
			}

			ans = 0;

			for(int i=0;i<N;i++){
				for(int j=i+1;j<N;j++){
					prod = A[i] * A[j];
					sum = sumDig(prod);
					ans = max(ans,sum);
				}
			}

			System.out.println(ans);

			T--;
		}
	}

	public static int sumDig(int N){
		int sum = 0;

		while(N>0){
			sum += N%10;
			N /= 10;
		}

		return sum;
	}

	public static int max(int a,int b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
}