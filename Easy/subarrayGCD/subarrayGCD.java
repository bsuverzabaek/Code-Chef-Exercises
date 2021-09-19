//run as java -ea subarrayGCD
import java.util.Scanner;

public class subarrayGCD{
	public static void main(String[] args){
		int T,N,res,ans;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=2 && N<=100000) : "N must be 2 <= N <= 10^5";

			int[] A = new int[N];
			ans = 0;

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=100000) : "A["+i+"] must be 1 <= A[i] <= 10^5";
			}

			res = A[0];

			for(int i=1;i<N;i++){
				res = gcd(res,A[i]);

				if(res==1){
					ans = N;
					break;
				}
			}

			if(ans!=0){
				System.out.println(N);
			}else{
				System.out.println(-1);
			}

			T--;
		}
	}

	public static int gcd(int a,int b){
		if(b==0){
			return a;
		}

		return gcd(b,a%b);
	}
}