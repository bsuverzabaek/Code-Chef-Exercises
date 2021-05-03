//run as java -ea smallestBeautiful
import java.util.Scanner;
import java.lang.Math;

public class smallestBeautiful{
	public static void main(String[] args){
		int T,N,sumN,sum,index,x;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		sumN = 0;

		while(T>0){
			N = scan.nextInt();
			assert(N>=1 && N<=1000000) : "N must be 1 <= N <= 10^6";

			sumN += N;

			if(T==1){
				assert(sumN<=1000000) : "Sum of N must be <= 10^6";
			}

			int[] a = new int[N];

			for(int i=0;i<N;i++){
				a[i] = 1;
			}

			sum = N;
			index = N-1;

			while(true){
				x = (int)Math.sqrt(sum);

				if(x*x==sum){
					break;
				}

				while(a[index]==9){
					index--;
				}

				sum -= a[index]*a[index];
				a[index]++;
				sum += a[index]*a[index];

				for(int i=index+1;i<N;i++){
					sum -= a[i]*a[i];
					a[i] = a[index];
					sum += a[i]*a[i];
				}

				while(index+1!=N){
					index++;
					sum -= a[index]*a[index];
					a[index] = a[index-1];
					sum += a[index]*a[index];
				}
			}

			for(int i=0;i<N;i++){
				System.out.print(a[i]);
			}

			System.out.println();

			T--;
		}
	}
}