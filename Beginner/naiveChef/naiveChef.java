//run as java -ea naiveChef
import java.util.Scanner;

public class naiveChef{
	public static void main(String[] args){
		int T,N,A,B,r1,r2;
		double flag;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=70) : "T must be 1 <= T <= 70";

		while(T>0){
			N = scan.nextInt();
			A = scan.nextInt();
			B = scan.nextInt();

			assert(N>=1 && N<=10000) : "N must be 1 <= N <= 10^4";
			assert(A>=1 && A<=N) : "A must be 1 <= A <= N";
			assert(B>=1 && B<=N) : "B must be 1 <= B <= N";

			int[] x = new int[N];
			r1 = 0;
			r2 = 0;

			for(int i=0;i<N;i++){
				x[i] = scan.nextInt();
				assert(x[i]>=1 && x[i]<=N) : "x["+i+"] must be 1 <= x[i] <= N";

				if(x[i]==A){
					r1++;
				}

				if(x[i]==B){
					r2++;
				}
			}

			flag = ((double)r1/N)*((double)r2/N);

			System.out.printf("%.10f",flag);
			System.out.println();

			T--;
		}
	}
}