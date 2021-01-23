//run as java -ea avgNum
import java.util.Scanner;
import java.lang.Math;

public class avgNum{
	public static void main(String[] args){
		int T,N,K,V,num,sum;
		float x;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			N = scan.nextInt();
			K = scan.nextInt();
			V = scan.nextInt();

			assert(N>=1 && N<=100) : "N must be 1 <= N <= 100";
			assert(K>=1 && K<=100) : "K must be 1 <= K <= 100";
			assert(V>=1 && V<=100000) : "V must be 1 <= V <= 10^5";

			sum = 0;

			for(int i=0;i<N;i++){
				num = scan.nextInt();
				assert(num>=1 && num<=100000) : "A["+i+"] must be 1 <= A[i] <= 10^5";
				sum += num;
			}

			x = (V*(N+K)-sum)/(float)K;

			if(x-Math.ceil(x)==0 && x>0){
				System.out.println((int)x);
			}else{
				System.out.println("-1");
			}

			T--;
		}
	}
}