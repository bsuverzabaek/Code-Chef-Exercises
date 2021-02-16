//run as java -ea guessNum
import java.util.Scanner;

public class guessNum{
	public static void main(String[] args){
		int T,k;
		long A,M,D;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=100) : "T must be 1 <= T <= 100";

		while(T>0){
			A = scan.nextLong();
			M = scan.nextLong();

			assert(M>=2 && M<=10000000000L) : "M must be 2 <= M <= 10^10";
			assert(A>=1 && A<M) : "A must be 1 <= A < M";

			k = 0;
			long[] B = new long[1000000];

			for(int i=0;i<1000000;i++){
				B[i] = 0;
			}

			for(long i=M/A;i>0;i--){
				D = M-A*i;

				if(D>i){
					break;
				}else if(D!=0){
					if(i%D==0){
						B[k++] = i;
					}
				}
			}

			System.out.println(k);

			for(int i=k-1;i>=0;i--){
				System.out.print(B[i] + " ");
			}

			System.out.println();

			T--;
		}
	}
}