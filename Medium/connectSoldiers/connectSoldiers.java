//run as java -ea connectSoldiers
import java.util.Scanner;

public class connectSoldiers{
	public static void main(String[] args){
		int T,N,M,min,max;
		Scanner scan = new Scanner(System.in);

		T = scan.nextInt();
		assert(T>=1 && T<=10) : "T must be 1 <= T <= 10";

		while(T>0){
			N = scan.nextInt();
			M = scan.nextInt();

			assert(N>=1 && N<=30) : "N must be 1 <= N <= 30";
			assert(M>=1 && M<=1000) : "M must be 1 <= M <= 1000";

			min = findMin(N);
			max = N*(N+3)/2;

			if(M<min){
				System.out.println(-1);
			}else if(M>max){
				System.out.println(M-max);
			}else{
				System.out.println(0);
			}

			T--;
		}
	}

	public static int findMin(int n){
		int first,last;

		if(n==0){
			return 0;
		}else{
			if((n&1)!=0){
				first = n/2;
				last = n/2;
			}else{
				first = n/2-1;
				last = n/2;
			}

			return ((n+1)+findMin(first)+findMin(last));
		}
	}
}