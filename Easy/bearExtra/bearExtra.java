//run as java -ea bearExtra
import java.util.Scanner;

public class bearExtra{
	public static void main(String[] args){
		int T,N;
		long A,sum,min,nextMin,max,nextMax;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			assert(N>=3 && N<=100000) : "N must be 3 <= N <= 10^5";

			sum = 0;
			min = 1000000001;
			nextMin = 1000000001;
			max = 0;
			nextMax = 0;

			while(N>0){
				A = scan.nextLong();
				assert(A>=1 && A<=1000000000) : "All A[i] must be 1 <= A[i] <= 10^9";

				sum += A;

				if(min>A){
					nextMin = min;
					min = A;
				}else if(nextMin>A){
					nextMin = A;
				}

				if(max<A){
					nextMax = max;
					max = A;
				}else if(nextMax<A){
					nextMax = A;
				}

				N--;
			}

			if((sum-totalSum(nextMin,max))==min){
				System.out.println(min);
			}else if((sum-totalSum(min,nextMax))==max){
				System.out.println(max);
			}else{
				System.out.println(sum-totalSum(min,max));
			}

			T--;
		}
	}

	public static long totalSum(long min,long max){
		return ((max*(max+1))/2) - ((min*(min-1))/2);
	}
}