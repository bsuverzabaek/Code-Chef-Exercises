//run as java -ea smallArray
import java.util.Scanner;
import java.lang.Math;

public class smallArray{
	public static void main(String[] args){
		int N,X;
		double sum,max_sum,min_end,total;
		Scanner scan = new Scanner(System.in);

		N = scan.nextInt();
		X = scan.nextInt();

		assert(N>=1 && N<=1000) : "N must be 1 <= N <= 10^3";
		assert(Math.abs(X)>=1 && Math.abs(X)<=1000) : "X must be 1 <= |X| <= 10^3";

		sum = 0;
		double[] A = new double[N];

		for(int i=0;i<N;i++){
			A[i] = scan.nextDouble();
			assert(Math.abs(A[i])<=1000) : "|A["+i+"]| must be |A[i]| <= 10^3";
			sum += A[i];
		}

		max_sum = -100000;
		min_end = -100000;

		for(int i=0;i<N;i++){
			if(min_end<0){
				min_end = A[i];
			}else{
				min_end += A[i];
			}

			max_sum = max(min_end,max_sum);
		}

		total = (sum-max_sum)+(max_sum/X);
		System.out.format("%.2f\n",total);
	}

	public static double max(double a,double b){
		if(a>b){
			return a;
		}else{
			return b;
		}
	}
}