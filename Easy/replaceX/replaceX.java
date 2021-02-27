//run as java -ea replaceX
import java.util.Scanner;

public class replaceX{
	public static void main(String[] args){
		int T,sumN;
		long N,X,p,k,a,lct,xct;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		sumN = 0;

		while(T>0){
			N = scan.nextLong();
			X = scan.nextLong();
			p = scan.nextLong();
			k = scan.nextLong();

			assert(p>=1 && p<=N && k>=1 && k<=N) : "p and k must be 1 <= p,k <= N";
			assert(X>=0 && X<=1000000000) : "X must be 0 <= X <= 10^9";

			sumN += N;

			if(T==1){
				assert(sumN<=400000) : "Sum of N must be <=4*10^5";
			}

			lct = 0;
			xct = 0;

			for(long i=0;i<N;i++){
				a = scan.nextLong();
				assert(a>=0 && a<=1000000000) : "Each element must be 0 <= A[i] <= 10^9";

				if(a<X){
					lct++;
				}

				if(a==X){
					xct++;
				}
			}

			if(p>lct && p<=lct+xct){
				System.out.println(0);
			}else{
				if((k>p && lct+1>p) || (k<p && lct+xct<p)){
					System.out.println(-1);
				}else{
					if(p<=lct){
						System.out.println((lct-p+1));
					}else{
						System.out.println((p-xct-lct));
					}
				}
			}

			T--;
		}
	}
}