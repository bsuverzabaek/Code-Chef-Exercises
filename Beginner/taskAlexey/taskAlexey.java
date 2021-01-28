//run as java -ea taskAlexey
import java.util.Scanner;

public class taskAlexey{
	public static void main(String[] args){
		int T,N,min;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=2 && N<=500) : "N must be 2 <= N <= 500";

			int[] A = new int[N];

			for(int i=0;i<N;i++){
				A[i] = scan.nextInt();
				assert(A[i]>=1 && A[i]<=1000000000) : "A["+i+"] must be 1 <= A[i] <= 10^9";
			}

			min = 1000000000;

			for(int i=0;i<N;i++){
				for(int j=i+1;j<N;j++){
					if(A[i]*A[j]/gcd(A[i],A[j])<min){
						min = A[i]*A[j]/gcd(A[i],A[j]);
					}
				}
			}

			System.out.println(min);

			T--;
		}
	}

	public static int gcd(int A,int B){
		if(A==0){
			return B;
		}else if(B==0){
			return A;
		}else{
			int rem = A%B;
			A = B;
			B = rem;
			return gcd(A,B);
		}
	}

	public static int lcm(int A,int B){
		int ans;
		int gcf = gcd(A,B);

		if(A%gcf==0){
			ans = A/gcf;
			ans *= B;
			return ans;
		}else{
			ans = B/gcf;
			ans *= A;
			return ans;
		}
	}
}